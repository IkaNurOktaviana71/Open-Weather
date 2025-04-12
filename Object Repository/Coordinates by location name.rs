<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Coordinates by location name</name>
   <tag></tag>
   <elementGuidId>6a04fab1-0f78-4489-9919-837134779f82</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <katalonVersion>8.6.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://api.openweathermap.org/geo/1.0/direct?q=Jakarta,ID-JK,id&amp;limit=${limit}&amp;appid=${API key}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>[('city name') : 'jakarta', ('state code') : 'id-JK', ('country code') : 'id']</defaultValue>
      <description></description>
      <id>2bfa6bec-40e1-4439-9ed6-2ae7a411b812</id>
      <masked>false</masked>
      <name>city name,state code,country code</name>
   </variables>
   <variables>
      <defaultValue>'5'</defaultValue>
      <description></description>
      <id>778f4efe-a38e-4d31-aa62-5f4cb4206874</id>
      <masked>false</masked>
      <name>limit</name>
   </variables>
   <variables>
      <defaultValue>'8b95b0ebe090b57c70f3120685ce5de2'</defaultValue>
      <description></description>
      <id>a4449fc4-92c7-4d78-827a-75e8f8d597b1</id>
      <masked>false</masked>
      <name>API key</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
