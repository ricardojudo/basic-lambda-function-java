package com.example.lambda.demo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class BasicLambdaFunctionHandlerTest {

    private static Integer[] input;

    @BeforeClass
    public static void createInput() throws IOException {
        input = new Integer[]{1,2,3,4,5};
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }

    @Test
    public void testHelloFunctionHandler() {
        BasicLambdaFunctionHandler handler = new BasicLambdaFunctionHandler();
        Context ctx = createContext();

        int output = handler.handleRequest(input, ctx);

        // TODO: validate output here if needed.
        Assert.assertEquals(15, output);
    }
}
