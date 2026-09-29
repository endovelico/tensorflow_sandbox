package com.sandbox.tensorflow.rest;

public class PredictionResponse {

    private String prediction;

    public PredictionResponse(String prediction) {
        this.prediction = prediction;
    }

    public String getPrediction() {
        return prediction;
    }
}
