<%@ page import="java.util.List" %>
<%@ page import="explore.Patient" %><%--
  Created by IntelliJ IDEA.
  User: SRDB
  Date: 22-08-2025
  Time: 03:42 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bean handling</title>
</head>
<body>
    <jsp:useBean id="obj" class="explore.Patient">
        <jsp:setProperty name="obj" property="*"/>
<%--        <jsp:setProperty name="obj" property="patientId" value="${patientId}"/>--%>
    </jsp:useBean>
<%--    <h1>${obj.contactNo}</h1>--%>
    <%
        List<Patient> pat =(List<Patient>) session.getAttribute("people");
        pat.add(obj);
        response.sendRedirect("/PatientRM_war/list");
    %>
</body>
</html>
