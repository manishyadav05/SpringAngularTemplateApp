package com.epcor.appservices.servlet;

import com.epcor.appservices.model.AppObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NavigationController {


	@RequestMapping(value={"/", "index", "serviceNow"}, method=RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");
	}


	@RequestMapping(value = {"/getJsonObject"}, method=RequestMethod.GET)
	public @ResponseBody AppObject getAppObject(){
		AppObject ao = new AppObject();
		ao.setTitle("AppServicesSupportApplicaiton");
        return ao;
	}

    @RequestMapping(value = {"/postJsonObject"}, method=RequestMethod.POST)
    public @ResponseBody AppObject postJsonObject(@RequestBody AppObject ao){
        return ao;
    }


	
}
