package client;

public class classMyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     HelloWebServiceService hwss = new HelloWebServiceService();  

	     HelloWebService hws = hwss.getHelloWebServicePort();  

	     String result=hws.helloWord("200*2.6");  
	     System.out.println(result);
	}

}
