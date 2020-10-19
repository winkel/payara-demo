package com.example.config;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/web-api")
@ApplicationScoped
public class DemoRestApplication extends Application {

}
