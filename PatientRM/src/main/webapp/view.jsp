<%@ page import="java.util.List" %>
<%@ page import="explore.Patient" %><%--
  Created by IntelliJ IDEA.
  User: SRDB
  Date: 22-08-2025
  Time: 12:02 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="gct" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%--    <% List<Patient> records = (List<Patient>) request.getAttribute("people");%>--%>

    <table>
        <thead>
            <tr>
                <th>Patient Id</th>
                <th>Patient Name</th>
                <th>Patient Weight</th>
            </tr>
        </thead>
        <tbody>
            <gct:choose>
                <gct:when test="${not empty people}">
                    <gct:forEach var="temp" items="${people}">
                        <tr>
                            <td>${temp.patientId}</td>
                            <td style="color: brown">${temp.patientName}</td>
                            <td style="color: blue">
                                    <fmt:formatNumber pattern="##.##" value="${temp.weight}" />
<%--                                        <fmt:formatNumber type="currency" value="${temp.weight}" />--%>
                            </td>
                        </tr>
                    </gct:forEach>
                </gct:when>
                <gct:otherwise>
                    <p>No Patients are available</p>
                </gct:otherwise>
            </gct:choose>

<%--            <% if (records.size() > 0) {%>--%>
<%--                <%for(Patient temp : records){%>--%>
<%--                <tr>--%>
<%--                    <td><% out.print(temp.getPatientId());%></td>--%>
<%--                    <td><% out.print(temp.getPatientName());%></td>--%>
<%--                    <td><% out.print(temp.getContactNo());%></td>--%>
<%--                </tr>--%>
<%--                <%}%>--%>
<%--                <%}else{%>--%>
<%--                    <p>No PAtients to be listed</p>--%>
<%--                <%}%>--%>
<%--            <% if (records.size() > 0) {%>--%>
<%--                <%for(Patient temp : records){%>--%>
<%--                    <tr>--%>
<%--                        <td><%=temp.getPatientId()%></td>--%>
<%--                        <td><%=temp.getPatientName()%></td>--%>
<%--                        <td><%=temp.getContactNo()%></td>--%>
<%--                    </tr>--%>
<%--                <%}%>--%>
<%--            <%}else{%>--%>
<%--            <p>No PAtients to be listed</p>--%>
<%--            <%}%>--%>
        </tbody>
    </table>
</body>
</html>
