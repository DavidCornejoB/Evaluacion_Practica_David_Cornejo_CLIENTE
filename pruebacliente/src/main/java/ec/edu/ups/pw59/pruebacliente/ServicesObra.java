package ec.edu.ups.pw59.pruebacliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.4
 * 2022-02-01T12:31:41.880-05:00
 * Generated source version: 3.4.4
 *
 */
@WebService(targetNamespace = "http://services.prueba.pw59.ups.edu.ec/", name = "ServicesObra")
@XmlSeeAlso({ObjectFactory.class})
public interface ServicesObra {

    @WebMethod
    @RequestWrapper(localName = "insertarObra", targetNamespace = "http://services.prueba.pw59.ups.edu.ec/", className = "ec.edu.ups.pw59.pruebacliente.InsertarObra")
    @ResponseWrapper(localName = "insertarObraResponse", targetNamespace = "http://services.prueba.pw59.ups.edu.ec/", className = "ec.edu.ups.pw59.pruebacliente.InsertarObraResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String insertarObra(

        @WebParam(name = "arg0", targetNamespace = "")
        ec.edu.ups.pw59.pruebacliente.Obra arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getObra", targetNamespace = "http://services.prueba.pw59.ups.edu.ec/", className = "ec.edu.ups.pw59.pruebacliente.GetObra")
    @ResponseWrapper(localName = "getObraResponse", targetNamespace = "http://services.prueba.pw59.ups.edu.ec/", className = "ec.edu.ups.pw59.pruebacliente.GetObraResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ec.edu.ups.pw59.pruebacliente.Obra> getObra()
;
}
