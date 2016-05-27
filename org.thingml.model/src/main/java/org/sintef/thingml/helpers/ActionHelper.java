/**
 * Copyright (C) 2014 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sintef.thingml.helpers;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.sintef.thingml.Action;
import org.sintef.thingml.Expression;
import org.sintef.thingml.ThingMLElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ffl on 03.05.2016.
 */
public class ActionHelper {


    public static List<Action> getAllActions(ThingMLElement self, Class clazz) {
        List<Action> result = new ArrayList<Action>();

        TreeIterator<EObject> it = self.eAllContents();
        while(it.hasNext()) {
            EObject o = it.next();
            if (clazz.isInstance(o)) result.add((Action) o);
        }

        if (clazz.isInstance(self)) result.add((Action)self);
        return result;
    }


    public static List<Action> getAllActions(ThingMLElement self) {
       return getAllActions(self, Action.class);
    }

}
