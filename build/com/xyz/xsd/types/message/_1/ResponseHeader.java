
package com.xyz.xsd.types.message._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResponseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.xyz.com/xsd/types/message/1.2}ServiceTimestamp"/>
 *         &lt;element name="EventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://www.xyz.com/xsd/types/message/1.2}ServiceTimestamp"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeader", propOrder = {
    "service",
    "timestamp",
    "eventID",
    "request"
})
public class ResponseHeader {

    @XmlElement(name = "Service", namespace = "http://www.xyz.com/xsd/types/message/1.2", required = true)
    protected Service service;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "EventID")
    protected String eventID;
    @XmlElement(name = "Request", required = true)
    protected ResponseHeader.Request request;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link Service }
     *     
     */
    public Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service }
     *     
     */
    public void setService(Service value) {
        this.service = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader.Request }
     *     
     */
    public ResponseHeader.Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader.Request }
     *     
     */
    public void setRequest(ResponseHeader.Request value) {
        this.request = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{http://www.xyz.com/xsd/types/message/1.2}ServiceTimestamp"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "service",
        "timestamp"
    })
    public static class Request {

        @XmlElement(name = "Service", namespace = "http://www.xyz.com/xsd/types/message/1.2", required = true)
        protected Service service;
        @XmlElement(name = "Timestamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;

        /**
         * Gets the value of the service property.
         * 
         * @return
         *     possible object is
         *     {@link Service }
         *     
         */
        public Service getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link Service }
         *     
         */
        public void setService(Service value) {
            this.service = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

    }

}
