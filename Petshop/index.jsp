<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html class="h-100">
  <head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Petshop</title>
	<link href="css/main.css" rel="stylesheet" >
	<link href="css/signin.css" rel="stylesheet">
	<link href="sticky-footer.css" rel="stylesheet">
	<link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sticky-footer/">
  </head>
 
  <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
  </style>
    
  <body class="text-center d-flex flex-column h-100">
	<main class="form-signin">
		<form action="bemvindos.jsp" method='POST'>
			<img class="mb-4" src="https://img.icons8.com/ios/100/000000/dog-pooping.png" alt="" width="72" height="57">
    		<h1 class="h3 mb-3 fw-normal">Please sign in</h1>

    		<div class="form-floating">
      			<input type="text" class="form-control" id="floatingInput" name='usuario' placeholder="name@example.com">
      			<label for="floatingInput">Nome</label>
    		</div>
    		<div class="form-floating">
      			<input type="password" class="form-control" id="floatingPassword" name='password' placeholder="Password">
      			<label for="floatingPassword">Senha</label>
    		</div>
    		<button class="w-100 btn btn-lg btn-primary" type="submit">Entrar</button>
  		</form>
	</main>
	<footer class="footer mt-auto py-3 bg-dark">
  		<div class="container-fluid">
    		<span class="text-muted">Todos os aimais s�o tratados como reis conosco.</span>
  		</div>
	</footer>
  </body>
</html>
