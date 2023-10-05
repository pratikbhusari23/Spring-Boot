<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>

<h1> Hii from SignUp Page</h1>

<form:form action="registerUser"  modelAttribute="user">
    name:
<form:input path="name" />
<br/>
Gender:
    <br/>
    Male<form:radiobutton path="gender"  value="male"/>
    Female<form:radiobutton path="gender" value="Female"/>
<br/>

location:
    
<form:select path="location">
    <form:option value="India"></form:option>
    <form:option value="NRI"></form:option>

</form:select>
<br/>
<br/>

college:
<form:select path="college">
    <form:option value="123"></form:option>
    <form:option value="456"></form:option>
</form:select>
<br/>

<input type="submit" value="Submit"/>

</form:form>
</body>
</html>