<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<h1>Save User</h1>

<form:form action="userRegisterSubmit" modelAttribute="userForm" method="POST">
	
 Enter Name :<form:input type="text" id="name" path="name" name="name"  /><br>
 Enter Last Name :<form:input type="text" id="lastName" path="lastName" name="lastName"  /><br>
 Enter Email :<form:input type="text" id="email" path="email" name="email"  /><br>
 Enter status :<form:input type="text" id="status" path="status" name="status"  /><br>
 Enter password :<form:input type="text" id="password" path="password" name="password"  /><br>

  <input type="submit" value="Register" />
          
      </form:form>
      <c:if test="${userRegisterForm.users.size()!=0}">
      <table>
      <tr>
			<td>No#</td>
			<td>Id</td>
			<td>Name</td>
			<td>Last Name</td>
			<td>Mail</td>
			<td>Status</td>
			

		</tr>
      <c:forEach var="user" items="${userRegisterForm.users}" varStatus="s">
      <tr>
      <td>${s.index+1}</td>
      <td>${user.userId}</td>
      <td>${user.name}</td>
      <td>${user.lastName}</td>
      <td>${user.email}</td>
      <td>${user.status}</td>
      
      </tr>
      </c:forEach>
      </table>
      </c:if>