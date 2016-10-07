<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<title>Customer Form - LabSTRUTS2_10</title>
	</head>
	
	<body>
		<h2>Customer Form</h2>
		<s:form action="customer.action" method="post" validate="true">
			<s:textfield name="monClient.name" key="name" size="20"/>
			<s:textfield name="monClient.age" key="age" size="20" />
			<s:textfield name="monClient.mail" key="mail" size="20" />
			<s:textfield name="monClient.phone" key="phone" size="20" />
			<s:submit method="execute" key="label.add.customer" align="center" />
		</s:form>
	</body>
</html>
