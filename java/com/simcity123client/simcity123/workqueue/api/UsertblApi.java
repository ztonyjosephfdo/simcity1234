package com.simcity123client.simcity123.workqueue.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;

import com.simcity123client.simcity123.workqueue.impl.*;

import com.simcity123client.simcity123.workqueue.model.*;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsertblApi {

UsertblImpl usertblObj = new UsertblImpl();

  @GET
  @Path("/USERTBL")
	public Response getUsertbl(@QueryParam("input") String jsonstring)
	{
    Gson gson  = new Gson();
Usertbl usertbl=(Usertbl) gson.fromJson(jsonstring,Usertbl.class);

    List output=new ArrayList();
    try{
	       output=usertblObj.getUsertbl(usertbl);
      }catch(Exception e){
			e.printStackTrace();
 	    }
     return Response.ok().entity(output).build();
	}

}