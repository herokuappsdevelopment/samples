package org.seedstack.samples.seed.rest;

import org.seedstack.samples.seed.guice.Greeter;
import org.seedstack.seed.rest.Rel;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeter")
public class MyResource {
    @Inject
    private Greeter greeter;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    @Rel(value = "greeter", home = true)
    public String doGet(@PathParam("name") String name) {
        return greeter.greet(name);
    }
}