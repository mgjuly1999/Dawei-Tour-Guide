<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<h1>Save Type</h1>

<form:form action="typeRegisterSubmit" modelAttribute="typeForm" method="POST">
Select FoodGroup:<form:select path="foodGroupId" name="foodGroupId" id="foodGroupId">
 <form:options items="${typeRegisterForm.mapFoodGroups}"/>
</form:select><br>
Select Language:<form:select path="languageId" name="languageId" id="languageId">
 <form:options items="${typeRegisterForm.mapLanguages}"/>
</form:select><br>

 Enter Code :<form:input type="text" id="code" path="code" name="code"  /><br>


 
  <input type="submit" value="Register" />
          
      </form:form>
      <c:if test="${typeRegisterForm.types.size()!=0}">
      <table>
      <tr>
			<td>No#</td>
			<td>code</td>
	  </tr>
      <c:forEach var="type" items="${typeRegisterForm.types}" varStatus="s">
      <tr>
      <td>${s.index+1}</td>
      <td>${type.code}</td>
     
      
      </tr>
      </c:forEach>
      </table>
      </c:if>