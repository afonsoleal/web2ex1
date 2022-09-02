package br.com.bb.t99.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import br.com.bb.t99.services.HorarioService;

@Path("/hello")
@RequestScoped
public class HelloWorldResources {
    @Inject
    HorarioService horario;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello() {
        return ok("Hello!");
    }

    @GET
    @Path("/{nome}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response helloNome(@PathParam("nome") String nome) {
        return ok("Hello, " + nome + "!");
    }

    @GET
    @Path("/{nome}/horario")
    @Produces(MediaType.TEXT_PLAIN)
    public Response helloHorario(@PathParam("nome") String nome) {
        return ok(
            "Hello, " + nome + "! Agora são " + horario + ", não esqueça!"
        );
    }

    private Response ok(Object entity) {
        return Response.status(Response.Status.OK).entity(entity).build();
    }
}