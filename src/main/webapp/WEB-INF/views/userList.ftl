<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/userList.css" rel="stylesheet" type="text/css" />
<title>Vartotojai</title>
</head>
<body>
<style>
	h1{ color:red;}
	</style>
<h1>Vartotoju sarasas</h1>
<table>
	<tr>
		<th>Id</th>
		<th>Vardas</th>
		<th>El. Pastas</th>
		<th>Metai</th>
	</tr>
	<#list users as user>
		<tr>
			<td><a href="/FirstProject/user/${user.id}">${user.id}</a></td>
			<td>${user.name}</td>
			<td>${user.email}</td>
			<td>${user.age}</td>
			<td><a href="/FirstProject/delete/${user.id}">Trinti</a></td>
			<td><a href="/FirstProject/update/${user.id}">Redaguoti</a></td>
		</tr>
	</#list>
</table>
<a href="/FirstProject/addUser">Prideti vartotoja</a>
</body>
</html>