package es.us.isa.gandro.core.inagraph.actions;

import android.support.test.uiautomator.UiObject;

class SpinnerAction extends InputAction {

    public SpinnerAction(UiObject target, InputGenerator generator) {
        super(target, generator);
    }

    @Override
    public String toString() {
        return "selecting from spinner";
    }
}
