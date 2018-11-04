package es.us.isa.gandro.core.algorithms;

import android.support.test.uiautomator.UiObjectNotFoundException;

import es.us.isa.gandro.core.TestCase;
import es.us.isa.gandro.core.inagraph.INAGraph;

public interface Algorithm {

    TestCase run(INAGraph graph, String app) throws UiObjectNotFoundException;

}
