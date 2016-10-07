<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<title>LabSTRUTS2_10</title>
	</head>
	
	<body>
		<h2>Customer Added Successfully.</h2>
		<h2>Iterator Liste Client</h2>

		<!--  
	   	<s:iterator value="%{#attr['Last']}">
	    	<s:property value="monClient.name"/> 
	    </s:iterator>
	    -->
	    <!-- 
	    TODO : Récupérer liste dans la session -->
	   	<s:iterator value="%{#attr['Listing']}" status="iteList">
	   	 	<!--Récupérer objet indépendant dans la liste -->
	   		<s:iterator value="iteList">
	   		 	<!-- Récupérer nom-->
	    		<s:property value="name"/> 
	    	</s:iterator>
	    </s:iterator>	 
	 

	</body>
</html>