package com.gmq.psp.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-02-14T00:16:57.654+01:00
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://www.example.org/helloWorldPSP/", name = "helloWorldPSP")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorldPSP {

    @WebMethod(action = "http://www.example.org/helloWorldPSP/hello")
    @RequestWrapper(localName = "hello", targetNamespace = "http://www.example.org/helloWorldPSP/", className = "com.gmq.psp.soap.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://www.example.org/helloWorldPSP/", className = "com.gmq.psp.soap.HelloResponse")
    @WebResult(name = "greet", targetNamespace = "")
    public java.lang.String hello(

        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );
}