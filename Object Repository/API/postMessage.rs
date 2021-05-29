<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>postMessage</name>
   <tag></tag>
   <elementGuidId>3ce873d5-c7ce-4b69-a8b9-cc7afc7864b8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \n    \&quot;channel_id\&quot;: \&quot;ijqjq6zsy7ngu8s8yfn759ouby\&quot;,\n\&quot;create_at\&quot;: 0,\n\&quot;file_ids\&quot;: [],\n\&quot;message\&quot;: \&quot;oke\&quot;,\n\&quot;metadata\&quot;: {},\n\&quot;pending_post_id\&quot;: \&quot;8tadcnko8fn8fqfed4zkn3dwoe:1622271675163\&quot;,\n\&quot;props\&quot;: {\&quot;disable_group_highlight\&quot;: true},\n\&quot;reply_count\&quot;: 0,\n\&quot;update_at\&quot;: 1622271675188,\n\&quot;user_id\&quot;: \&quot;8tadcnko8fn8fqfed4zkn3dwoe\&quot;\n\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Cookie</name>
      <type>Main</type>
      <value>rl_anonymous_id=%22d174f572-134e-414d-b85a-37ff527d69a1%22; rl_user_id=%228ewe4qouwjbj9e48me9wkwzg6w%22; rl_trait=%7B%7D; MMAUTHTOKEN=dxgh3e6tsfyg9g1hra3ug7j8wh; MMUSERID=8tadcnko8fn8fqfed4zkn3dwoe; MMCSRF=ettnd54ukfg1zb1qpzbbwh3jde</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-CSRF-Token</name>
      <type>Main</type>
      <value>ettnd54ukfg1zb1qpzbbwh3jde</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://immense-taiga-87644.herokuapp.com/api/v4/posts</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
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
