<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*,org.springframework.core.io.*,org.springframework.core.io.support.*,net.sf.cglib.proxy.*,java.lang.reflect.*"%>

<%@include file="../header_nocache.jsp"%>

<%

   String tcode=request.getParameter("tcode");
   //System.out.println(tcode);
   ClassPathResource resource=new ClassPathResource("demo_dic.properties");
   Properties prop=PropertiesLoaderUtils.loadProperties(resource);
   prop.load(resource.getInputStream());
   prop=(Properties) (new PropertiesProxy()).getProperties(Properties.class, prop);
   //System.out.println(prop);
   String json=prop.getProperty(tcode);
   //System.out.println("ddddd:"+json);

   out.print(json);

%>

<%!

class PropertiesProxy implements MethodInterceptor{
    private Object properties=null;
    private Enhancer enhancer=new Enhancer();

    //生成子类
    public Object getProperties(Class clz,Object properties)
    {
        this.properties = properties;
        enhancer.setSuperclass(clz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

   //默认拦截子类
   public Object intercept(Object o,Method method,Object[] args,MethodProxy proxy) throws Throwable
   {
        Object result=proxy.invoke(properties, args);
        if(method.getName().equals("getProperty")){
			if(result==null)
				return "";
        	String temp=(String)result;
			System.out.println("tttteeeemmmmpppp:"+temp);
        	String newStr = new String(temp.getBytes("ISO-8859-1"),"UTF-8");
			return newStr;
        }
        return result;
   }
}


%>
