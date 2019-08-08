package com.app.producer;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.app.model.PaymentInfo;

@Path("/amazon")
public class AmazonProducer {
	@Path("/mpay")
	@POST
	@Consumes("application/json")
public String doPayment(PaymentInfo pi) {
		String msg = "To:"+pi.getCustName()
		+"Amount:"+pi.getAmt()+"from"+pi.getCustAccId()
		+"To:"+pi.getUserAccId();
		return msg;
	}
}
