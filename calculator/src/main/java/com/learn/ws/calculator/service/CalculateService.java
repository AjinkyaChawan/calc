package com.learn.ws.calculator.service;

import com.learn.ws.calculator.model.RequestObj;
import com.learn.ws.calculator.model.ResponseObj;


public class CalculateService {

	public static ResponseObj add(RequestObj obj) {
        
		ResponseObj resobj = new ResponseObj();
		resobj.setC(obj.getA()+obj.getB());
		return resobj;			

	}

	public static ResponseObj sub(RequestObj obj) {

		ResponseObj resobj = new ResponseObj();
		resobj.setC(obj.getA()-obj.getB());
		return resobj;				

	}
	
	public static ResponseObj div(RequestObj obj) {

		ResponseObj resobj = new ResponseObj();
		resobj.setC(obj.getA()/obj.getB());
		return resobj;			

	}
	
	public static ResponseObj mul(RequestObj obj) {

		ResponseObj resobj = new ResponseObj();
		resobj.setC(obj.getA()*obj.getB());
		return resobj;				

	}

	public static ResponseObj unidentified(RequestObj obj) {
		
		ResponseObj resobj = new ResponseObj();
		resobj.setErrmssg("Unidentified operation requested");
		return resobj;			

	}

}
