<%@ page contentType="text/html; charset=UTF-8" %>
<%@	taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
	<head>
		<title>Struts 2 - Login Application</title>
	</head>
	
	<body>
		<h2>Struts 2 - Login Application</h2>
		<s:actionerror />
		<s:form action="login.action" method="post">
			<s:textfield name="utilisateur.username" key="label.username" size="20" />
			<s:password name="utilisateur.password" key="label.password" size="20" />
			<s:submit method="execute" key="label.login" align="center" />
		</s:form>
		
	</body>
</html>