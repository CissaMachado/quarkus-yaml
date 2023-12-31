package dev;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class HelloResource {

    @Inject
    @ConfigProperty(name = "Ifrs.pw2")
    String pw2Message;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello, " + pw2Message;
    }
}
