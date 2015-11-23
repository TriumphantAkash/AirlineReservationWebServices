
package com.xyz.xsd.services.billpayment._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.xyz.xsd.types.message._1.ResponseHeader;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.xyz.com/xsd/types/message/1.2}ResponseHeader"/>
 *         &lt;element name="Body">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentConfirmationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="RecurrentPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
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
@XmlType(name = "", propOrder = {
    "header",
    "body"
})
@XmlRootElement(name = "BillPaymentResponse")
public class BillPaymentResponse {

    @XmlElement(name = "Header", required = true)
    protected ResponseHeader header;
    @XmlElement(name = "Body", required = true)
    protected BillPaymentResponse.Body body;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setHeader(ResponseHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link BillPaymentResponse.Body }
     *     
     */
    public BillPaymentResponse.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPaymentResponse.Body }
     *     
     */
    public void setBody(BillPaymentResponse.Body value) {
        this.body = value;
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
     *       &lt;sequence>
     *         &lt;element name="PaymentConfirmationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="RecurrentPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "paymentConfirmationID",
        "paymentDate",
        "recurrentPayment"
    })
    public static class Body {

        @XmlElement(name = "PaymentConfirmationID", required = true)
        protected String paymentConfirmationID;
        @XmlElement(name = "PaymentDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar paymentDate;
        @XmlElement(name = "RecurrentPayment")
        protected boolean recurrentPayment;

        /**
         * Gets the value of the paymentConfirmationID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentConfirmationID() {
            return paymentConfirmationID;
        }

        /**
         * Sets the value of the paymentConfirmationID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentConfirmationID(String value) {
            this.paymentConfirmationID = value;
        }

        /**
         * Gets the value of the paymentDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPaymentDate() {
            return paymentDate;
        }

        /**
         * Sets the value of the paymentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPaymentDate(XMLGregorianCalendar value) {
            this.paymentDate = value;
        }

        /**
         * Gets the value of the recurrentPayment property.
         * 
         */
        public boolean isRecurrentPayment() {
            return recurrentPayment;
        }

        /**
         * Sets the value of the recurrentPayment property.
         * 
         */
        public void setRecurrentPayment(boolean value) {
            this.recurrentPayment = value;
        }

    }

}
