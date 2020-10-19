package com.example.services;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import java.time.Duration;
import java.time.LocalDateTime;

@ApplicationScoped
public class MainAppService {

    private LocalDateTime startTimestamp;

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        this.startTimestamp = LocalDateTime.now();
    }

    public Duration getDuration() {
        LocalDateTime periodEnd = LocalDateTime.now();
        return Duration.between(this.startTimestamp, periodEnd);
    }
}
