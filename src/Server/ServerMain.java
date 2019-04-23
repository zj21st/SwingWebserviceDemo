package Server;
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
public class ServerMain {  

		public String runCal(String command){  
			System.out.println("Զ�̷�����յ�����:"+command);
			return CalLogic.run(command);  
		}  

			/** 
			 *���exclude=true��HelloWord2()�������ᱻ���� 
			 * @param name 
			 * @return 
			 */  
			@WebMethod(exclude=true)  
			public String HelloWord2(String name){  
				return "���յ�����: "+name+"HelloWord2";  
			}  
			
		public static void main(String[] args) {  
		/** 
		 *����1������ķ�����ַ 
		 *����2�������ʵ���� 
		 */  
		Endpoint.publish("http://localhost:456/runCal",new ServerMain());  
		System.out.println("��������:http://localhost:456/runCal?wsdl");
		
		}  
}