package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class AppResource {
    @GET
    public String home() {
        return "Hello, World!";
    }
}
