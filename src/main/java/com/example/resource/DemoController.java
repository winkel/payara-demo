package com.example.resource;

import com.example.model.StatusResponseModel;
import com.example.services.MainAppService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("demo")
@RequestScoped
public class DemoController {

    @Inject
    private MainAppService appService;

    @Inject
    @ConfigProperty(name = "number.of.processors")
    private Provider<Integer> numberOfProcessors;

    @GET
    @Path(value = "status")
    public Response getStatus() {
        System.out.println(numberOfProcessors.get());

        return Response
                .status(Response.Status.OK)
                .entity(new StatusResponseModel(appService.getDuration()))
                .build();
    }
}
