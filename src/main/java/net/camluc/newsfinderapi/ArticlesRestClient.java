/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.camluc.newsfinderapi;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Cam
 */
public class ArticlesRestClient {

    private static final String SERVICE_URL = "http://api.nytimes.com/svc/search/v2/articlesearch.json";
    private static final String API_KEY = "ea87f72c57043c2ee65d25734c29a538:19:73698956";
    private final Client client = ClientBuilder.newClient();

    public String search(final String query) {
        return client.target(SERVICE_URL)
                .queryParam("api-key", API_KEY)
                .queryParam("q", query)
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
    }
}
