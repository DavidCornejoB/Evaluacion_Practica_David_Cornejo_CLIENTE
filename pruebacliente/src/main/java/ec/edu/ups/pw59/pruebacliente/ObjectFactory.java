
package ec.edu.ups.pw59.pruebacliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.pw59.pruebacliente package. 
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

    private final static QName _GetObra_QNAME = new QName("http://services.prueba.pw59.ups.edu.ec/", "getObra");
    private final static QName _GetObraResponse_QNAME = new QName("http://services.prueba.pw59.ups.edu.ec/", "getObraResponse");
    private final static QName _InsertarObra_QNAME = new QName("http://services.prueba.pw59.ups.edu.ec/", "insertarObra");
    private final static QName _InsertarObraResponse_QNAME = new QName("http://services.prueba.pw59.ups.edu.ec/", "insertarObraResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.pw59.pruebacliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetObra }
     * 
     */
    public GetObra createGetObra() {
        return new GetObra();
    }

    /**
     * Create an instance of {@link GetObraResponse }
     * 
     */
    public GetObraResponse createGetObraResponse() {
        return new GetObraResponse();
    }

    /**
     * Create an instance of {@link InsertarObra }
     * 
     */
    public InsertarObra createInsertarObra() {
        return new InsertarObra();
    }

    /**
     * Create an instance of {@link InsertarObraResponse }
     * 
     */
    public InsertarObraResponse createInsertarObraResponse() {
        return new InsertarObraResponse();
    }

    /**
     * Create an instance of {@link Obra }
     * 
     */
    public Obra createObra() {
        return new Obra();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObra }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObra }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.prueba.pw59.ups.edu.ec/", name = "getObra")
    public JAXBElement<GetObra> createGetObra(GetObra value) {
        return new JAXBElement<GetObra>(_GetObra_QNAME, GetObra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.prueba.pw59.ups.edu.ec/", name = "getObraResponse")
    public JAXBElement<GetObraResponse> createGetObraResponse(GetObraResponse value) {
        return new JAXBElement<GetObraResponse>(_GetObraResponse_QNAME, GetObraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarObra }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarObra }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.prueba.pw59.ups.edu.ec/", name = "insertarObra")
    public JAXBElement<InsertarObra> createInsertarObra(InsertarObra value) {
        return new JAXBElement<InsertarObra>(_InsertarObra_QNAME, InsertarObra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarObraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarObraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.prueba.pw59.ups.edu.ec/", name = "insertarObraResponse")
    public JAXBElement<InsertarObraResponse> createInsertarObraResponse(InsertarObraResponse value) {
        return new JAXBElement<InsertarObraResponse>(_InsertarObraResponse_QNAME, InsertarObraResponse.class, null, value);
    }

}
