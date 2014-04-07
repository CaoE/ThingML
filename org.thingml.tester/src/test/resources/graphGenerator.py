import random

class Element:
	def __init__(self):
		self.ID=None
class Content:
	def __init__(self):
		self.inputs=[]
		self.outputs = []
		self.outputsNumber = 0
		self.final=False
		self.parent=None
		Element.__init__(self)
	def accept(self,visitor):
		visitor.process(self)
	def getReachables(self,list):
		for o in self.outputs:
			if not o in list:
				list.append(o)
				list=o.getReachables(list)
		return list
	def getNonBlockers(self,list):
		for i in self.inputs:
			if not i in list:
				list.append(i)
				list=i.getNonBlockers(list)
		return list
		
class Group:
	def __init__(self):
		self.content = []
		self.init = None
		self.finalStates = []
		Element.__init__(self)
	def accept(self,visitor):
		visitor.process(self)
		for e in self.content:
			e.accept(visitor)
		visitor.finalize()
		
class Region(Group):
	def __init__(self):
		Group.__init__(self)
		self.isGroup=True
		self.isContent=False
	def dump(self):
		finals=""
		for e in self.finalStates:
			finals=finals+str(e.ID)+" "
		print("region "+str(self.ID)+" init "+str(self.init.ID)+" finals: "+finals)
		for e in self.content:
			e.dump()
class Composite(Group,Content):
	def __init__(self):
		Group.__init__(self)
		Content.__init__(self)
		self.isGroup=True
		self.isContent=True
	def dump(self):
		outputs=""
		finals=""
		for e in self.outputs:
			outputs=outputs+str(e.ID)+" "
		for e in self.finalStates:
			finals=finals+str(e.ID)+" "
		print("composite "+str(self.ID)+" to "+outputs+" init "+str(self.init.ID)+" finals: "+finals)
		for e in self.content:
			e.dump()
		print("end of composite")
		
class State(Content):
	def __init__(self):
		Content.__init__(self)
		self.isGroup=False
		self.isContent=True
	def dump(self):
		outputs=""
		for e in self.outputs:
			outputs=outputs+str(e.ID)+" "
		print("state "+str(self.ID)+" to "+outputs)

class Configuration:
	def __init__(self):#,depth,compositeRatio,):
		self.minRegion=None
		self.maxRegion=None
		self.minState=None
		self.maxState=None
		self.minOutputs=None
		self.maxOutputs=None
		self.depth=None
		self.compositeRatio=None
	def setRegions(self,minRegion,maxRegion):
		self.minRegion=minRegion
		self.maxRegion=maxRegion
	def setStates(self,minState,maxState):
		self.minState=minState
		self.maxState=maxState
	def setOutputs(self,minOutputs,maxOutputs):
		self.minOutputs=minOutputs
		self.maxOutputs=maxOutputs
	def setDepth(self,depth):
		self.depth=depth
	def setCompositeRatio(self,compositeRatio):
		self.compositeRatio=compositeRatio
	def isValid(self):
		if(self.minRegion is None or self.maxRegion is None or self.minState is None or self.maxState is None or self.minOutputs is None or self.maxOutputs is None or self.depth is None or self.compositeRatio is None):
			return False
		if(self.minRegion<1 or self.minState<1 or self.minOutputs<1 or self.depth<1 or self.minRegion>self.maxRegion or self.minState>self.maxState or self.minOutputs>self.maxOutputs or self.compositeRatio<0 or self.compositeRatio>1):
			return False
		return True
class Initializer:
	def __init__(self,conf):
		self.regions = []
		self.conf = conf
		self.currentID=0
		if conf.isValid():
			print("valid configuration!")
			for _ in range(random.randint(self.conf.minRegion,self.conf.maxRegion)):
				self.regions.append(Region())
			for r in self.regions:
				r.ID=self.currentID
				self.currentID=self.currentID+1
				r.accept(self)
			OutGenerator(conf,self.regions)
		else:
			print("invalid configuration!")
	def process(self,element):
		if element.isGroup:
			self.conf.depth = self.conf.depth-1
			for _ in range(random.randint(self.conf.minState,self.conf.maxState)):
				if self.conf.depth>0 and random.random()<self.conf.compositeRatio:
					element.content.append(Composite())
				else:
					element.content.append(State())
				element.content[-1].ID=self.currentID
				self.currentID=self.currentID+1
	def finalize(self):
		self.conf.depth = self.conf.depth+1
		
# """
class OutGenerator:
	def __init__(self,conf,regions):
		self.conf = conf
		self.regions = regions
		for r in self.regions:
			r.accept(self)
		TransitionGenerator(conf,regions)
	def process(self,element):
		if element.isGroup:
			self.conf.depth = self.conf.depth-1
			element.init = element.content[random.randint(0,len(element.content)-1)]
			for e in element.content:
				e.outputsNumber=random.randint(self.conf.minOutputs,self.conf.maxOutputs)
			if element.isContent:#thus is a composite
				for _ in range(0,element.outputsNumber):
					element.finalStates.append(element.content[random.randint(0,len(element.content)-1)])
					element.finalStates[-1].final=True
					element.finalStates[-1].parent=element
			else:#region
				element.finalStates.append(element.init)
				element.finalStates[-1].final=True
				element.finalStates[-1].parent=element
	def finalize(self):
		self.conf.depth = self.conf.depth+1
