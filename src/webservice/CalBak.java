package webservice;
import javax.jws.WebMethod;  
import javax.jws.WebService;  
import javax.xml.ws.Endpoint;  
/** 
 *  @WebService �� ����һ��ע�⣬��������ָ�������෢����һ��ws. 
    Endpoint �C ����Ϊ�˵�����࣬���ķ���publish���ڽ�һ���Ѿ������@WebServiceע�����󶨵�һ����ַ�Ķ˿��ϡ� 

 * @author xuemin 
 * 
 */  
@WebService  
public class CalBak {  

		public String runCal(String name){  
			return "Hello: "+name;  
		}  

			/** 
			 *���exclude=true��HelloWord2()�������ᱻ���� 
			 * @param name 
			 * @return 
			 */  
			@WebMethod(exclude=true)  
			public String HelloWord2(String name){  
				return "Hello: "+name+"kkkk";  
			}  
			
		public static void main(String[] args) {  
		/** 
		 *����1������ķ�����ַ 
		 *����2�������ʵ���� 
		 */  
		Endpoint.publish("http://localhost:456/helloWord",new CalBak());  
		System.out.println("��������:http://localhost:456/helloWord?wsdl");
		
		}  
}