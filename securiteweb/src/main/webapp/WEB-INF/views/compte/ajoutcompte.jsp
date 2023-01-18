<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajout compte</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

</head>
<body>
	<div class="container">
	<%@ include file="../../menu.jsp" %>
	<hr>
		<div class="card card-body">
			<h2>Ajout Nouveau Compte</h2>
				
			<form action="/securiteweb/CompteServlet" method="post">
			    	
			    	<div class="row">
					   	<div class="col-6">
							<label for="username">Username</label> 
							<input type="text"
								class="form-control" id="username" placeholder="Exemple : samantha"
								name="username" required>
						</div>
  					</div>
  					<div class="row">
					   	<div class="col-6">
							<label for="password">Password</label> 
							<input type="text"
								class="form-control" id="password" placeholder="Complexité souhaité..."
								name="password" required>
						</div>
  					</div>
  					<div class="col">
  							<button type="submit" class="btn btn-primary" style="margin:30px;width:200px;" >Submit</button>
  						</div>				
			    </form>
		</div>	
	
	<hr>
		<div class="card card-body">
			<h2>Compte Management Droit</h2>
			<table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="ID">ID</th>
			      <th scope="Username">USERNAME</th>
			      <th scope="Password">PASSWORD</th>
			    </tr>
			  </thead>
			  <tbody>
			      <c:forEach items="${ comptes }" var="compte">
			      	 <tr>
					 	<td><c:out value="${ compte.id }"></c:out></td>
					 	<td><c:out value="${ compte.username }"></c:out></td>
					 	<td><c:out value="${ compte.password }"></c:out></td>
					 </tr>
				  </c:forEach>
			  </tbody>
			</table>
		</div>	
	</div>
	</div>
</body>
</html>