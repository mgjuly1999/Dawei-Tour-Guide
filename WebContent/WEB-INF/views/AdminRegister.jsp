<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<h1>Save Admin</h1>

<form:form action="AdminRegisterSubmit" modelAttribute="adminForm" method="POST" enctype="multipart/form-data">
 Enter Name :<form:input type="text" id="name" path="name" name="name"  /><br>
 Enter Email :<form:input type="text" id="email" path="email" name="email"  /><br>
 Enter status :<form:input type="text" id="status" path="status" name="status"  /><br>
 Enter Phone :<form:input type="text" id="phone" path="phone" name="phone"  /><br>
 Select Role:<form:select path="roleId" name="roleId" id="roleId">
  <form:options items="${adminRegisterForm.mapAdminRoles}"/>
</form:select><br>
 Enter password :<form:input type="text" id="password" path="password" name="password"  /><br>
Select Files  :
<form:input type="file" path="imageFiles" name="imageFiles" id="imageFiles" multiple="multiple"/>
  <input type="submit" value="Register" />
          
      </form:form>
      <c:if test="${adminRegisterForm.admins.size()!=0}">
      <table>
      <tr>
			<td>No#</td>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Status</td>
			

		</tr>
      <c:forEach var="admin" items="${adminRegisterForm.admins}" varStatus="s">
      <tr>
      <td>${s.index+1}</td>
      <td>${admin.adminId}</td>
      <td>${admin.name}</td>
      <td>${admin.email}</td>
      <td>${admin.phone}</td>
      <td>${admin.status}</td>
      
      </tr>
      </c:forEach>
      </table>
      </c:if>