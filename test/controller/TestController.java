package controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.controller.DemoController;
import gov.framework.test.BaseControllerTest;
import shgjj.tqgl.business.onceBusiness.retire.controller.RetireController;

@Controller
@RequestMapping("/test")
public class TestController extends BaseControllerTest {
	
	@Autowired
	private DemoController controller;
	@Autowired
	private RetireController re;
	
	 @RequestMapping("/list")
	    public String listMaterial(){
	    	   	System.out.println("this is test.......");
	        return "demo/mydemo";
	    }    
	
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
	
	@Test
	public void testRetire1() {
		request.setMethod("GET");
		request.addParameter("tqYwMainDetail.grzh", "111");
        request.setRequestURI("/business/onceBusiness/retire/saveRetireRegister");
        try {
            ModelAndView handle = this.adapter.handle(request, response, this.re);
        } catch (Exception e) {
        	System.out.println("222");
            e.printStackTrace();
        }
	}
	@Test
	public void testRetire2() {
		request.setMethod("GET");
		request.addParameter("businessType", "1");
        request.setRequestURI("/business/onceBusiness/retire/getSysMaterialCfgByBusinessType");
        try {
            ModelAndView handle = this.adapter.handle(request, response, this.re);
        } catch (Exception e) {
        	System.out.println("222");
            e.printStackTrace();
        }
	}

}
