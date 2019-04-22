package webservice;
import javax.jws.WebMethod;  
import javax.jws.WebService;  
import javax.xml.ws.Endpoint;  
/** 
 *  @WebService － 它是一个注解，用在类上指定将此类发布成一个ws. 
    Endpoint – 此类为端点服务类，它的方法publish用于将一个已经添加了@WebService注解对象绑定到一个地址的端口上。 

 * @author xuemin 
 * 
 */  
@WebService  
public class HelloWebService { 

		public String HelloWord(String name){  
			return CalLogic.run(name);  
		}  

			/** 
			 *添加exclude=true后，HelloWord2()方法不会被发布 
			 * @param name 
			 * @return 
			 */  
			@WebMethod(exclude=true)  
			public String HelloWord2(String name){  
				return "Hello: "+name+"kkkk";  
			}  
			
		public static void main(String[] args) {  
		/** 
		 *参数1：服务的发布地址 
		 *参数2：服务的实现者 
		 */  
		Endpoint.publish("http://localhost:456/helloWord",new HelloWebService());  
		System.out.println("服务启动:http://localhost:456/helloWord?wsdl");
		
		}  
}