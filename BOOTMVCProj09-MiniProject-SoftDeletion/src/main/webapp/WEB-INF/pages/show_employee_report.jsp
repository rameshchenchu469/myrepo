<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<c:choose>
<c:when test="${!empty empsList}">
<h1 style="color:blue;text-align:center"><u>Employees Report</u></h1>
<table border="1" align="center" bgcolor="cyan">
<tr style="color:red"><th>empno</th><th>emp name</th><th>job</th><th>salary</th><th>deptNo</th><th>status</th><th>operations</th></tr>
<c:forEach var="emp" items="${empsList}">
<tr style="color:blue">
<td>${emp.empno}</td>
<td>${emp.empname}</td>
<td>${emp.job}</td>
<td>${emp.salary}</td>
<td>${emp.deptno}</td>
<td>${emp.status}</td>
<td><a href="emp_edit?no=${emp.empno}"><image src="images/edit.png" width="30px" height="30px"></a>
<a href="emp_delete?no=${emp.empno}" onclick="return confirm('do you want delete the employee')"><image src="images/delete.png" width="30px" height="30px"></a>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align=center">Employee Not Found</h1>
</c:otherwise>
</c:choose>
<br>
<center><a href="emp_add"><image src="images/emp.png" width="50px" height="50px">Add Employee</a>&nbsp;&nbsp;&nbsp;
<a href="./"><image src="images/home-page.png" width="50px" height="50px">Home</a>
</center>