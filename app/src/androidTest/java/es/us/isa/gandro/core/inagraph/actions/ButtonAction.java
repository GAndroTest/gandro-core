package es.us.isa.gandro.core.inagraph.actions;


import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;

/**
 * Created by japar on 17/03/2018.
 */

public class ButtonAction extends Action {

    String targetText;
    String targetClass;
    public ButtonAction(UiObject button)
    {
        super(button);
        targetText="";
        targetClass="";
    }

    public void perform() throws UiObjectNotFoundException {
        targetText=target.getText();
        targetClass=target.getClassName();
        this.target.click();
    }

    @Override
    public String toString()
    {
        return "Click Button "+targetText;
    }
}
