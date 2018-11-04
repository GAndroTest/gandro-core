package es.us.isa.gandro.core;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObjectNotFoundException;

import es.us.isa.gandro.core.algorithms.Algorithm;
import es.us.isa.gandro.core.inagraph.INAGraph;
import es.us.isa.gandro.core.inagraph.INAGraphBuilder;

public class EntryPoint {

    public static void runTest(UiDevice mDevice, String appName, Algorithm algorithm) throws UiObjectNotFoundException {

        INAGraph graph = INAGraphBuilder.getInstance().build(mDevice, appName);
        TestCase testCase = algorithm.run(graph, appName);
        System.out.println("Test case found: " + testCase);
        System.out.println("Runnig it...");
        testCase.executeBefore();
        testCase.executeTest();
        testCase.executeAfter();
        System.out.println("Done!");
    }
}
