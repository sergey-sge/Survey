<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Survey</title>
</head>
<body>
<form action="/stat" method="post">
        Name: <input type="text" name="name"><br>
        LastName: <input type="text" name="lastName"><br>
        Age: <input type="text" name="lastName"><br>
        Sex: <br>
        <input type="radio" name="sex" value="male">Male<br>
        <input type="radio" name="sex" value="female">Female<br>
        Family Status: <br>
        <input type="radio" name="status" value="married">Married<br>
        <input type="radio" name="status" value="single">Single<br>
        Work: <br>
        <input type="radio" name="work" value="work">Work<br>
        <input type="radio" name="work" value="study">Study<br>

        <input type="submit">
</form>
</body>
</html>