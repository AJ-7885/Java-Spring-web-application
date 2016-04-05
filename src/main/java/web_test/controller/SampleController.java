package web_test.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("smapleController")
public class SampleController {
	// ~~~~~~~~~~~~~~~~~~~~~~~ public methods ~~~~~~~~~~~~~~~~~~~~~~~~~~

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	@ResponseBody
	public String zzz() {
		return "sssss";
	}
	

	@RequestMapping(value="/userPreference/{param}" , method=RequestMethod.GET )
	@ResponseBody
	public String getMsg(@PathVariable("param") String msg) {
 
		String output = ": " + msg;
 
		return "OUTPUT WILL BE:"+ output;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~ protected methods ~~~~~~~~~~~~~~~~~~~~~~~

	// ~~~~~~~~~~~~~~~~~~~~~~~ private methods ~~~~~~~~~~~~~~~~~~~~~~~~~
}
