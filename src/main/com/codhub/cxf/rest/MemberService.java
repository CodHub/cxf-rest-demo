/**
 * 
 */
package com.codhub.cxf.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @author CodHub
 * 
 */
@Path("member")
public interface MemberService {

	@GET
	@Path("member/{name}")
	String getMember(@PathParam("name") String name) throws Exception;

}
