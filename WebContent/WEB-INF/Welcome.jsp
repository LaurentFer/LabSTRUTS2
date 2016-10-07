<%@ page contentType="text/html; charset=UTF-8" %>
<%@	taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
	<head>
		<title>Welcome</title>
	</head>
	
	<body>
		<table border="0">
		<tr>
		
			<td>
				<s:url id="url" action="Welcome">
					<s:param name="request_locale">fr</s:param>
				</s:url>
				<s:a href="%{url}"><s:text name="label.languefr"/></s:a>
			</td>
			
			<td>
				<s:url id="url" action="Welcome">
					<s:param name="request_locale">en</s:param>
				</s:url>
				<s:a href="%{url}"><s:text name="label.langueen"/></s:a>
			</td>
			
		</tr>
	</table>
		
		<h2><s:text name="Welcome.message"/> <s:property value="%{#attr['nom']}"/>...!</h2>
	</body>
</html>