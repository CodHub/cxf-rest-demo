/**
 * 
 */

package com.codhub.cxf.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author CodHub
 * 
 */
public interface MemberService {
	@Produces("application/json")
	@GET
	@Path("getMember/{name}")
	String getMember(@PathParam("name") String name) throws Exception;

}
