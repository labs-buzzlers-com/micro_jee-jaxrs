package com.buzzlers.labs.micro.jee;

import java.util.logging.Logger;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.buzzlers.labs.micro.jee.model.User;

@Path("/users")
@ApplicationPath("/api")
public class UsersService extends Application {

    private final static Logger log = Logger.getLogger("UserService");

    @GET
    @Path("/list")
    @Produces(MediaType.TEXT_PLAIN)
    public Response list() {
        log.info("list() has been called");
        return Response.ok("Hello").build();
    }

    @GET
    @Path("/details/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Response details(@PathParam("id") Long userId) {
        log.info("details() has been called");
        return Response.ok(new User(userId, "Rafał")).build();
    }
}


