
package com.gmq.psp.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="greet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "greet"
})
@XmlRootElement(name = "goodbyeResponse")
public class GoodbyeResponse {

    @XmlElement(required = true)
    protected String greet;

    /**
     * Obtiene el valor de la propiedad greet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreet() {
        return greet;
    }

    /**
     * Define el valor de la propiedad greet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreet(String value) {
        this.greet = value;
    }

}
