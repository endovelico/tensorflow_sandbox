package com.sandbox.tensorflow.service;

import org.springframework.stereotype.Service;

@Service
public class TensorFlowService {

    public String predict(float value) {

        if (value >= 0) {
            return "positive";
        }

        return "negative";
    }
}
