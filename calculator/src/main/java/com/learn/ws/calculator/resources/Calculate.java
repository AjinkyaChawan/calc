package com.learn.ws.calculator.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learn.ws.calculator.model.RequestObj;
import com.learn.ws.calculator.model.ResponseObj;
import com.learn.ws.calculator.service.CalculateService;

@Path("/calculate")
public class Calculate {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public ResponseObj Operate(RequestObj obj) {
    	
		if(obj.getO() == 1) {
			return CalculateService.add(obj);
		}else if(obj.getO() == 2) {
			return CalculateService.sub(obj);
		}else if(obj.getO() == 3) {
			return CalculateService.div(obj);
		}else if(obj.getO() == 4) {
			return CalculateService.mul(obj);
		}else if(obj.getO() == 5) {
			return CalculateService.fancyadd(obj);
		}else {
			return CalculateService.unidentified(obj);
		}
				

	}
}