# """
class TransitionGenerator:
	def __init__(self,conf,regions):
		self.conf = conf
		self.regions = regions
		for r in self.regions:
			r.accept(self)
		TransitionSolver(conf,regions)
	def process(self,element):
		if element.isGroup:
			self.conf.depth = self.conf.depth-1
			for e in element.content:
				for _ in range(e.outputsNumber):
					newOutput=element.content[random.randint(0,len(element.content)-1)]
					e.outputs.append(newOutput)
					newOutput.inputs.append(e)
	def finalize(self):
		self.conf.depth = self.conf.depth+1
# """
class TransitionSolver:
	def __init__(self,conf,regions):
		self.regions = regions
		self.conf = conf
		for r in self.regions:
			r.accept(self)
	def process(self,element):
		if element.isGroup:
			self.conf.depth = self.conf.depth-1
			blockers=self.getBlockers(element)
			nonReachables=self.getNonReachables(element)
			while(len(blockers)>0 or len(nonReachables)>0):
				if(random.random()>0.5):
					if(len(blockers)>0):
						blocker = blockers[random.randint(0,len(blockers)-1)]
						oldOutput=blocker.outputs[random.randint(0,len(blocker.outputs)-1)]
						newOutput=element.content[random.randint(0,len(element.content)-1)]
						
						blocker.outputs.remove(oldOutput)
						oldOutput.inputs.remove(blocker)
						
						blocker.outputs.append(newOutput)
						newOutput.inputs.append(blocker)
						
				else:
					if(len(nonReachables)>0):
						reachables=element.init.getReachables([])
						switch = reachables[random.randint(0,len(reachables)-1)]
						oldOutput=switch.outputs[random.randint(0,len(switch.outputs)-1)]
						newOutput=nonReachables[random.randint(0,len(nonReachables)-1)]
						
						switch.outputs.remove(oldOutput)
						oldOutput.inputs.remove(switch)
						
						switch.outputs.append(newOutput)
						newOutput.inputs.append(switch)
				blockers=self.getBlockers(element)
				nonReachables=self.getNonReachables(element)
	def finalize(self):
		self.conf.depth = self.conf.depth+1
	def getBlockers(self,element):
		nonBlockers=[]
		for e in element.finalStates:
			for nonBlocker in e.getNonBlockers([e]):
				if nonBlocker not in nonBlockers:
					nonBlockers.append(nonBlocker)
		blockers=[]
		for e in element.content:
			if not e in nonBlockers:
				blockers.append(e)
		"""Debug dump
		print("\n\n\n")
		for r in self.regions:
			r.dump()
		print("blockers:")
		for e in blockers:
			print(str(e.ID))
		print("nonBlockers:")
		for e in nonBlockers:
			print(str(e.ID))#"""
		return blockers
	def getNonReachables(self,element):
		# return []
		reachables=element.init.getReachables([element.init])
		nonReachables=[]
		for e in element.content:
			if not e in reachables:
				nonReachables.append(e)
		"""Debug dump
		print("\n\n\n")
		for r in self.regions:
			r.dump()
		print("nonreachables:")
		for e in nonReachables:
			print(str(e.ID))
		print("reachables:")
		for e in reachables:
			print(str(e.ID))#"""
		return nonReachables
# """
class DumpThingml:
	def __init__(self,regions):
		self.regions=regions
		self.file=open("test.thingml",'w')
		self.file.write("import \"../../../../../org.thingml.samples/src/main/thingml/thingml.thingml\"\n\n\
thing BigTest includes Test\n\
{\n\
	statechart BigTest {\n")
		for r in self.regions:
			r.accept(self)
	def process(self,element):
		if element.isGroup and not element.isContent:#region
			self.file.write("region "+str(element.ID)+" init "+str(element.init.ID)+" {\n")
		elif element.isGroup:#composite
			self.file.write("composite state "+str(element.ID)+" init "+str(element.init.ID)+" {\n")
			self.file.write("property done : Boolean = false\n\n")
			i=0
			for e in element.outputs:
				self.file.write("transition -> "+str(e.ID)+"\n")
				self.file.write("event m : harness?testIn\n")
				self.file.write("guard m.c%"+str(element.outputsNumber)+" == "+str(i)+" && (")
				first = True
				for f in element.finalStates:
					if not first:
						self.file.write(" || ")
					self.file.write(str(f.ID)+".done")
					first = False
				self.file.write(")\n\n")
				i=i+1
		else:#State
			self.file.write("state "+str(element.ID)+" {\n")
			self.file.write("property done : Boolean = false\n\n")
			i=0
			if element.final:
				outputsNumber=element.outputsNumber+element.parent.finalStates.count(element)
			else:
				outputsNumber=element.outputsNumber
			for e in element.outputs:
				self.file.write("transition -> "+str(e.ID)+"\n")
				self.file.write("event m : harness?testIn\n")
				self.file.write("guard m.c%"+str(outputsNumber)+" == "+str(i)+"\n")
				if i<outputsNumber-1:
					self.file.write("\n")
				i=i+1
			
			if element.final:
				for e in element.parent.finalStates:
					if e == element:
						self.file.write("transition -> "+str(element.ID)+"\n")
						self.file.write("event m : harness?testIn\n")
						self.file.write("guard m.c%"+str(outputsNumber)+" == "+str(i)+"\n")
						self.file.write("action done = true\n")
						if i<outputsNumber-1:
							self.file.write("\n")
						i=i+1
			self.file.write("}\n")
	def finalize(self):
		self.file.write("}\n")
	
	
conf = Configuration()
conf.setRegions(1,1)
conf.setStates(2,2)
conf.setOutputs(1,2)
conf.setDepth(2)
conf.setCompositeRatio(0.8)

tree=Initializer(conf).regions
DumpThingml(tree)
print("\n\n\n")
for r in tree:
	r.dump()

# """