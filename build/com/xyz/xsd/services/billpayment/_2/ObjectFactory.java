
package com.xyz.xsd.services.billpayment._2;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xyz.xsd.services.billpayment._2 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xyz.xsd.services.billpayment._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BillPaymentRequest }
     * 
     */
    public BillPaymentRequest createBillPaymentRequest() {
        return new BillPaymentRequest();
    }

    /**
     * Create an instance of {@link BillPaymentResponse }
     * 
     */
    public BillPaymentResponse createBillPaymentResponse() {
        return new BillPaymentResponse();
    }

    /**
     * Create an instance of {@link BillPaymentRequest.Body }
     * 
     */
    public BillPaymentRequest.Body createBillPaymentRequestBody() {
        return new BillPaymentRequest.Body();
    }

    /**
     * Create an instance of {@link BillPaymentResponse.Body }
     * 
     */
    public BillPaymentResponse.Body createBillPaymentResponseBody() {
        return new BillPaymentResponse.Body();
    }

}
