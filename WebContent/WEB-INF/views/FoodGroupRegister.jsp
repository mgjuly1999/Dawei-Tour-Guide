<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<h1>Save Admin</h1>

<form:form action="FoodGroupRegisterSubmit" modelAttribute="foodGroupForm" method="POST">
 Select Language:<form:select path="languageId" name="languageId" id="languageId">
 <form:options items="${foodGroupRegisterForm.mapLanguages}"/>
</form:select><br>
 Enter Code :<form:input type="text" id="code" path="code" name="code"  /><br>
 Enter groupName :<form:input type="groupName" id="groupName" path="groupName" name="groupName"  /><br>

 
  <input type="submit" value="Register" />
          
      </form:form>
      <c:if test="${FoodGroupRegisterForm.admins.size()!=0}">
      <table>
      <tr>
			<td>No#</td>
			<td>code</td>
	  </tr>
      <c:forEach var="foodGroup" items="${foodGroupRegisterForm.foodGroups}" varStatus="s">
      <tr>
      <td>${s.index+1}</td>
      <td>${foodGroup.code}</td>
     
      
      </tr>
      </c:forEach>
      </table>
      </c:if>