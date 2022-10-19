<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<h1>Save Shop</h1>

<form:form action="shopRegisterSubmit" modelAttribute="shopForm" method="POST">
 	
 Enter Shop Name :<form:input type="text" id="name" path="name" name="name"  /><br>
 Enter street :<form:input type="text" id="street" path="street" name="street"  /><br>
 Enter City :<form:input type="text" id="city" path="city" name="city"  /><br>
 Enter PostalCode :<form:input type="text" id="postalCode" path="postalCode" name="postalCode"  /><br>
 Enter FullAddress :<form:input type="text" id="fullAddress" path="fullAddress" name="fullAddress"  /><br>	
 Enter Quarter :<form:input type="text" id="quarter" path="quarter" name="quarter"  /><br>
 Enter lat :<form:input type="text" id="lat" path="lat" name="lat"  /><br>
 Enter laung :<form:input type="text" id="laung" path="laung" name="laung"  /><br>
 Enter phone :<form:input type="text" id="phone" path="phone" name="phone"  /><br>
 Select LinkType:<form:select path="linkTypeId" name="linkTypeId" id="linkTypeId">
 <form:options items="${shopRegisterForm.mapLinkTypes}"/>
</form:select><br>
 Enter Link :<form:input type="text" id="link" path="link" name="link"  /><br>
 Enter mediaType :<form:input type="text" id="mediaType" path="mediaType" name="mediaType"  /><br>
 Enter description :<form:input type="text" id="description" path="description" name="description"  /><br>
 Enter aboutUs :<form:input type="text" id="aboutUs" path="aboutUs" name="aboutUs"  /><br>
  <input type="submit" value="Register" />
          
      </form:form>
      <c:if test="${shopRegisterForm.shops.size()!=0}">
      <table>
      <tr>
			<td>No#</td>
			<td>ShopId</td>
			<td>ShopName</td>
			<td>Street</td>
			<td>City</td>
			<td>PostalCode</td>
			<td>FullAddress</td>
			<td>Quarter</td>
			<td>Lat</td>
			<td>Laung</td>
			<td>Phone</td>
			

		</tr>
      <c:forEach var="shop" items="${shopRegisterForm.shops}" varStatus="s">
     
      <tr>
      <td>${s.index+1}</td>
      <td>${shop.shopId}</td>
     
      <td>${shop.name}</td>
      <td>${shop.createDate}</td>
      </tr>
      </c:forEach>
      </table>
      </c:if>