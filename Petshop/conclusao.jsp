<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html class="h-100">
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Consulta Agendada</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
		<link href="sticky-footer.css" rel="stylesheet">
		<link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sticky-footer/">
	</head>
		<body class="text-center d-flex flex-column h-100">
			<%   
        		String nome = request.getParameter("usuario");  
    			String animal = request.getParameter("animal"); 
    			String data = request.getParameter("data");
    		%>
    		
        	<div class="container">
    			<header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
      				<a href="index.jsp" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
       				<svg class="bi me-2" width="40" height="32"><img src="https://img.icons8.com/ios/100/000000/dog-pooping.png"/></svg>
        			<span class="fs-4">Simple header</span>
     				</a>

      				<ul class="nav nav-pills">
        				<li class="nav-item"><a href="bemvindos.jsp" class="nav-link active" aria-current="page">Agendamento</a></li>
      				</ul>
    			</header>
  			</div>
  		
    		<h1>Consulta agendada com sucesso!</h1>
    		<p>Caro <%=nome %>, a consulta do seu <%=animal %> foi agendada para <%=data %></p>
    		
    		<footer class="footer mt-auto py-3 bg-dark">
  				<div class="container">
    				<span class="text-muted">Todos os aimais s�o tratados como reis conosco.</span>
  				</div>
			</footer>
    				
	</body>
	</html>
