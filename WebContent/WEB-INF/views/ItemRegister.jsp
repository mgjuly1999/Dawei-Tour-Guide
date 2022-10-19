<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<h1>Save Item</h1>

<form:form action="itemRegisterSubmit" modelAttribute="itemForm" method="POST">
Enter item price:<form:input type="text" id="price" path="price" name="price"  /><br>
Enter item qty:<form:input type="text" id="qty" path="qty" name="qty"  /><br>
Enter deliverCostPerMeter:<form:input type="text" id="deliverCostPerMeter" path="deliverCostPerMeter" name="deliverCostPerMeter"  /><br>
Select Type:<form:select path="typeId" name="typeId" id="typeId">
  <form:options items="${itemRegisterForm.mapTypes}"/>
</form:select><br>
Select ingredient:<form:select path="ingredientId" name="ingredientId" id="ingredientId">
  <form:options items="${itemRegisterForm.mapIngredients}"/>
</form:select><br>
Select itemOption:<form:select path="itemOptionId" name="itemOptionId" id="itemOptionId">
  <form:options items="${itemRegisterForm.mapItemOptions}"/>
</form:select><br>
 Enter Origin Name:<form:input type="text" id="itemOriginalName" path="itemOriginalName" name="itemOriginalName"  /><br>


 
  <input type="submit" value="Register" />
          
      </form:form>
      <c:if test="${itemRegisterForm.types.size()!=0}">
      <table>
      <tr>
			<td>No</td>
			<td>Id</td>
			<td>Origin Name</td>
	  </tr>
      <c:forEach var="item" items="${itemRegisterForm.items}" varStatus="s">
      <tr>
      <td>${s.index+1}</td>
      <td>${item.itemId}</td>
      <td>${item.itemOriginalName}</td>
     
      
      </tr>
      </c:forEach>
      </table>
      </c:if>