
package org.hvk.adapter.iso8583.generated.jaxb;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="Header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="MIT" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="MessageHeader" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fields">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Field1">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field2">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field3">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field4">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field5">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field6">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field7">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field8">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field9">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field10">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field11">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field12">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field13">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field14">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field15">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field16">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field17">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field18">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field19">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field20">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field21">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field22">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field23">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field24">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field25">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field26">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field27">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field28">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field29">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field30">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field31">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field32">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field33">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field34">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field35">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field36">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field37">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field38">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field39">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field40">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field41">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field42">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field43">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field44">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field45">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field46">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field47">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field48">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field49">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field50">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field51">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field52">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field53">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field54">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field55">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field56">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field57">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field58">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field59">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field60">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field61">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field62">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field63">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field64">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field65">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field66">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field67">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field68">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field69">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field70">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field71">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field72">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field73">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field74">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field75">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field76">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field77">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field78">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field79">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field80">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field81">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field82">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field83">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field84">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field85">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field86">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field87">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field88">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field89">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field90">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field91">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field92">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field93">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field94">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field95">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field96">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field97">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field98">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field99">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field100">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field101">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field102">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field103">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field104">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field105">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field106">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field107">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field108">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field109">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field110">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field111">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field112">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field113">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field114">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field115">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field116">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field117">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field118">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field119">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field120">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field121">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field122">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field123">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field124">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field125">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field126">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field127">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Field128">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder =
    { "header", "fields" })
@XmlRootElement(name = "ISO8583")
public class ISO8583
{

  @XmlElement(name = "Header", required = true)
  protected ISO8583.Header header;
  @XmlElement(name = "Fields", required = true)
  protected ISO8583.Fields fields;

  /**
   * Gets the value of the header property.
   *
   * @return
   *     possible object is
   *     {@link ISO8583 .Header }
   *
   */
  public ISO8583.Header getHeader()
  {
    return header;
  }

  /**
   * Sets the value of the header property.
   *
   * @param value
   *     allowed object is
   *     {@link ISO8583 .Header }
   *
   */
  public void setHeader(ISO8583.Header value)
  {
    this.header = value;
  }

  /**
   * Gets the value of the fields property.
   *
   * @return
   *     possible object is
   *     {@link ISO8583 .Fields }
   *
   */
  public ISO8583.Fields getFields()
  {
    return fields;
  }

