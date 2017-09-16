package com.readlearncode.dukesbookshop.restserver.filter;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;
import java.io.IOException;

/**
 * Created by ELN on 8/2/2017.
 */
public class BoooksWriterInterceptor implements WriterInterceptor{
    @Override
    public void aroundWriteTo(WriterInterceptorContext context) throws IOException, WebApplicationException {


    }
}
