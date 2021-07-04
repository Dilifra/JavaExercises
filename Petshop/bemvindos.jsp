<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html class="h-100">
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Bem vindos</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
		 <link href="sticky-footer.css" rel="stylesheet">
		 <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sticky-footer/">
	</head>
	

    
	<body class="d-flex flex-column h-100">
		<%   
        String nome=request.getParameter("usuario");  
    	String senha=request.getParameter("password");
    	
    	session.setAttribute("identiicadordapessoa",nome);  
    	%>
    	
    	<div class="container-fluid">
    		<header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
      			<a href="index.jsp" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
       			<svg class="bi me-2" width="40" height="32"><img src="https://img.icons8.com/ios/100/000000/dog-pooping.png"/></svg>
        		<span class="fs-4">Simple header</span>
     			</a>

      			<ul class="nav nav-pills">
        			<li class="nav-item"><a href="#" class="nav-link active" aria-current="page">Agendamento</a></li>
      			</ul>
    		</header>
  		</div>
    	
    	
    	<p>Bem vindo <%=nome%>,se voc� deseja agendar uma consulta, preencha o formul�rio:</p>
    	
    	<main class="form-signin">
    		<form action="conclusao.jsp" method='POST'>
    			<fieldset>
    				<legend>Agendamento</legend>
    				
    				<div class="form-floating m-2">
    					<select class="form-control" id="floatingInput" name='animal' placeholder="animal">
    						<option>Gato</option>
    						<option>Cachorro</option>
    					</select>
      					<label for="floatingInput">Animal</label>
    				</div>
    				<div class="form-floating m-2">
      					<input type="date" class="form-control" id="floatingPassword" name='data' placeholder="22112002">
      					<label for="floatingPassword">Data da consulta</label>
    				</div>
    			</fieldset>
    				<button class="w-100 btn btn-lg btn-primary m-2" type="submit">Agendar</button>
  			</form>
  		</main>
  		<footer class="footer mt-auto py-3 bg-dark">
  			<div class="container">
    			<span class="text-muted">Todos os aimais s�o tratados como reis conosco.</span>
  			</div>
		</footer>
	</body>
</html>
