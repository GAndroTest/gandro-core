package es.us.isa.gandro.core.inagraph.actions;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;

import java.util.Random;

import es.us.isa.gandro.core.dictionary.DictionaryBasedValueGenerator;
import es.us.isa.gandro.core.util.RandomUtils;

/**
 * Created by japar on 18/03/2018.
 */

public class TextInputGenerator extends InputGenerator {


    public void generateInput(UiObject object) {
        try {
            DictionaryBasedValueGenerator dictionary = new DictionaryBasedValueGenerator(1,1);
            object.setText(dictionary.generate().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
