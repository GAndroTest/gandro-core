package es.us.isa.gandro.core.inagraph.actions;

import android.support.test.uiautomator.UiObject;

class DatePickerAction extends InputAction {
    public DatePickerAction(UiObject target, InputGenerator generator) {
        super(target, generator);
    }

    @Override
    public String toString() {
        return "introducing new date";
    }
}
