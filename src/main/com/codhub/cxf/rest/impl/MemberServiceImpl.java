/**
 * 
 */
package com.codhub.cxf.rest.impl;

import com.codhub.cxf.rest.MemberService;

/**
 * @author CodHub
 * 
 */
public class MemberServiceImpl implements MemberService {

	@Override
	public String getMember(String name) throws Exception {
		return name;
	}

}
