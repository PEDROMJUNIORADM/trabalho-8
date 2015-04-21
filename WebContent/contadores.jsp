<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>Contadores</title>

	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<link rel="stylesheet" href="./css/bootstrap-theme.min.css">

  </head>
  
  <body>

    <div class="container">
    
      <h1>Contadores de acessos</h1>

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron" style="margin-top: 10px">
        <h1><%= application.getAttribute("countXHTMLRequest") %></h1>
        <p>acesso(s) a páginas ".xhtml". Clique <a href="/trabalho/teste.xhtml">aqui</a> para acessar a página de teste.xhtml</p>
        
        
      </div>
      
      <p>
        <a class="btn btn-lg btn-primary" href="/trabalho" role="button">Voltar para página inicial</a>
      </p>

    </div> <!-- /container -->


  </body>
</html>
