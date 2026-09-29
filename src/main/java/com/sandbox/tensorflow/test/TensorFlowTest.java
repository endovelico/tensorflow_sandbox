package com.sandbox.tensorflow.test;

import org.tensorflow.TensorFlow;

public class TensorFlowTest {

    public static void main(String[] args) {
        System.out.println(
                "TensorFlow version: " + TensorFlow.version()
        );
    }
}