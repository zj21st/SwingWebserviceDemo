
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _HelloWordResponse_QNAME = new QName("http://webservice/", "HelloWordResponse");
    private final static QName _HelloWord_QNAME = new QName("http://webservice/", "HelloWord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloWordResponse }
     * 
     */
    public HelloWordResponse createHelloWordResponse() {
        return new HelloWordResponse();
    }

    /**
     * Create an instance of {@link HelloWord }
     * 
     */
    public HelloWord createHelloWord() {
        return new HelloWord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "HelloWordResponse")
    public JAXBElement<HelloWordResponse> createHelloWordResponse(HelloWordResponse value) {
        return new JAXBElement<HelloWordResponse>(_HelloWordResponse_QNAME, HelloWordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "HelloWord")
    public JAXBElement<HelloWord> createHelloWord(HelloWord value) {
        return new JAXBElement<HelloWord>(_HelloWord_QNAME, HelloWord.class, null, value);
    }

}
