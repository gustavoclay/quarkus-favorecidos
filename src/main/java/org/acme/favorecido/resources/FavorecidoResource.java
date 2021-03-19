package org.acme.favorecido.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.favorecido.models.entities.Favorecido;
import org.acme.favorecido.services.FavorecidoService;

@Path("/favorecidos")
public class FavorecidoResource {

    @Inject
    private FavorecidoService service;

    @GET
    @Path("{cpf}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Favorecido> getFavorecidos(@PathParam("cpf") String cpf) {
        return service.getFavorecidos(cpf);

    }

}