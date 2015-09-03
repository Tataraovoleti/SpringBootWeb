/**
 * 
 */
package com.tata.springboot.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oletit
 *
 */
@RestController
@RequestMapping("/rest")
public class RestEndPoint {
	
	@RequestMapping(value="/getName", method=RequestMethod.GET)
	public Map<String,String> getRestService(Map<String,String> map){
		
		map.put("Name","Tatarao Oleti");
		
		return map;
	}

}
