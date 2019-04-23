
package client.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServerMain", targetNamespace = "http://Server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServerMain {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "runCal", targetNamespace = "http://Server/", className = "client.ejb.RunCal")
    @ResponseWrapper(localName = "runCalResponse", targetNamespace = "http://Server/", className = "client.ejb.RunCalResponse")
    @Action(input = "http://Server/ServerMain/runCalRequest", output = "http://Server/ServerMain/runCalResponse")
    public String runCal(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}