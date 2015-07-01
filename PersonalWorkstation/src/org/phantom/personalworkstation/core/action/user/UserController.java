package org.phantom.personalworkstation.core.action.user;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import org.phantom.personalworkstation.entity.UserLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;  

@Controller
@RequestMapping("/User")
public class UserController {  
	@RequestMapping(value="/Regist",method=RequestMethod.GET)
    public ModelAndView Regist(){  
		return new ModelAndView("Regist");
    }  
	
	@RequestMapping(value="/Regist",method=RequestMethod.POST)
    public ModelAndView Regist(@RequestParam UserLogin userLogin){  
		return new ModelAndView("Regist");
    }  
}  