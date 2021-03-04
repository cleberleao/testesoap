
package com.aws.p218nfemitida.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSConsultarColdSincrono", targetNamespace = "http://nddigital.com.br/eForms/webservices", wsdlLocation = "http://10.164.34.213/eformswebservices/WSConsultarColdSincrono.asmx?wsdl")
public class WSConsultarColdSincrono
    extends Service
{

    private final static URL WSCONSULTARCOLDSINCRONO_WSDL_LOCATION;
    private final static WebServiceException WSCONSULTARCOLDSINCRONO_EXCEPTION;
    private final static QName WSCONSULTARCOLDSINCRONO_QNAME = new QName("http://nddigital.com.br/eForms/webservices", "WSConsultarColdSincrono");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.164.34.213/eformswebservices/WSConsultarColdSincrono.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCONSULTARCOLDSINCRONO_WSDL_LOCATION = url;
        WSCONSULTARCOLDSINCRONO_EXCEPTION = e;
    }

    public WSConsultarColdSincrono() {
        super(__getWsdlLocation(), WSCONSULTARCOLDSINCRONO_QNAME);
    }

    public WSConsultarColdSincrono(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCONSULTARCOLDSINCRONO_QNAME, features);
    }

    public WSConsultarColdSincrono(URL wsdlLocation) {
        super(wsdlLocation, WSCONSULTARCOLDSINCRONO_QNAME);
    }

    public WSConsultarColdSincrono(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCONSULTARCOLDSINCRONO_QNAME, features);
    }

    public WSConsultarColdSincrono(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSConsultarColdSincrono(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSConsultarColdSincronoSoap
     */
    @WebEndpoint(name = "WSConsultarColdSincronoSoap")
    public WSConsultarColdSincronoSoap getWSConsultarColdSincronoSoap() {
        return super.getPort(new QName("http://nddigital.com.br/eForms/webservices", "WSConsultarColdSincronoSoap"), WSConsultarColdSincronoSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSConsultarColdSincronoSoap
     */
    @WebEndpoint(name = "WSConsultarColdSincronoSoap")
    public WSConsultarColdSincronoSoap getWSConsultarColdSincronoSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://nddigital.com.br/eForms/webservices", "WSConsultarColdSincronoSoap"), WSConsultarColdSincronoSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCONSULTARCOLDSINCRONO_EXCEPTION!= null) {
            throw WSCONSULTARCOLDSINCRONO_EXCEPTION;
        }
        return WSCONSULTARCOLDSINCRONO_WSDL_LOCATION;
    }

}