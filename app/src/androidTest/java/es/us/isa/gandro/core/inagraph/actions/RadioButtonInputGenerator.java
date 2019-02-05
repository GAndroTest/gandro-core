package es.us.isa.gandro.core.inagraph.actions;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.widget.RadioButton;

import java.util.Random;

/**
 * Created by japar on 18/03/2018.
 */

public class RadioButtonInputGenerator extends InputGenerator {


    public void generateInput(UiObject target) throws UiObjectNotFoundException {
        Integer selectedRadioButton = new Random().nextInt(target.getChildCount());
        UiObject dataValue = target.getChild(new UiSelector().className(RadioButton.class.getName()).index(selectedRadioButton));
        dataValue.click();
    }
}
