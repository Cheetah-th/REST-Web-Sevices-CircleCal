/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.StringWriter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXB;
import Result

/**
 * REST Web Service
 *
 * @author Cheetah
 */
import model.Result;
@Path("circle")
public class CircleCal {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CircleCal
     */
    public CircleCal() {
    }

    /**
     * Retrieves representation of an instance of service.CircleCal
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{radius}")
    @Produces(MediaType.APPLICATION_XML)
    public String getXml(@PathParam("radius") double r) {
        double area = 3.14 * (r * r);
        double lineCircle = 2 * 3.14 * r;
        StringWriter writer = new StringWriter();
        Result result = new Result();
        result.setArea(area);
        result.setLineCircle(lineCircle);
        JAXB.marshal(result, writer);
        return writer.toString();
        
    }

    /**
     * PUT method for updating or creating an instance of CircleCal
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
