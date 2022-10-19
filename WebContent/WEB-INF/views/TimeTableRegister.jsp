<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<h1>Save TimeTable</h1>

<form:form action="timeTableRegisterSubmit" modelAttribute="timeTableForm" method="POST">
  
Select Day:<form:select path="dayId" name="dayId" id="dayId">
  <form:options items="${timeTableRegisterForm.mapDays}"/>
</form:select><br>
Enter Start Time :<form:input type="text" id="startTime" path="startTime" name="startTime"  /><br>
Enter End Time :<form:input type="text" id="endTime" path="endTime" name="endTime"  /><br>
<input type="submit" value="Register" />
</form:form>
      <c:if test="${timeTableRegisterForm.timeTables.size()!=0}">
      <table>
      <tr>
			<td>No#</td>
			<td>Id</td>
	  </tr>
      <c:forEach var="timeTable" items="${timeTableRegisterForm.timeTables}" varStatus="s">
      <tr>
      <td>${s.index+1}</td>
      <td>${timeTable.startTime}</td>
       <td>${timeTable.endTime}</td>
     
      
      </tr>
      </c:forEach>
      </table>
      </c:if>