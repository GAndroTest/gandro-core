package es.us.isa.gandro;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObjectNotFoundException;

import org.junit.Test;

import es.us.isa.gandro.core.EntryPoint;
import es.us.isa.gandro.core.TestCase;
import es.us.isa.gandro.core.inagraph.INAGraph;
import es.us.isa.gandro.core.inagraph.INAGraphBuilder;
import es.us.isa.gandro.core.algorithms.RandomSearch;
import es.us.isa.gandro.core.objectivefunctions.ApplicationCrashObjectiveFunction;
import es.us.isa.gandro.core.objectivefunctions.ObjectiveFunction;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * Created by japar on 17/03/2018.
 */

public class RandomSearchForAbruptShutdown {

    @Test
    public void test1() throws UiObjectNotFoundException, InterruptedException {
        UiDevice mDevice;
        mDevice = UiDevice.getInstance(getInstrumentation());
        
        ObjectiveFunction abruptShutdown = new ApplicationCrashObjectiveFunction();
        RandomSearch algorithm = new RandomSearch(abruptShutdown, 100, 3);
        EntryPoint.runTest(mDevice, "com.example.testingandroid2", algorithm);
    }


}
