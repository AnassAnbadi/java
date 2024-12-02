<%@page import="web.CreditModul"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
CreditModul c = (CreditModul) request.getAttribute("creditModel");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Credit bancaire</title>
</head>
<body>
<div>
	<form action="ControllerServlet.java" method="post">
	
		<div>
		<label>Montant : </label>
		<input type="text" name="montant"/>
		</div>
		
		<div>
		<label>Taux : </label>
		<input type="text" name="taux"/>
		</div>
		
		<div>
		<label>Duree : </label>
		<input type="text" name="duree"/>
		</div>
		<button type="submit">Submit</button>
		 
	</form>

</div>

<div>
<p></p>
<div>
Mensualite = <%=c.getMons()%>
</div>
</div>

</body>
</html>