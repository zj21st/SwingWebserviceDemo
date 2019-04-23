
package client.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.ejb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RunCal_QNAME = new QName("http://Server/", "runCal");
    private final static QName _RunCalResponse_QNAME = new QName("http://Server/", "runCalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RunCalResponse }
     * 
     */
    public RunCalResponse createRunCalResponse() {
        return new RunCalResponse();
    }

    /**
     * Create an instance of {@link RunCal }
     * 
     */
    public RunCal createRunCal() {
        return new RunCal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunCal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "runCal")
    public JAXBElement<RunCal> createRunCal(RunCal value) {
        return new JAXBElement<RunCal>(_RunCal_QNAME, RunCal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunCalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "runCalResponse")
    public JAXBElement<RunCalResponse> createRunCalResponse(RunCalResponse value) {
        return new JAXBElement<RunCalResponse>(_RunCalResponse_QNAME, RunCalResponse.class, null, value);
    }

}
