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

public interface ClaimService {
	@Produces("application/json")
	@GET
	@Path("getClaimStatus/{claimnubmer}")
	String getClaimStatus(@PathParam("claimnubmer") String claimnubmer)
			throws Exception;

}
