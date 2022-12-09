<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<h1 style="color:red;text-align:center">Edit Employee</h1>
<frm:form modelAttribute="emp">
<table bgcolor="cyan" border="0" align="center">
<tr>
<td>EmployeeNo::</td>
<td><frm:input path="empno" readOnly="true"/></td>
</tr>
<tr>
<td>Employee Name::</td>
<td><frm:input path="empname"/></td>
</tr>

<tr>
<td>Employee Job::</td>
<td><frm:select path="job">
<frm:options items="${deptNamesInfo}"/>
</frm:select>
</tr>
<tr>
<td>Employee Salary::</td>
<td><frm:input path="salary"/></td>
</tr>
<tr>
<td>deptNo::</td>
<td><frm:select path="deptno">
<frm:options items="${deptNoInfo}"/>
</frm:select>
</td>
</tr>
<tr>
<td>Employee Status::</td>
<td><frm:input path="status"/></td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
<td><input type="reset" value="cancel"></td>
</tr>
</table>
</frm:form>