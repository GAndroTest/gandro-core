package es.us.isa.gandro.core.inagraph.actions;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;


public abstract class InputGenerator {

    public abstract void generateInput(UiObject object) throws UiObjectNotFoundException;
}
