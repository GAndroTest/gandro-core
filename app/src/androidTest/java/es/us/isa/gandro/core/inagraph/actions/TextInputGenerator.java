package es.us.isa.gandro.core.inagraph.actions;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;

import java.util.Random;

import es.us.isa.gandro.core.util.RandomUtils;

/**
 * Created by japar on 18/03/2018.
 */

public class TextInputGenerator extends InputGenerator {


    public void generateInput(UiObject object) {
        //for the moment we'll generate random texts of random length.
        String text = RandomUtils.randomText(new Random().nextInt());
        try {
            object.setText(text);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }



}
