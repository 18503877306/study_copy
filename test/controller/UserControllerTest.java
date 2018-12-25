package controller;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import demo.controller.DemoController;
import gov.framework.test.BaseControllerTest;

public class UserControllerTest extends BaseControllerTest {

	@Autowired
	private DemoController controller;
	
	@Test
	public void test(){
		request.setMethod("GET");
		request.addParameter("page", "1");
		request.addParameter("rows", "10");
        request.setRequestURI("/hello/hello");
        try {
            ModelAndView handle = this.adapter.handle(request, response, this.controller);
        } catch (Exception e) {
        	System.out.println("222");
            e.printStackTrace();
        }
	}
}
