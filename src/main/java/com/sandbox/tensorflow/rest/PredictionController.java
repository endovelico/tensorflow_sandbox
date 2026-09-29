package com.sandbox.tensorflow.rest;

import com.sandbox.tensorflow.service.TensorFlowService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PredictionController {

    private final TensorFlowService tensorFlowService;

    public PredictionController(
            TensorFlowService tensorFlowService) {

        this.tensorFlowService = tensorFlowService;
    }

    @PostMapping("/predict")
    public PredictionResponse predict(
            @RequestBody PredictionRequest request) {

        String prediction =
                tensorFlowService.predict(request.getValue());

        return new PredictionResponse(prediction);
    }
}
