<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<h1>Save PaymentMethod</h1>

<form:form action="paymentMethodRegisterSubmit" modelAttribute="paymentMethodForm" method="POST">
  

 Enter PaymentMethod :<form:input type="text" id="paymentMethods" path="paymentMethods" name="paymentMethods"  /><br>
 Enter CardNumber :<form:input type="text" id="cardNumber" path="cardNumber" name="cardNumber"  /><br>
 Enter CardOwner :<form:input type="text" id="cardOwner" path="cardOwner" name="cardOwner"  /><br>
 Enter SecurityCode :<form:input type="text" id="securityCode" path="securityCode" name="securityCode"  /><br>
 Enter ExpireDate :<form:input type="text" id="expirationDate" path="expirationDate" name="expirationDate"  /><br>

  <input type="submit" value="Register" />
          
      </form:form>
      <c:if test="${paymentMethodRegisterForm.paymentMethods.size()!=0}">
      <table>
      <tr>
			<td>No#</td>
			<td>Payment MethodId</td>
			<td>Payment Methods</td>
			<td>Card Number</td>
			<td>Card Owner</td>
			<td>Security Code</td>
			<td>Expiration Date</td>
			

		</tr>
      <c:forEach var="paymentMethod" items="${paymentMethodRegisterForm.paymentMethods}" varStatus="s">
      <tr>
   
      <td>${s.index+1}</td>
      <td>${paymentMethod.paymentMethodId}</td>
      <td>${paymentMethod.paymentMethods}</td>
      <td>${paymentMethod.cardNumber}</td>
      <td>${paymentMethod.cardOwner}</td>
      <td>${paymentMethod.securityCode}</td>
      <td>${paymentMethod.expirationDate}</td>
      
      </tr>
      </c:forEach>
      </table>
      </c:if>