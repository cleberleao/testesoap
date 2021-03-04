
package com.aws.p218nfemitida.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultarStatusSincronoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarStatusSincronoResult"
})
@XmlRootElement(name = "ConsultarStatusSincronoResponse")
public class ConsultarStatusSincronoResponse {

    @XmlElement(name = "ConsultarStatusSincronoResult")
    protected String consultarStatusSincronoResult;

    /**
     * Obtém o valor da propriedade consultarStatusSincronoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultarStatusSincronoResult() {
        return consultarStatusSincronoResult;
    }

    /**
     * Define o valor da propriedade consultarStatusSincronoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultarStatusSincronoResult(String value) {
        this.consultarStatusSincronoResult = value;
    }

}
