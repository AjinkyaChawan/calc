package com.learn.ws.calculator.resources;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learn.ws.calculator.model.RequestObj;
import com.learn.ws.calculator.model.ResponseObj;
import com.learn.ws.calculator.service.CalculateService;

@Path("/test")
public class Test {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String getTime() {

    	Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return "This is current server time - " + sdf.format(cal.getTime());
		
	}
	

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RequestObj test(RequestObj obj) {
    	   return obj;
    }
    # Test comment to check git push    	
 }
