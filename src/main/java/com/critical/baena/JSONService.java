package com.critical.baena;


import java.io.IOException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.critical.baena.dto.CalcJsonObj;
import com.critical.baena.dto.ExceptionError;
import com.critical.baena.dto.ResponseJsonObj;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

@Path("/calculator")
public class JSONService {

    private final static Logger LOG4J = LogManager.getLogger(JSONService.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CalcJsonObj getValuesInJson() {
        CalcJsonObj calcJsonObj = new CalcJsonObj();
        calcJsonObj.setValue1(2.0);
        calcJsonObj.setValue2(3.0);
        return calcJsonObj;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CalcJsonObj getValuesIdInJson(@PathParam("id") String id, @QueryParam("name") String name) {
        CalcJsonObj calcJsonObj = new CalcJsonObj();
        double i = Double.valueOf(id);
        calcJsonObj.setValue1(i);
        calcJsonObj.setValue2(3.0);
        return calcJsonObj;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createValuesInJson(String calcJsonObj) {
        ObjectMapper mapper = new ObjectMapper();
        CalcJsonObj calcJsonObj1;
        ResponseJsonObj responseJsonObj = new ResponseJsonObj();
        try {
            calcJsonObj1 = mapper.readValue(calcJsonObj, CalcJsonObj.class);
            Calculate calculate = new Calculate(calcJsonObj1);
            responseJsonObj.setResult(calculate.calculateOperation());
            LOG4J.info(calcJsonObj1);
        } catch (IOException e) {
            ExceptionError exceptionError = new ExceptionError(e.getMessage());
            LOG4J.fatal(exceptionError.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).entity(exceptionError).type(MediaType.APPLICATION_JSON).build();
        }

        return Response.status(Response.Status.OK).entity(responseJsonObj).type(MediaType.APPLICATION_JSON).build();
    }

}