  /**
   * Sets the value of the fields property.
   *
   * @param value
   *     allowed object is
   *     {@link ISO8583 .Fields }
   *
   */
  public void setFields(ISO8583.Fields value)
  {
    this.fields = value;
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
   *         &lt;element name="Field1">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field2">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field3">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field4">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field5">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field6">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field7">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field8">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field9">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field10">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field11">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field12">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field13">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field14">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field15">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field16">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field17">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field18">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field19">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field20">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field21">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field22">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field23">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field24">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field25">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field26">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field27">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field28">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field29">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field30">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field31">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field32">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field33">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field34">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field35">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field36">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field37">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field38">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field39">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field40">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field41">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field42">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field43">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field44">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field45">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field46">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field47">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field48">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field49">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field50">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field51">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field52">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field53">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field54">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field55">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field56">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field57">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field58">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field59">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field60">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field61">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field62">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field63">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field64">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field65">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field66">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field67">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field68">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field69">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field70">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field71">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field72">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field73">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field74">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field75">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field76">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field77">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field78">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field79">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field80">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field81">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field82">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field83">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field84">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field85">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field86">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field87">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field88">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field89">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field90">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field91">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field92">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field93">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field94">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field95">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field96">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field97">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field98">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field99">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field100">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field101">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field102">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field103">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field104">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field105">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field106">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field107">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field108">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field109">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field110">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field111">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field112">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field113">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field114">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field115">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field116">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field117">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field118">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field119">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field120">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field121">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field122">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field123">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field124">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field125">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field126">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field127">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Field128">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
   *                 &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
   *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/extension>
   *             &lt;/simpleContent>
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
  @XmlType(name = "", propOrder =
      { "field1", "field2", "field3", "field4", "field5", "field6",
        "field7", "field8", "field9", "field10", "field11", "field12",
        "field13", "field14", "field15", "field16", "field17", "field18",
        "field19", "field20", "field21", "field22", "field23", "field24",
        "field25", "field26", "field27", "field28", "field29", "field30",
        "field31", "field32", "field33", "field34", "field35", "field36",
        "field37", "field38", "field39", "field40", "field41", "field42",
        "field43", "field44", "field45", "field46", "field47", "field48",
        "field49", "field50", "field51", "field52", "field53", "field54",
        "field55", "field56", "field57", "field58", "field59", "field60",
        "field61", "field62", "field63", "field64", "field65", "field66",
        "field67", "field68", "field69", "field70", "field71", "field72",
        "field73", "field74", "field75", "field76", "field77", "field78",
        "field79", "field80", "field81", "field82", "field83", "field84",
        "field85", "field86", "field87", "field88", "field89", "field90",
        "field91", "field92", "field93", "field94", "field95", "field96",
        "field97", "field98", "field99", "field100", "field101",
        "field102", "field103", "field104", "field105", "field106",
        "field107", "field108", "field109", "field110", "field111",
        "field112", "field113", "field114", "field115", "field116",
        "field117", "field118", "field119", "field120", "field121",
        "field122", "field123", "field124", "field125", "field126",
        "field127", "field128" })
  public static class Fields
  {

    @XmlElement(name = "Field1", required = true)
    protected ISO8583.Fields.Field1 field1;
    @XmlElement(name = "Field2", required = true)
    protected ISO8583.Fields.Field2 field2;
    @XmlElement(name = "Field3", required = true)
    protected ISO8583.Fields.Field3 field3;
    @XmlElement(name = "Field4", required = true)
    protected ISO8583.Fields.Field4 field4;
    @XmlElement(name = "Field5", required = true)
    protected ISO8583.Fields.Field5 field5;
    @XmlElement(name = "Field6", required = true)
    protected ISO8583.Fields.Field6 field6;
    @XmlElement(name = "Field7", required = true)
    protected ISO8583.Fields.Field7 field7;
    @XmlElement(name = "Field8", required = true)
    protected ISO8583.Fields.Field8 field8;
    @XmlElement(name = "Field9", required = true)
    protected ISO8583.Fields.Field9 field9;
    @XmlElement(name = "Field10", required = true)
    protected ISO8583.Fields.Field10 field10;
    @XmlElement(name = "Field11", required = true)
    protected ISO8583.Fields.Field11 field11;
    @XmlElement(name = "Field12", required = true)
    protected ISO8583.Fields.Field12 field12;
    @XmlElement(name = "Field13", required = true)
    protected ISO8583.Fields.Field13 field13;
    @XmlElement(name = "Field14", required = true)
    protected ISO8583.Fields.Field14 field14;
    @XmlElement(name = "Field15", required = true)
    protected ISO8583.Fields.Field15 field15;
    @XmlElement(name = "Field16", required = true)
    protected ISO8583.Fields.Field16 field16;
    @XmlElement(name = "Field17", required = true)
    protected ISO8583.Fields.Field17 field17;
    @XmlElement(name = "Field18", required = true)
    protected ISO8583.Fields.Field18 field18;
    @XmlElement(name = "Field19", required = true)
    protected ISO8583.Fields.Field19 field19;
    @XmlElement(name = "Field20", required = true)
    protected ISO8583.Fields.Field20 field20;
    @XmlElement(name = "Field21", required = true)
    protected ISO8583.Fields.Field21 field21;
    @XmlElement(name = "Field22", required = true)
    protected ISO8583.Fields.Field22 field22;
    @XmlElement(name = "Field23", required = true)
    protected ISO8583.Fields.Field23 field23;
    @XmlElement(name = "Field24", required = true)
    protected ISO8583.Fields.Field24 field24;
    @XmlElement(name = "Field25", required = true)
    protected ISO8583.Fields.Field25 field25;
    @XmlElement(name = "Field26", required = true)
    protected ISO8583.Fields.Field26 field26;
    @XmlElement(name = "Field27", required = true)
    protected ISO8583.Fields.Field27 field27;
    @XmlElement(name = "Field28", required = true)
    protected ISO8583.Fields.Field28 field28;
    @XmlElement(name = "Field29", required = true)
    protected ISO8583.Fields.Field29 field29;
    @XmlElement(name = "Field30", required = true)
    protected ISO8583.Fields.Field30 field30;
    @XmlElement(name = "Field31", required = true)
    protected ISO8583.Fields.Field31 field31;
    @XmlElement(name = "Field32", required = true)
    protected ISO8583.Fields.Field32 field32;
    @XmlElement(name = "Field33", required = true)
    protected ISO8583.Fields.Field33 field33;
    @XmlElement(name = "Field34", required = true)
    protected ISO8583.Fields.Field34 field34;
    @XmlElement(name = "Field35", required = true)
    protected ISO8583.Fields.Field35 field35;
    @XmlElement(name = "Field36", required = true)
    protected ISO8583.Fields.Field36 field36;
    @XmlElement(name = "Field37", required = true)
    protected ISO8583.Fields.Field37 field37;
    @XmlElement(name = "Field38", required = true)
    protected ISO8583.Fields.Field38 field38;
    @XmlElement(name = "Field39", required = true)
    protected ISO8583.Fields.Field39 field39;
    @XmlElement(name = "Field40", required = true)
    protected ISO8583.Fields.Field40 field40;
    @XmlElement(name = "Field41", required = true)
    protected ISO8583.Fields.Field41 field41;
    @XmlElement(name = "Field42", required = true)
    protected ISO8583.Fields.Field42 field42;
    @XmlElement(name = "Field43", required = true)
    protected ISO8583.Fields.Field43 field43;
    @XmlElement(name = "Field44", required = true)
    protected ISO8583.Fields.Field44 field44;
    @XmlElement(name = "Field45", required = true)
    protected ISO8583.Fields.Field45 field45;
    @XmlElement(name = "Field46", required = true)
    protected ISO8583.Fields.Field46 field46;
    @XmlElement(name = "Field47", required = true)
    protected ISO8583.Fields.Field47 field47;
    @XmlElement(name = "Field48", required = true)
    protected ISO8583.Fields.Field48 field48;
    @XmlElement(name = "Field49", required = true)
    protected ISO8583.Fields.Field49 field49;
    @XmlElement(name = "Field50", required = true)
    protected ISO8583.Fields.Field50 field50;
    @XmlElement(name = "Field51", required = true)
    protected ISO8583.Fields.Field51 field51;
    @XmlElement(name = "Field52", required = true)
    protected ISO8583.Fields.Field52 field52;
    @XmlElement(name = "Field53", required = true)
    protected ISO8583.Fields.Field53 field53;
    @XmlElement(name = "Field54", required = true)
    protected ISO8583.Fields.Field54 field54;
    @XmlElement(name = "Field55", required = true)
    protected ISO8583.Fields.Field55 field55;
    @XmlElement(name = "Field56", required = true)
    protected ISO8583.Fields.Field56 field56;
    @XmlElement(name = "Field57", required = true)
    protected ISO8583.Fields.Field57 field57;
    @XmlElement(name = "Field58", required = true)
    protected ISO8583.Fields.Field58 field58;
    @XmlElement(name = "Field59", required = true)
    protected ISO8583.Fields.Field59 field59;
    @XmlElement(name = "Field60", required = true)
    protected ISO8583.Fields.Field60 field60;
    @XmlElement(name = "Field61", required = true)
    protected ISO8583.Fields.Field61 field61;
    @XmlElement(name = "Field62", required = true)
    protected ISO8583.Fields.Field62 field62;
    @XmlElement(name = "Field63", required = true)
    protected ISO8583.Fields.Field63 field63;
    @XmlElement(name = "Field64", required = true)
    protected ISO8583.Fields.Field64 field64;
    @XmlElement(name = "Field65", required = true)
    protected ISO8583.Fields.Field65 field65;
    @XmlElement(name = "Field66", required = true)
    protected ISO8583.Fields.Field66 field66;
    @XmlElement(name = "Field67", required = true)
    protected ISO8583.Fields.Field67 field67;
    @XmlElement(name = "Field68", required = true)
    protected ISO8583.Fields.Field68 field68;
    @XmlElement(name = "Field69", required = true)
    protected ISO8583.Fields.Field69 field69;
    @XmlElement(name = "Field70", required = true)
    protected ISO8583.Fields.Field70 field70;
    @XmlElement(name = "Field71", required = true)
    protected ISO8583.Fields.Field71 field71;
    @XmlElement(name = "Field72", required = true)
    protected ISO8583.Fields.Field72 field72;
    @XmlElement(name = "Field73", required = true)
    protected ISO8583.Fields.Field73 field73;
    @XmlElement(name = "Field74", required = true)
    protected ISO8583.Fields.Field74 field74;
    @XmlElement(name = "Field75", required = true)
    protected ISO8583.Fields.Field75 field75;
    @XmlElement(name = "Field76", required = true)
    protected ISO8583.Fields.Field76 field76;
    @XmlElement(name = "Field77", required = true)
    protected ISO8583.Fields.Field77 field77;
    @XmlElement(name = "Field78", required = true)
    protected ISO8583.Fields.Field78 field78;
    @XmlElement(name = "Field79", required = true)
    protected ISO8583.Fields.Field79 field79;
    @XmlElement(name = "Field80", required = true)
    protected ISO8583.Fields.Field80 field80;
    @XmlElement(name = "Field81", required = true)
    protected ISO8583.Fields.Field81 field81;
    @XmlElement(name = "Field82", required = true)
    protected ISO8583.Fields.Field82 field82;
    @XmlElement(name = "Field83", required = true)
    protected ISO8583.Fields.Field83 field83;
    @XmlElement(name = "Field84", required = true)
    protected ISO8583.Fields.Field84 field84;
    @XmlElement(name = "Field85", required = true)
    protected ISO8583.Fields.Field85 field85;
    @XmlElement(name = "Field86", required = true)
    protected ISO8583.Fields.Field86 field86;
    @XmlElement(name = "Field87", required = true)
    protected ISO8583.Fields.Field87 field87;
    @XmlElement(name = "Field88", required = true)
    protected ISO8583.Fields.Field88 field88;
    @XmlElement(name = "Field89", required = true)
    protected ISO8583.Fields.Field89 field89;
    @XmlElement(name = "Field90", required = true)
    protected ISO8583.Fields.Field90 field90;
    @XmlElement(name = "Field91", required = true)
    protected ISO8583.Fields.Field91 field91;
    @XmlElement(name = "Field92", required = true)
    protected ISO8583.Fields.Field92 field92;
    @XmlElement(name = "Field93", required = true)
    protected ISO8583.Fields.Field93 field93;
    @XmlElement(name = "Field94", required = true)
    protected ISO8583.Fields.Field94 field94;
    @XmlElement(name = "Field95", required = true)
    protected ISO8583.Fields.Field95 field95;
    @XmlElement(name = "Field96", required = true)
    protected ISO8583.Fields.Field96 field96;
    @XmlElement(name = "Field97", required = true)
    protected ISO8583.Fields.Field97 field97;
    @XmlElement(name = "Field98", required = true)
    protected ISO8583.Fields.Field98 field98;
    @XmlElement(name = "Field99", required = true)
    protected ISO8583.Fields.Field99 field99;
    @XmlElement(name = "Field100", required = true)
    protected ISO8583.Fields.Field100 field100;
    @XmlElement(name = "Field101", required = true)
    protected ISO8583.Fields.Field101 field101;
    @XmlElement(name = "Field102", required = true)
    protected ISO8583.Fields.Field102 field102;
    @XmlElement(name = "Field103", required = true)
    protected ISO8583.Fields.Field103 field103;
    @XmlElement(name = "Field104", required = true)
    protected ISO8583.Fields.Field104 field104;
    @XmlElement(name = "Field105", required = true)
    protected ISO8583.Fields.Field105 field105;
    @XmlElement(name = "Field106", required = true)
    protected ISO8583.Fields.Field106 field106;
    @XmlElement(name = "Field107", required = true)
    protected ISO8583.Fields.Field107 field107;
    @XmlElement(name = "Field108", required = true)
    protected ISO8583.Fields.Field108 field108;
    @XmlElement(name = "Field109", required = true)
    protected ISO8583.Fields.Field109 field109;
    @XmlElement(name = "Field110", required = true)
    protected ISO8583.Fields.Field110 field110;
    @XmlElement(name = "Field111", required = true)
    protected ISO8583.Fields.Field111 field111;
    @XmlElement(name = "Field112", required = true)
    protected ISO8583.Fields.Field112 field112;
    @XmlElement(name = "Field113", required = true)
    protected ISO8583.Fields.Field113 field113;
    @XmlElement(name = "Field114", required = true)
    protected ISO8583.Fields.Field114 field114;
    @XmlElement(name = "Field115", required = true)
    protected ISO8583.Fields.Field115 field115;
    @XmlElement(name = "Field116", required = true)
    protected ISO8583.Fields.Field116 field116;
    @XmlElement(name = "Field117", required = true)
    protected ISO8583.Fields.Field117 field117;
    @XmlElement(name = "Field118", required = true)
    protected ISO8583.Fields.Field118 field118;
    @XmlElement(name = "Field119", required = true)
    protected ISO8583.Fields.Field119 field119;
    @XmlElement(name = "Field120", required = true)
    protected ISO8583.Fields.Field120 field120;
    @XmlElement(name = "Field121", required = true)
    protected ISO8583.Fields.Field121 field121;
    @XmlElement(name = "Field122", required = true)
    protected ISO8583.Fields.Field122 field122;
    @XmlElement(name = "Field123", required = true)
    protected ISO8583.Fields.Field123 field123;
    @XmlElement(name = "Field124", required = true)
    protected ISO8583.Fields.Field124 field124;
    @XmlElement(name = "Field125", required = true)
    protected ISO8583.Fields.Field125 field125;
    @XmlElement(name = "Field126", required = true)
    protected ISO8583.Fields.Field126 field126;
    @XmlElement(name = "Field127", required = true)
    protected ISO8583.Fields.Field127 field127;
    @XmlElement(name = "Field128", required = true)
    protected ISO8583.Fields.Field128 field128;

    /**
     * Gets the value of the field1 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field1 }
     *
     */
    public ISO8583.Fields.Field1 getField1()
    {
      return field1;
    }

    /**
     * Sets the value of the field1 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field1 }
     *
     */
    public void setField1(ISO8583.Fields.Field1 value)
    {
      this.field1 = value;
    }

    /**
     * Gets the value of the field2 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field2 }
     *
     */
    public ISO8583.Fields.Field2 getField2()
    {
      return field2;
    }

    /**
     * Sets the value of the field2 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field2 }
     *
     */
    public void setField2(ISO8583.Fields.Field2 value)
    {
      this.field2 = value;
    }

    /**
     * Gets the value of the field3 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field3 }
     *
     */
    public ISO8583.Fields.Field3 getField3()
    {
      return field3;
    }

    /**
     * Sets the value of the field3 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field3 }
     *
     */
    public void setField3(ISO8583.Fields.Field3 value)
    {
      this.field3 = value;
    }

    /**
     * Gets the value of the field4 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field4 }
     *
     */
    public ISO8583.Fields.Field4 getField4()
    {
      return field4;
    }

    /**
     * Sets the value of the field4 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field4 }
     *
     */
    public void setField4(ISO8583.Fields.Field4 value)
    {
      this.field4 = value;
    }

    /**
     * Gets the value of the field5 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field5 }
     *
     */
    public ISO8583.Fields.Field5 getField5()
    {
      return field5;
    }

    /**
     * Sets the value of the field5 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field5 }
     *
     */
    public void setField5(ISO8583.Fields.Field5 value)
    {
      this.field5 = value;
    }

    /**
     * Gets the value of the field6 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field6 }
     *
     */
    public ISO8583.Fields.Field6 getField6()
    {
      return field6;
    }

    /**
     * Sets the value of the field6 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field6 }
     *
     */
    public void setField6(ISO8583.Fields.Field6 value)
    {
      this.field6 = value;
    }

    /**
     * Gets the value of the field7 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field7 }
     *
     */
    public ISO8583.Fields.Field7 getField7()
    {
      return field7;
    }

    /**
     * Sets the value of the field7 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field7 }
     *
     */
    public void setField7(ISO8583.Fields.Field7 value)
    {
      this.field7 = value;
    }

    /**
     * Gets the value of the field8 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field8 }
     *
     */
    public ISO8583.Fields.Field8 getField8()
    {
      return field8;
    }

    /**
     * Sets the value of the field8 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field8 }
     *
     */
    public void setField8(ISO8583.Fields.Field8 value)
    {
      this.field8 = value;
    }

    /**
     * Gets the value of the field9 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field9 }
     *
     */
    public ISO8583.Fields.Field9 getField9()
    {
      return field9;
    }

    /**
     * Sets the value of the field9 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field9 }
     *
     */
    public void setField9(ISO8583.Fields.Field9 value)
    {
      this.field9 = value;
    }

    /**
     * Gets the value of the field10 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field10 }
     *
     */
    public ISO8583.Fields.Field10 getField10()
    {
      return field10;
    }

    /**
     * Sets the value of the field10 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field10 }
     *
     */
    public void setField10(ISO8583.Fields.Field10 value)
    {
      this.field10 = value;
    }

    /**
     * Gets the value of the field11 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field11 }
     *
     */
    public ISO8583.Fields.Field11 getField11()
    {
      return field11;
    }

    /**
     * Sets the value of the field11 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field11 }
     *
     */
    public void setField11(ISO8583.Fields.Field11 value)
    {
      this.field11 = value;
    }

    /**
     * Gets the value of the field12 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field12 }
     *
     */
    public ISO8583.Fields.Field12 getField12()
    {
      return field12;
    }

    /**
     * Sets the value of the field12 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field12 }
     *
     */
    public void setField12(ISO8583.Fields.Field12 value)
    {
      this.field12 = value;
    }

    /**
     * Gets the value of the field13 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field13 }
     *
     */
    public ISO8583.Fields.Field13 getField13()
    {
      return field13;
    }

    /**
     * Sets the value of the field13 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field13 }
     *
     */
    public void setField13(ISO8583.Fields.Field13 value)
    {
      this.field13 = value;
    }

    /**
     * Gets the value of the field14 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field14 }
     *
     */
    public ISO8583.Fields.Field14 getField14()
    {
      return field14;
    }

    /**
     * Sets the value of the field14 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field14 }
     *
     */
    public void setField14(ISO8583.Fields.Field14 value)
    {
      this.field14 = value;
    }

    /**
     * Gets the value of the field15 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field15 }
     *
     */
    public ISO8583.Fields.Field15 getField15()
    {
      return field15;
    }

    /**
     * Sets the value of the field15 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field15 }
     *
     */
    public void setField15(ISO8583.Fields.Field15 value)
    {
      this.field15 = value;
    }

    /**
     * Gets the value of the field16 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field16 }
     *
     */
    public ISO8583.Fields.Field16 getField16()
    {
      return field16;
    }

    /**
     * Sets the value of the field16 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field16 }
     *
     */
    public void setField16(ISO8583.Fields.Field16 value)
    {
      this.field16 = value;
    }

    /**
     * Gets the value of the field17 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field17 }
     *
     */
    public ISO8583.Fields.Field17 getField17()
    {
      return field17;
    }

    /**
     * Sets the value of the field17 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field17 }
     *
     */
    public void setField17(ISO8583.Fields.Field17 value)
    {
      this.field17 = value;
    }

    /**
     * Gets the value of the field18 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field18 }
     *
     */
    public ISO8583.Fields.Field18 getField18()
    {
      return field18;
    }

    /**
     * Sets the value of the field18 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field18 }
     *
     */
    public void setField18(ISO8583.Fields.Field18 value)
    {
      this.field18 = value;
    }

    /**
     * Gets the value of the field19 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field19 }
     *
     */
    public ISO8583.Fields.Field19 getField19()
    {
      return field19;
    }

    /**
     * Sets the value of the field19 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field19 }
     *
     */
    public void setField19(ISO8583.Fields.Field19 value)
    {
      this.field19 = value;
    }

    /**
     * Gets the value of the field20 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field20 }
     *
     */
    public ISO8583.Fields.Field20 getField20()
    {
      return field20;
    }

    /**
     * Sets the value of the field20 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field20 }
     *
     */
    public void setField20(ISO8583.Fields.Field20 value)
    {
      this.field20 = value;
    }

    /**
     * Gets the value of the field21 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field21 }
     *
     */
    public ISO8583.Fields.Field21 getField21()
    {
      return field21;
    }

    /**
     * Sets the value of the field21 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field21 }
     *
     */
    public void setField21(ISO8583.Fields.Field21 value)
    {
      this.field21 = value;
    }

    /**
     * Gets the value of the field22 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field22 }
     *
     */
    public ISO8583.Fields.Field22 getField22()
    {
      return field22;
    }

    /**
     * Sets the value of the field22 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field22 }
     *
     */
    public void setField22(ISO8583.Fields.Field22 value)
    {
      this.field22 = value;
    }

    /**
     * Gets the value of the field23 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field23 }
     *
     */
    public ISO8583.Fields.Field23 getField23()
    {
      return field23;
    }

    /**
     * Sets the value of the field23 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field23 }
     *
     */
    public void setField23(ISO8583.Fields.Field23 value)
    {
      this.field23 = value;
    }

    /**
     * Gets the value of the field24 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field24 }
     *
     */
    public ISO8583.Fields.Field24 getField24()
    {
      return field24;
    }

    /**
     * Sets the value of the field24 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field24 }
     *
     */
    public void setField24(ISO8583.Fields.Field24 value)
    {
      this.field24 = value;
    }

    /**
     * Gets the value of the field25 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field25 }
     *
     */
    public ISO8583.Fields.Field25 getField25()
    {
      return field25;
    }

    /**
     * Sets the value of the field25 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field25 }
     *
     */
    public void setField25(ISO8583.Fields.Field25 value)
    {
      this.field25 = value;
    }

    /**
     * Gets the value of the field26 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field26 }
     *
     */
    public ISO8583.Fields.Field26 getField26()
    {
      return field26;
    }

    /**
     * Sets the value of the field26 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field26 }
     *
     */
    public void setField26(ISO8583.Fields.Field26 value)
    {
      this.field26 = value;
    }

    /**
     * Gets the value of the field27 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field27 }
     *
     */
    public ISO8583.Fields.Field27 getField27()
    {
      return field27;
    }

    /**
     * Sets the value of the field27 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field27 }
     *
     */
    public void setField27(ISO8583.Fields.Field27 value)
    {
      this.field27 = value;
    }

    /**
     * Gets the value of the field28 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field28 }
     *
     */
    public ISO8583.Fields.Field28 getField28()
    {
      return field28;
    }

    /**
     * Sets the value of the field28 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field28 }
     *
     */
    public void setField28(ISO8583.Fields.Field28 value)
    {
      this.field28 = value;
    }

    /**
     * Gets the value of the field29 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field29 }
     *
     */
    public ISO8583.Fields.Field29 getField29()
    {
      return field29;
    }

    /**
     * Sets the value of the field29 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field29 }
     *
     */
    public void setField29(ISO8583.Fields.Field29 value)
    {
      this.field29 = value;
    }

    /**
     * Gets the value of the field30 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field30 }
     *
     */
    public ISO8583.Fields.Field30 getField30()
    {
      return field30;
    }

    /**
     * Sets the value of the field30 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field30 }
     *
     */
    public void setField30(ISO8583.Fields.Field30 value)
    {
      this.field30 = value;
    }

    /**
     * Gets the value of the field31 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field31 }
     *
     */
    public ISO8583.Fields.Field31 getField31()
    {
      return field31;
    }

    /**
     * Sets the value of the field31 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field31 }
     *
     */
    public void setField31(ISO8583.Fields.Field31 value)
    {
      this.field31 = value;
    }

    /**
     * Gets the value of the field32 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field32 }
     *
     */
    public ISO8583.Fields.Field32 getField32()
    {
      return field32;
    }

    /**
     * Sets the value of the field32 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field32 }
     *
     */
    public void setField32(ISO8583.Fields.Field32 value)
    {
      this.field32 = value;
    }

    /**
     * Gets the value of the field33 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field33 }
     *
     */
    public ISO8583.Fields.Field33 getField33()
    {
      return field33;
    }

    /**
     * Sets the value of the field33 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field33 }
     *
     */
    public void setField33(ISO8583.Fields.Field33 value)
    {
      this.field33 = value;
    }

    /**
     * Gets the value of the field34 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field34 }
     *
     */
    public ISO8583.Fields.Field34 getField34()
    {
      return field34;
    }

    /**
     * Sets the value of the field34 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field34 }
     *
     */
    public void setField34(ISO8583.Fields.Field34 value)
    {
      this.field34 = value;
    }

    /**
     * Gets the value of the field35 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field35 }
     *
     */
    public ISO8583.Fields.Field35 getField35()
    {
      return field35;
    }

    /**
     * Sets the value of the field35 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field35 }
     *
     */
    public void setField35(ISO8583.Fields.Field35 value)
    {
      this.field35 = value;
    }

    /**
     * Gets the value of the field36 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field36 }
     *
     */
    public ISO8583.Fields.Field36 getField36()
    {
      return field36;
    }

    /**
     * Sets the value of the field36 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field36 }
     *
     */
    public void setField36(ISO8583.Fields.Field36 value)
    {
      this.field36 = value;
    }

    /**
     * Gets the value of the field37 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field37 }
     *
     */
    public ISO8583.Fields.Field37 getField37()
    {
      return field37;
    }

    /**
     * Sets the value of the field37 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field37 }
     *
     */
    public void setField37(ISO8583.Fields.Field37 value)
    {
      this.field37 = value;
    }

    /**
     * Gets the value of the field38 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field38 }
     *
     */
    public ISO8583.Fields.Field38 getField38()
    {
      return field38;
    }

    /**
     * Sets the value of the field38 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field38 }
     *
     */
    public void setField38(ISO8583.Fields.Field38 value)
    {
      this.field38 = value;
    }

    /**
     * Gets the value of the field39 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field39 }
     *
     */
    public ISO8583.Fields.Field39 getField39()
    {
      return field39;
    }

    /**
     * Sets the value of the field39 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field39 }
     *
     */
    public void setField39(ISO8583.Fields.Field39 value)
    {
      this.field39 = value;
    }

    /**
     * Gets the value of the field40 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field40 }
     *
     */
    public ISO8583.Fields.Field40 getField40()
    {
      return field40;
    }

    /**
     * Sets the value of the field40 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field40 }
     *
     */
    public void setField40(ISO8583.Fields.Field40 value)
    {
      this.field40 = value;
    }

    /**
     * Gets the value of the field41 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field41 }
     *
     */
    public ISO8583.Fields.Field41 getField41()
    {
      return field41;
    }

    /**
     * Sets the value of the field41 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field41 }
     *
     */
    public void setField41(ISO8583.Fields.Field41 value)
    {
      this.field41 = value;
    }

    /**
     * Gets the value of the field42 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field42 }
     *
     */
    public ISO8583.Fields.Field42 getField42()
    {
      return field42;
    }

    /**
     * Sets the value of the field42 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field42 }
     *
     */
    public void setField42(ISO8583.Fields.Field42 value)
    {
      this.field42 = value;
    }

    /**
     * Gets the value of the field43 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field43 }
     *
     */
    public ISO8583.Fields.Field43 getField43()
    {
      return field43;
    }

    /**
     * Sets the value of the field43 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field43 }
     *
     */
    public void setField43(ISO8583.Fields.Field43 value)
    {
      this.field43 = value;
    }

    /**
     * Gets the value of the field44 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field44 }
     *
     */
    public ISO8583.Fields.Field44 getField44()
    {
      return field44;
    }

    /**
     * Sets the value of the field44 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field44 }
     *
     */
    public void setField44(ISO8583.Fields.Field44 value)
    {
      this.field44 = value;
    }

    /**
     * Gets the value of the field45 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field45 }
     *
     */
    public ISO8583.Fields.Field45 getField45()
    {
      return field45;
    }

    /**
     * Sets the value of the field45 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field45 }
     *
     */
    public void setField45(ISO8583.Fields.Field45 value)
    {
      this.field45 = value;
    }

    /**
     * Gets the value of the field46 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field46 }
     *
     */
    public ISO8583.Fields.Field46 getField46()
    {
      return field46;
    }

    /**
     * Sets the value of the field46 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field46 }
     *
     */
    public void setField46(ISO8583.Fields.Field46 value)
    {
      this.field46 = value;
    }

    /**
     * Gets the value of the field47 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field47 }
     *
     */
    public ISO8583.Fields.Field47 getField47()
    {
      return field47;
    }

    /**
     * Sets the value of the field47 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field47 }
     *
     */
    public void setField47(ISO8583.Fields.Field47 value)
    {
      this.field47 = value;
    }

    /**
     * Gets the value of the field48 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field48 }
     *
     */
    public ISO8583.Fields.Field48 getField48()
    {
      return field48;
    }

    /**
     * Sets the value of the field48 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field48 }
     *
     */
    public void setField48(ISO8583.Fields.Field48 value)
    {
      this.field48 = value;
    }

    /**
     * Gets the value of the field49 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field49 }
     *
     */
    public ISO8583.Fields.Field49 getField49()
    {
      return field49;
    }

    /**
     * Sets the value of the field49 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field49 }
     *
     */
    public void setField49(ISO8583.Fields.Field49 value)
    {
      this.field49 = value;
    }

    /**
     * Gets the value of the field50 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field50 }
     *
     */
    public ISO8583.Fields.Field50 getField50()
    {
      return field50;
    }

    /**
     * Sets the value of the field50 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field50 }
     *
     */
    public void setField50(ISO8583.Fields.Field50 value)
    {
      this.field50 = value;
    }

    /**
     * Gets the value of the field51 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field51 }
     *
     */
    public ISO8583.Fields.Field51 getField51()
    {
      return field51;
    }

    /**
     * Sets the value of the field51 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field51 }
     *
     */
    public void setField51(ISO8583.Fields.Field51 value)
    {
      this.field51 = value;
    }

    /**
     * Gets the value of the field52 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field52 }
     *
     */
    public ISO8583.Fields.Field52 getField52()
    {
      return field52;
    }

    /**
     * Sets the value of the field52 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field52 }
     *
     */
    public void setField52(ISO8583.Fields.Field52 value)
    {
      this.field52 = value;
    }

    /**
     * Gets the value of the field53 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field53 }
     *
     */
    public ISO8583.Fields.Field53 getField53()
    {
      return field53;
    }

    /**
     * Sets the value of the field53 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field53 }
     *
     */
    public void setField53(ISO8583.Fields.Field53 value)
    {
      this.field53 = value;
    }

    /**
     * Gets the value of the field54 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field54 }
     *
     */
    public ISO8583.Fields.Field54 getField54()
    {
      return field54;
    }

    /**
     * Sets the value of the field54 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field54 }
     *
     */
    public void setField54(ISO8583.Fields.Field54 value)
    {
      this.field54 = value;
    }

    /**
     * Gets the value of the field55 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field55 }
     *
     */
    public ISO8583.Fields.Field55 getField55()
    {
      return field55;
    }

    /**
     * Sets the value of the field55 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field55 }
     *
     */
    public void setField55(ISO8583.Fields.Field55 value)
    {
      this.field55 = value;
    }

    /**
     * Gets the value of the field56 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field56 }
     *
     */
    public ISO8583.Fields.Field56 getField56()
    {
      return field56;
    }

    /**
     * Sets the value of the field56 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field56 }
     *
     */
    public void setField56(ISO8583.Fields.Field56 value)
    {
      this.field56 = value;
    }

    /**
     * Gets the value of the field57 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field57 }
     *
     */
    public ISO8583.Fields.Field57 getField57()
    {
      return field57;
    }

    /**
     * Sets the value of the field57 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field57 }
     *
     */
    public void setField57(ISO8583.Fields.Field57 value)
    {
      this.field57 = value;
    }

    /**
     * Gets the value of the field58 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field58 }
     *
     */
    public ISO8583.Fields.Field58 getField58()
    {
      return field58;
    }

    /**
     * Sets the value of the field58 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field58 }
     *
     */
    public void setField58(ISO8583.Fields.Field58 value)
    {
      this.field58 = value;
    }

    /**
     * Gets the value of the field59 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field59 }
     *
     */
    public ISO8583.Fields.Field59 getField59()
    {
      return field59;
    }

    /**
     * Sets the value of the field59 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field59 }
     *
     */
    public void setField59(ISO8583.Fields.Field59 value)
    {
      this.field59 = value;
    }

    /**
     * Gets the value of the field60 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field60 }
     *
     */
    public ISO8583.Fields.Field60 getField60()
    {
      return field60;
    }

    /**
     * Sets the value of the field60 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field60 }
     *
     */
    public void setField60(ISO8583.Fields.Field60 value)
    {
      this.field60 = value;
    }

    /**
     * Gets the value of the field61 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field61 }
     *
     */
    public ISO8583.Fields.Field61 getField61()
    {
      return field61;
    }

    /**
     * Sets the value of the field61 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field61 }
     *
     */
    public void setField61(ISO8583.Fields.Field61 value)
    {
      this.field61 = value;
    }

    /**
     * Gets the value of the field62 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field62 }
     *
     */
    public ISO8583.Fields.Field62 getField62()
    {
      return field62;
    }

    /**
     * Sets the value of the field62 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field62 }
     *
     */
    public void setField62(ISO8583.Fields.Field62 value)
    {
      this.field62 = value;
    }

    /**
     * Gets the value of the field63 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field63 }
     *
     */
    public ISO8583.Fields.Field63 getField63()
    {
      return field63;
    }

    /**
     * Sets the value of the field63 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field63 }
     *
     */
    public void setField63(ISO8583.Fields.Field63 value)
    {
      this.field63 = value;
    }

    /**
     * Gets the value of the field64 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field64 }
     *
     */
    public ISO8583.Fields.Field64 getField64()
    {
      return field64;
    }

    /**
     * Sets the value of the field64 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field64 }
     *
     */
    public void setField64(ISO8583.Fields.Field64 value)
    {
      this.field64 = value;
    }

    /**
     * Gets the value of the field65 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field65 }
     *
     */
    public ISO8583.Fields.Field65 getField65()
    {
      return field65;
    }

    /**
     * Sets the value of the field65 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field65 }
     *
     */
    public void setField65(ISO8583.Fields.Field65 value)
    {
      this.field65 = value;
    }

    /**
     * Gets the value of the field66 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field66 }
     *
     */
    public ISO8583.Fields.Field66 getField66()
    {
      return field66;
    }

    /**
     * Sets the value of the field66 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field66 }
     *
     */
    public void setField66(ISO8583.Fields.Field66 value)
    {
      this.field66 = value;
    }

    /**
     * Gets the value of the field67 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field67 }
     *
     */
    public ISO8583.Fields.Field67 getField67()
    {
      return field67;
    }

    /**
     * Sets the value of the field67 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field67 }
     *
     */
    public void setField67(ISO8583.Fields.Field67 value)
    {
      this.field67 = value;
    }

    /**
     * Gets the value of the field68 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field68 }
     *
     */
    public ISO8583.Fields.Field68 getField68()
    {
      return field68;
    }

    /**
     * Sets the value of the field68 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field68 }
     *
     */
    public void setField68(ISO8583.Fields.Field68 value)
    {
      this.field68 = value;
    }

    /**
     * Gets the value of the field69 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field69 }
     *
     */
    public ISO8583.Fields.Field69 getField69()
    {
      return field69;
    }

    /**
     * Sets the value of the field69 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field69 }
     *
     */
    public void setField69(ISO8583.Fields.Field69 value)
    {
      this.field69 = value;
    }

    /**
     * Gets the value of the field70 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field70 }
     *
     */
    public ISO8583.Fields.Field70 getField70()
    {
      return field70;
    }

    /**
     * Sets the value of the field70 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field70 }
     *
     */
    public void setField70(ISO8583.Fields.Field70 value)
    {
      this.field70 = value;
    }

    /**
     * Gets the value of the field71 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field71 }
     *
     */
    public ISO8583.Fields.Field71 getField71()
    {
      return field71;
    }

    /**
     * Sets the value of the field71 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field71 }
     *
     */
    public void setField71(ISO8583.Fields.Field71 value)
    {
      this.field71 = value;
    }

    /**
     * Gets the value of the field72 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field72 }
     *
     */
    public ISO8583.Fields.Field72 getField72()
    {
      return field72;
    }

    /**
     * Sets the value of the field72 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field72 }
     *
     */
    public void setField72(ISO8583.Fields.Field72 value)
    {
      this.field72 = value;
    }

    /**
     * Gets the value of the field73 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field73 }
     *
     */
    public ISO8583.Fields.Field73 getField73()
    {
      return field73;
    }

    /**
     * Sets the value of the field73 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field73 }
     *
     */
    public void setField73(ISO8583.Fields.Field73 value)
    {
      this.field73 = value;
    }

    /**
     * Gets the value of the field74 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field74 }
     *
     */
    public ISO8583.Fields.Field74 getField74()
    {
      return field74;
    }

    /**
     * Sets the value of the field74 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field74 }
     *
     */
    public void setField74(ISO8583.Fields.Field74 value)
    {
      this.field74 = value;
    }

    /**
     * Gets the value of the field75 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field75 }
     *
     */
    public ISO8583.Fields.Field75 getField75()
    {
      return field75;
    }

    /**
     * Sets the value of the field75 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field75 }
     *
     */
    public void setField75(ISO8583.Fields.Field75 value)
    {
      this.field75 = value;
    }

    /**
     * Gets the value of the field76 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field76 }
     *
     */
    public ISO8583.Fields.Field76 getField76()
    {
      return field76;
    }

    /**
     * Sets the value of the field76 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field76 }
     *
     */
    public void setField76(ISO8583.Fields.Field76 value)
    {
      this.field76 = value;
    }

    /**
     * Gets the value of the field77 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field77 }
     *
     */
    public ISO8583.Fields.Field77 getField77()
    {
      return field77;
    }

    /**
     * Sets the value of the field77 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field77 }
     *
     */
    public void setField77(ISO8583.Fields.Field77 value)
    {
      this.field77 = value;
    }

    /**
     * Gets the value of the field78 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field78 }
     *
     */
    public ISO8583.Fields.Field78 getField78()
    {
      return field78;
    }

    /**
     * Sets the value of the field78 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field78 }
     *
     */
    public void setField78(ISO8583.Fields.Field78 value)
    {
      this.field78 = value;
    }

    /**
     * Gets the value of the field79 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field79 }
     *
     */
    public ISO8583.Fields.Field79 getField79()
    {
      return field79;
    }

    /**
     * Sets the value of the field79 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field79 }
     *
     */
    public void setField79(ISO8583.Fields.Field79 value)
    {
      this.field79 = value;
    }

    /**
     * Gets the value of the field80 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field80 }
     *
     */
    public ISO8583.Fields.Field80 getField80()
    {
      return field80;
    }

    /**
     * Sets the value of the field80 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field80 }
     *
     */
    public void setField80(ISO8583.Fields.Field80 value)
    {
      this.field80 = value;
    }

    /**
     * Gets the value of the field81 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field81 }
     *
     */
    public ISO8583.Fields.Field81 getField81()
    {
      return field81;
    }

    /**
     * Sets the value of the field81 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field81 }
     *
     */
    public void setField81(ISO8583.Fields.Field81 value)
    {
      this.field81 = value;
    }

    /**
     * Gets the value of the field82 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field82 }
     *
     */
    public ISO8583.Fields.Field82 getField82()
    {
      return field82;
    }

    /**
     * Sets the value of the field82 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field82 }
     *
     */
    public void setField82(ISO8583.Fields.Field82 value)
    {
      this.field82 = value;
    }

    /**
     * Gets the value of the field83 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field83 }
     *
     */
    public ISO8583.Fields.Field83 getField83()
    {
      return field83;
    }

    /**
     * Sets the value of the field83 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field83 }
     *
     */
    public void setField83(ISO8583.Fields.Field83 value)
    {
      this.field83 = value;
    }

    /**
     * Gets the value of the field84 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field84 }
     *
     */
    public ISO8583.Fields.Field84 getField84()
    {
      return field84;
    }

    /**
     * Sets the value of the field84 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field84 }
     *
     */
    public void setField84(ISO8583.Fields.Field84 value)
    {
      this.field84 = value;
    }

    /**
     * Gets the value of the field85 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field85 }
     *
     */
    public ISO8583.Fields.Field85 getField85()
    {
      return field85;
    }

    /**
     * Sets the value of the field85 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field85 }
     *
     */
    public void setField85(ISO8583.Fields.Field85 value)
    {
      this.field85 = value;
    }

    /**
     * Gets the value of the field86 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field86 }
     *
     */
    public ISO8583.Fields.Field86 getField86()
    {
      return field86;
    }

    /**
     * Sets the value of the field86 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field86 }
     *
     */
    public void setField86(ISO8583.Fields.Field86 value)
    {
      this.field86 = value;
    }

    /**
     * Gets the value of the field87 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field87 }
     *
     */
    public ISO8583.Fields.Field87 getField87()
    {
      return field87;
    }

    /**
     * Sets the value of the field87 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field87 }
     *
     */
    public void setField87(ISO8583.Fields.Field87 value)
    {
      this.field87 = value;
    }

    /**
     * Gets the value of the field88 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field88 }
     *
     */
    public ISO8583.Fields.Field88 getField88()
    {
      return field88;
    }

    /**
     * Sets the value of the field88 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field88 }
     *
     */
    public void setField88(ISO8583.Fields.Field88 value)
    {
      this.field88 = value;
    }

    /**
     * Gets the value of the field89 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field89 }
     *
     */
    public ISO8583.Fields.Field89 getField89()
    {
      return field89;
    }

    /**
     * Sets the value of the field89 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field89 }
     *
     */
    public void setField89(ISO8583.Fields.Field89 value)
    {
      this.field89 = value;
    }

    /**
     * Gets the value of the field90 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field90 }
     *
     */
    public ISO8583.Fields.Field90 getField90()
    {
      return field90;
    }

    /**
     * Sets the value of the field90 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field90 }
     *
     */
    public void setField90(ISO8583.Fields.Field90 value)
    {
      this.field90 = value;
    }

    /**
     * Gets the value of the field91 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field91 }
     *
     */
    public ISO8583.Fields.Field91 getField91()
    {
      return field91;
    }

    /**
     * Sets the value of the field91 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field91 }
     *
     */
    public void setField91(ISO8583.Fields.Field91 value)
    {
      this.field91 = value;
    }

    /**
     * Gets the value of the field92 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field92 }
     *
     */
    public ISO8583.Fields.Field92 getField92()
    {
      return field92;
    }

    /**
     * Sets the value of the field92 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field92 }
     *
     */
    public void setField92(ISO8583.Fields.Field92 value)
    {
      this.field92 = value;
    }

    /**
     * Gets the value of the field93 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field93 }
     *
     */
    public ISO8583.Fields.Field93 getField93()
    {
      return field93;
    }

    /**
     * Sets the value of the field93 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field93 }
     *
     */
    public void setField93(ISO8583.Fields.Field93 value)
    {
      this.field93 = value;
    }

    /**
     * Gets the value of the field94 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field94 }
     *
     */
    public ISO8583.Fields.Field94 getField94()
    {
      return field94;
    }

    /**
     * Sets the value of the field94 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field94 }
     *
     */
    public void setField94(ISO8583.Fields.Field94 value)
    {
      this.field94 = value;
    }

    /**
     * Gets the value of the field95 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field95 }
     *
     */
    public ISO8583.Fields.Field95 getField95()
    {
      return field95;
    }

    /**
     * Sets the value of the field95 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field95 }
     *
     */
    public void setField95(ISO8583.Fields.Field95 value)
    {
      this.field95 = value;
    }

    /**
     * Gets the value of the field96 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field96 }
     *
     */
    public ISO8583.Fields.Field96 getField96()
    {
      return field96;
    }

    /**
     * Sets the value of the field96 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field96 }
     *
     */
    public void setField96(ISO8583.Fields.Field96 value)
    {
      this.field96 = value;
    }

    /**
     * Gets the value of the field97 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field97 }
     *
     */
    public ISO8583.Fields.Field97 getField97()
    {
      return field97;
    }

    /**
     * Sets the value of the field97 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field97 }
     *
     */
    public void setField97(ISO8583.Fields.Field97 value)
    {
      this.field97 = value;
    }

    /**
     * Gets the value of the field98 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field98 }
     *
     */
    public ISO8583.Fields.Field98 getField98()
    {
      return field98;
    }

    /**
     * Sets the value of the field98 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field98 }
     *
     */
    public void setField98(ISO8583.Fields.Field98 value)
    {
      this.field98 = value;
    }

    /**
     * Gets the value of the field99 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field99 }
     *
     */
    public ISO8583.Fields.Field99 getField99()
    {
      return field99;
    }

    /**
     * Sets the value of the field99 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field99 }
     *
     */
    public void setField99(ISO8583.Fields.Field99 value)
    {
      this.field99 = value;
    }

    /**
     * Gets the value of the field100 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field100 }
     *
     */
    public ISO8583.Fields.Field100 getField100()
    {
      return field100;
    }

    /**
     * Sets the value of the field100 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field100 }
     *
     */
    public void setField100(ISO8583.Fields.Field100 value)
    {
      this.field100 = value;
    }

    /**
     * Gets the value of the field101 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field101 }
     *
     */
    public ISO8583.Fields.Field101 getField101()
    {
      return field101;
    }

    /**
     * Sets the value of the field101 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field101 }
     *
     */
    public void setField101(ISO8583.Fields.Field101 value)
    {
      this.field101 = value;
    }

    /**
     * Gets the value of the field102 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field102 }
     *
     */
    public ISO8583.Fields.Field102 getField102()
    {
      return field102;
    }

    /**
     * Sets the value of the field102 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field102 }
     *
     */
    public void setField102(ISO8583.Fields.Field102 value)
    {
      this.field102 = value;
    }

    /**
     * Gets the value of the field103 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field103 }
     *
     */
    public ISO8583.Fields.Field103 getField103()
    {
      return field103;
    }

    /**
     * Sets the value of the field103 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field103 }
     *
     */
    public void setField103(ISO8583.Fields.Field103 value)
    {
      this.field103 = value;
    }

    /**
     * Gets the value of the field104 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field104 }
     *
     */
    public ISO8583.Fields.Field104 getField104()
    {
      return field104;
    }

    /**
     * Sets the value of the field104 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field104 }
     *
     */
    public void setField104(ISO8583.Fields.Field104 value)
    {
      this.field104 = value;
    }

    /**
     * Gets the value of the field105 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field105 }
     *
     */
    public ISO8583.Fields.Field105 getField105()
    {
      return field105;
    }

    /**
     * Sets the value of the field105 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field105 }
     *
     */
    public void setField105(ISO8583.Fields.Field105 value)
    {
      this.field105 = value;
    }

    /**
     * Gets the value of the field106 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field106 }
     *
     */
    public ISO8583.Fields.Field106 getField106()
    {
      return field106;
    }

    /**
     * Sets the value of the field106 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field106 }
     *
     */
    public void setField106(ISO8583.Fields.Field106 value)
    {
      this.field106 = value;
    }

    /**
     * Gets the value of the field107 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field107 }
     *
     */
    public ISO8583.Fields.Field107 getField107()
    {
      return field107;
    }

    /**
     * Sets the value of the field107 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field107 }
     *
     */
    public void setField107(ISO8583.Fields.Field107 value)
    {
      this.field107 = value;
    }

    /**
     * Gets the value of the field108 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field108 }
     *
     */
    public ISO8583.Fields.Field108 getField108()
    {
      return field108;
    }

    /**
     * Sets the value of the field108 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field108 }
     *
     */
    public void setField108(ISO8583.Fields.Field108 value)
    {
      this.field108 = value;
    }

    /**
     * Gets the value of the field109 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field109 }
     *
     */
    public ISO8583.Fields.Field109 getField109()
    {
      return field109;
    }

    /**
     * Sets the value of the field109 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field109 }
     *
     */
    public void setField109(ISO8583.Fields.Field109 value)
    {
      this.field109 = value;
    }

    /**
     * Gets the value of the field110 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field110 }
     *
     */
    public ISO8583.Fields.Field110 getField110()
    {
      return field110;
    }

    /**
     * Sets the value of the field110 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field110 }
     *
     */
    public void setField110(ISO8583.Fields.Field110 value)
    {
      this.field110 = value;
    }

    /**
     * Gets the value of the field111 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field111 }
     *
     */
    public ISO8583.Fields.Field111 getField111()
    {
      return field111;
    }

    /**
     * Sets the value of the field111 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field111 }
     *
     */
    public void setField111(ISO8583.Fields.Field111 value)
    {
      this.field111 = value;
    }

    /**
     * Gets the value of the field112 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field112 }
     *
     */
    public ISO8583.Fields.Field112 getField112()
    {
      return field112;
    }

    /**
     * Sets the value of the field112 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field112 }
     *
     */
    public void setField112(ISO8583.Fields.Field112 value)
    {
      this.field112 = value;
    }

    /**
     * Gets the value of the field113 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field113 }
     *
     */
    public ISO8583.Fields.Field113 getField113()
    {
      return field113;
    }

    /**
     * Sets the value of the field113 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field113 }
     *
     */
    public void setField113(ISO8583.Fields.Field113 value)
    {
      this.field113 = value;
    }

    /**
     * Gets the value of the field114 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field114 }
     *
     */
    public ISO8583.Fields.Field114 getField114()
    {
      return field114;
    }

    /**
     * Sets the value of the field114 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field114 }
     *
     */
    public void setField114(ISO8583.Fields.Field114 value)
    {
      this.field114 = value;
    }

    /**
     * Gets the value of the field115 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field115 }
     *
     */
    public ISO8583.Fields.Field115 getField115()
    {
      return field115;
    }

    /**
     * Sets the value of the field115 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field115 }
     *
     */
    public void setField115(ISO8583.Fields.Field115 value)
    {
      this.field115 = value;
    }

    /**
     * Gets the value of the field116 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field116 }
     *
     */
    public ISO8583.Fields.Field116 getField116()
    {
      return field116;
    }

    /**
     * Sets the value of the field116 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field116 }
     *
     */
    public void setField116(ISO8583.Fields.Field116 value)
    {
      this.field116 = value;
    }

    /**
     * Gets the value of the field117 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field117 }
     *
     */
    public ISO8583.Fields.Field117 getField117()
    {
      return field117;
    }

    /**
     * Sets the value of the field117 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field117 }
     *
     */
    public void setField117(ISO8583.Fields.Field117 value)
    {
      this.field117 = value;
    }

    /**
     * Gets the value of the field118 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field118 }
     *
     */
    public ISO8583.Fields.Field118 getField118()
    {
      return field118;
    }

    /**
     * Sets the value of the field118 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field118 }
     *
     */
    public void setField118(ISO8583.Fields.Field118 value)
    {
      this.field118 = value;
    }

    /**
     * Gets the value of the field119 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field119 }
     *
     */
    public ISO8583.Fields.Field119 getField119()
    {
      return field119;
    }

    /**
     * Sets the value of the field119 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field119 }
     *
     */
    public void setField119(ISO8583.Fields.Field119 value)
    {
      this.field119 = value;
    }

    /**
     * Gets the value of the field120 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field120 }
     *
     */
    public ISO8583.Fields.Field120 getField120()
    {
      return field120;
    }

    /**
     * Sets the value of the field120 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field120 }
     *
     */
    public void setField120(ISO8583.Fields.Field120 value)
    {
      this.field120 = value;
    }

    /**
     * Gets the value of the field121 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field121 }
     *
     */
    public ISO8583.Fields.Field121 getField121()
    {
      return field121;
    }

    /**
     * Sets the value of the field121 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field121 }
     *
     */
    public void setField121(ISO8583.Fields.Field121 value)
    {
      this.field121 = value;
    }

    /**
     * Gets the value of the field122 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field122 }
     *
     */
    public ISO8583.Fields.Field122 getField122()
    {
      return field122;
    }

    /**
     * Sets the value of the field122 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field122 }
     *
     */
    public void setField122(ISO8583.Fields.Field122 value)
    {
      this.field122 = value;
    }

    /**
     * Gets the value of the field123 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field123 }
     *
     */
    public ISO8583.Fields.Field123 getField123()
    {
      return field123;
    }

    /**
     * Sets the value of the field123 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field123 }
     *
     */
    public void setField123(ISO8583.Fields.Field123 value)
    {
      this.field123 = value;
    }

    /**
     * Gets the value of the field124 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field124 }
     *
     */
    public ISO8583.Fields.Field124 getField124()
    {
      return field124;
    }

    /**
     * Sets the value of the field124 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field124 }
     *
     */
    public void setField124(ISO8583.Fields.Field124 value)
    {
      this.field124 = value;
    }

    /**
     * Gets the value of the field125 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field125 }
     *
     */
    public ISO8583.Fields.Field125 getField125()
    {
      return field125;
    }

    /**
     * Sets the value of the field125 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field125 }
     *
     */
    public void setField125(ISO8583.Fields.Field125 value)
    {
      this.field125 = value;
    }

    /**
     * Gets the value of the field126 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field126 }
     *
     */
    public ISO8583.Fields.Field126 getField126()
    {
      return field126;
    }

    /**
     * Sets the value of the field126 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field126 }
     *
     */
    public void setField126(ISO8583.Fields.Field126 value)
    {
      this.field126 = value;
    }

    /**
     * Gets the value of the field127 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field127 }
     *
     */
    public ISO8583.Fields.Field127 getField127()
    {
      return field127;
    }

    /**
     * Sets the value of the field127 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field127 }
     *
     */
    public void setField127(ISO8583.Fields.Field127 value)
    {
      this.field127 = value;
    }

    /**
     * Gets the value of the field128 property.
     *
     * @return
     *     possible object is
     *     {@link ISO8583 .Fields.Field128 }
     *
     */
    public ISO8583.Fields.Field128 getField128()
    {
      return field128;
    }

    /**
     * Sets the value of the field128 property.
     *
     * @param value
     *     allowed object is
     *     {@link ISO8583 .Fields.Field128 }
     *
     */
    public void setField128(ISO8583.Fields.Field128 value)
    {
      this.field128 = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field1
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field10
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field100
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field101
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field102
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field103
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field104
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field105
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field106
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field107
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field108
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field109
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field11
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field110
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field111
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field112
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field113
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field114
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field115
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field116
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field117
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field118
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field119
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field12
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field120
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field121
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field122
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field123
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field124
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field125
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field126
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field127
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field128
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field13
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field14
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field15
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field16
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field17
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field18
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field19
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field2
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field20
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field21
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field22
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field23
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field24
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field25
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field26
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field27
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field28
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field29
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field3
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field30
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field31
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field32
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field33
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field34
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field35
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field36
    {

      @XmlValue
      protected float value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       */
      public float getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       */
      public void setValue(float value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field37
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field38
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field39
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field4
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field40
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field41
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field42
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field43
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field44
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field45
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field46
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field47
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field48
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field49
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field5
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field50
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field51
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field52
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field53
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field54
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field55
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field56
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field57
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field58
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field59
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field6
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field60
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field61
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field62
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field63
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field64
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field65
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field66
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field67
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field68
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field69
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field7
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field70
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field71
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field72
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field73
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field74
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field75
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field76
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field77
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field78
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field79
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field8
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field80
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field81
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field82
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field83
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field84
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field85
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field86
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field87
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field88
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field89
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field9
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field90
    {

      @XmlValue
      protected float value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       */
      public float getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       */
      public void setValue(float value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field91
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field92
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field93
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field94
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field95
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field96
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field97
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field98
    {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setValue(String value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attribute name="BitNum" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        { "value" })
    public static class Field99
    {

      @XmlValue
      protected BigInteger value;
      @XmlAttribute(name = "BitNum")
      protected BigInteger bitNum;
      @XmlAttribute(name = "Name")
      protected String name;

      /**
       * Gets the value of the value property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getValue()
      {
        return value;
      }

      /**
       * Sets the value of the value property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setValue(BigInteger value)
      {
        this.value = value;
      }

      /**
       * Gets the value of the bitNum property.
       *
       * @return
       *     possible object is
       *     {@link BigInteger }
       *
       */
      public BigInteger getBitNum()
      {
        return bitNum;
      }

      /**
       * Sets the value of the bitNum property.
       *
       * @param value
       *     allowed object is
       *     {@link BigInteger }
       *
       */
      public void setBitNum(BigInteger value)
      {
        this.bitNum = value;
      }

      /**
       * Gets the value of the name property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getName()
      {
        return name;
      }

      /**
       * Sets the value of the name property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setName(String value)
      {
        this.name = value;
      }

    }

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
   *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}integer"/>
   *         &lt;element name="MIT" type="{http://www.w3.org/2001/XMLSchema}integer"/>
   *         &lt;element name="MessageHeader" type="{http://www.w3.org/2001/XMLSchema}integer"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   *
   *
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder =
      { "version", "mit", "messageHeader" })
  public static class Header
  {

    @XmlElement(required = true)
    protected BigInteger version;
    @XmlElement(name = "MIT", required = true)
    protected BigInteger mit;
    @XmlElement(name = "MessageHeader", required = true)
    protected BigInteger messageHeader;

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getVersion()
    {
      return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setVersion(BigInteger value)
    {
      this.version = value;
    }

    /**
     * Gets the value of the mit property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMIT()
    {
      return mit;
    }

    /**
     * Sets the value of the mit property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMIT(BigInteger value)
    {
      this.mit = value;
    }

    /**
     * Gets the value of the messageHeader property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMessageHeader()
    {
      return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMessageHeader(BigInteger value)
    {
      this.messageHeader = value;
    }

  }

}
