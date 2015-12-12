/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.camluc.newsfinderapi;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Cam
 */
@Path("articles")
public class ArticlesResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ArticlesResource
     */
    public ArticlesResource() {
    }

    /**
     * Retrieves representation of an instance of
     * net.camluc.newsfinderapi.ArticlesResource
     *
     * @param query
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@QueryParam("q") String query) {
        ArticlesRestClient client = new ArticlesRestClient();
        return client.search(query);
    }
}
