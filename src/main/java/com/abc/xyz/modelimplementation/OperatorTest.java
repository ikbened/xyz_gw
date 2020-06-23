package com.abc.xyz.modelimplementation;

import com.abc.xyz.OperatorState;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GraphWalker(value = "weighted_random(time_duration(3))")
public class OperatorTest extends ExecutionContext implements OperatorState {
    private static Logger logger = LoggerFactory.getLogger(OperatorTest.class);

    public void v_Api() {
    }

    @Override
    public void v_Timeout(){
        logger.info("");
    }

    @Override
    public void v_Operator() {
        logger.info("");
    }
}
