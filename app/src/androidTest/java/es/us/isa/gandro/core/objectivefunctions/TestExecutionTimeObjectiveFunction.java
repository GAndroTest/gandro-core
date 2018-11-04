package es.us.isa.gandro.core.objectivefunctions;

import es.us.isa.gandro.core.TestCase;

/**
 * Created by japar on 18/03/2018.
 */

public class TestExecutionTimeObjectiveFunction implements ObjectiveFunction {

    @Override
    public double evaluate(TestCase testcase) {
        long duration=-1;
        try{
            testcase.executeBefore();
            long start=System.currentTimeMillis();
            testcase.executeTest();
            duration=System.currentTimeMillis()-start;
            testcase.executeAfter();
        }catch(Exception e){

        }
        return (double)duration;
    }
}
