package com.example.model;

import java.time.Duration;

public class StatusResponseModel {

    private Duration status;

    public StatusResponseModel(Duration status) {
        this.status = status;
    }

    public Duration getStatus() {
        return status;
    }
}
