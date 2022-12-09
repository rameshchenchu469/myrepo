<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<h1 style="color:red;text-align:center">Register Employee</h1>
<frm:form modelAttribute="emp">
<table align="center" border="0" bgcolor="cyan">
<tr>
<td>EmployeeName::</td>
<td><frm:input path="empname"/></td>
</tr>
<tr>
<td>EmployeeJob::</td>
<td><frm:select path="job">
<frm:options items="${deptNamesInfo}"/>
</frm:select>
</tr>
<tr>
<td>EmployeeSalary::</td>
<td><frm:input path="salary"/></td>
</tr>
<tr>
<td>deptNo::</td>
<td><frm:select path="deptno">
<frm:options items="${deptNoInfo}"/>
</frm:select>
</tr>
<tr>
<td>Employee Status::</td>
<td><frm:input path="status"/></td>
</tr>
<tr>
<td><input type="submit" value="submit"/></td>
<td><input type="reset" value="cancel"/></td>
</tr>

</table>
</frm:form>