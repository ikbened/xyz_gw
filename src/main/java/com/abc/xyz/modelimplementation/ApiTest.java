package com.abc.xyz.modelimplementation;

import com.abc.xyz.ApiState;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GraphWalker(value = "random(time_duration(3))", start = "e_Init")
public class ApiTest extends ExecutionContext implements ApiState {
    private static Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Override
    public void v_Api() {
        logger.info("");
    }

    @Override
    public void v_Operator() {
        logger.info("");
    }

    @Override
    public void e_Init() {
        logger.info("");
    }
}


