package in.inspirise.test;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import in.inspirise.rave.customannotations.Loggable;


@Controller("myTestController")
public class TestController {
	@Autowired
	TestServiceIntf testService;
	
	@RequestMapping(value = { "/login" })
	public ModelAndView testModel() throws Exception{
		ModelAndView model = new ModelAndView("test");
		//throw new Exception();
		return model;
	}
	@RequestMapping("/dummy")
	@Loggable
	public String dummy(String text) throws Exception{
		FacesContext facesContext = FacesContext.getCurrentInstance();
		//System.out.println(facesContext.getAttributes().get("text").toString());
		System.out.println("inside dummy");
		System.out.println(text);
		testService.dummyTest("ghjgh");
		
		
		return "test";
	
	}
	@Loggable
	public void runMyTest(String text) throws Exception{
		
		dummy(text);
		//System.out.println("inside main");
		
	}

}
