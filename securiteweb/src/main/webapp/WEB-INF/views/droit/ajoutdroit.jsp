<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajout Droit</title>

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
			<h2>Ajout Nouveau Droit</h2>
			
				<form action="/securiteweb/DroitServlet" method="post">
			    	
			    	<div class="row">
					   	<div class="col-6">
							<label for="namedroit">Description droit</label> 
							<input type="text"
								class="form-control" id="namedroit" placeholder="Exemple : Droit_Admin"
								name="namedroit" required>
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
			      <th scope="Description">DESCRIPTION</th>
			    </tr>
			  </thead>
			  <tbody>
			      <c:forEach items="${ droits }" var="droit">
			      	 <tr>
					 	<td><c:out value="${ droit.id }"></c:out></td>
					 	<td><c:out value="${ droit.name }"></c:out></td>
					 </tr>
				  </c:forEach>
			  </tbody>
			</table>
		</div>	
	</div>
	</div>
</body>
</html>