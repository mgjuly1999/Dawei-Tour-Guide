<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<h1>Save Order Form</h1>

<form:form action="OrderFormRegisterSubmit" modelAttribute="orderFormForm" method="POST">

 Enter Phone :<form:input type="text" id="phone" path="phone" name="phone"  /><br>
 Enter Email :<form:input type="text" id="email" path="email" name="email"  /><br>
 Enter Full Address :<form:input type="text" id="fullAddress" path="fullAddress" name="fullAddress"  /><br>
 Enter Postal Code :<form:input type="text" id="postalCode" path="postalCode" name="postalCode"  /><br>
 Enter City :<form:input type="text" id="city" path="city" name="city"  /><br>
 Enter Notes :<form:input type="text" id="notes" path="notes" name="notes"  /><br>
 Enter Delivery Time :<form:input type="text" id="deliveryTime" path="deliveryTime" name="deliveryTime"  /><br>
 Enter Delivery Day :<form:input type="text" id="deliveryDay" path="deliveryDay" name="deliveryDay"  /><br>
 Enter Session :<form:input type="text" id="session" path="session" name="session"  /><br>
 
  <input type="submit" value="Register" />
          
      </form:form>
      <c:if test="${orderFormRegisterForm.orderForms.size()!=0}">
      <table>
      <tr>
			<td>No#</td>
			<td>OrderFormId</td>
			<td>Phone</td>
			<td>Email</td>
			<td>FullAddress</td>
			<td>PostalCode</td>
			<td>City</td>
			<td>Notes</td>
			<td>DeliveryTime</td>
			<td>DeliveryDay</td>
			<td>Session</td>
			

		</tr>
      <c:forEach var="orderForm" items="${orderFormRegisterForm.orderForms}" varStatus="s">
      <tr>
   
      <td>${s.index+1}</td>
      <td>${orderForm.orderFormId}</td>
      <td>${orderForm.phone}</td>
      <td>${orderForm.email}</td>
      <td>${orderForm.fullAddress}</td>
      <td>${orderForm.postalCode}</td>
      <td>${orderForm.city}</td>
      <td>${orderForm.notes}</td>
      <td>${orderForm.deliveryDay}</td>
      <td>${orderForm.deliveryTime}</td>
      <td>${orderForm.session}</td>
      </tr>
      </c:forEach>
      </table>
      </c:if>