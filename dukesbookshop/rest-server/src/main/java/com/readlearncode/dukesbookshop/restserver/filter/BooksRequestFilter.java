package com.readlearncode.dukesbookshop.restserver.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by ELN on 8/2/2017.
 */
@Provider
public class BooksRequestFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

        System.err.print("This is Servler request filter");
    }
}
