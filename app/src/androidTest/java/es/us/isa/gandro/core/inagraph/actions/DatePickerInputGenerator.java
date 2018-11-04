package es.us.isa.gandro.core.inagraph.actions;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;

import es.us.isa.gandro.core.util.RandomUtils;

/**
 * Created by japar on 18/03/2018.
 */

public class DatePickerInputGenerator extends InputGenerator {


    public void generateInput(UiObject object) {
        //for the moment we'll generate random texts of random length.

        String text = RandomUtils.randomText(8, "0123456789"); //8 = standard Date size: ddMMYYYY
        try {
            object.setText(text);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }


}
