/*****************************************************
 *      THIS IS A GENERATED FILE. DO NOT EDIT.   SINTEFBOARD_MAIN.C
 *      Implementation for Application /*NAME*/
 *  Generated from ThingML (http://www.thingml.org)
 *****************************************************/

/*C_HEADERS*/


/*C_GLOBALS*/

// START OF ****** RUNTIME_CLASS
/*RUNTIME_CLASS*/

// START OF ****** CODE
/*CODE*/

// START OF ****** CONFIGURATION
/*CONFIGURATION*/

void /*CFG_CPPNAME_SCOPE*/setup() {
/*THING_INIT_CODE*/
/*INIT_CODE*/
}

void /*CFG_CPPNAME_SCOPE*/loop() {

    int loop_counter = 0;
    int more_to_process = 1;  // Added loop to process all fifo content
    while (more_to_process == 1) {
        loop_counter++;
        if (loop_counter > 1) printf("loop_count : %d\n", loop_counter);

/*POLL_CODE*/

        more_to_process = processMessageQueue();
    }

}
