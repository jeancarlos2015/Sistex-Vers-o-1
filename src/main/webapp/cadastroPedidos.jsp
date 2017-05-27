<%-- 
    Document   : CadastroPedidos
    Created on : 06/05/2017, 12:06:53
    Author     : jean
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
    	<title> CADASTRO DE PEDIDOS </title>
    	<link rel="stylesheet" href="css/style.css">
    	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    	<link href='https://fonts.googleapis.com/css?family=Lato:400,300,700' rel='stylesheet' type='text/css'>
    	<link rel="icon" href="img/icon.png">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    </head>
    <body>
<!-- Cabeçalho da pagina -->
        <header class="cabecalho container">
            <a href="index.html"><h1 class="logo"> SISTEC-Especializada em Soluções Digitais </h1></a>
            <button class="btn-menu bg-gradient"><i class="fa fa-bars fa-lg"></i></button>
            <nav class="menu" id="close1">
               <a class="btn-close"><i class="fa fa-times"></i></a>
               <ul>
                   <li class="home"><a href="index.jsp">Home</a></li>
                   <li class="acesso123"><a href="cadastroPedidos.jsp">Pedidos</a></li>
                   <li class="sobre"><a href="cadastroProdutos.jsp">Produtos</a></li>
                   <li class="contato"><a href="cadastroClientes.jsp">Clientes</a></li>

               </ul>
           </nav>
        </header>
<!-- Formulario de cadastro  -->
        <section class="newsletter container bg-grey">
            <h1 class="bg-titulo">CADASTRO DE PEDIDOS</h1>
            <form method="post" action="CadastroPedido" onsubmit="mensagem();">
                <input class="bg-white radius campo" type="text"  name="codigo" placeholder="Digite o código" required>
                <input class="bg-white radius campo" type="text" name="descricao" placeholder="Coloque a descrição" required>
                <input class="bg-white radius campo" type="text"  name="marca" placeholder="Coloque a marca" required>
                <input class="bg-white radius campo" type="text"  name="quantidade" placeholder="Digite a quantidade" required>
                <button type="submit" class="bg-white radius campo"> Cadastrar Pedido</button>
            </form>
        </section>

<!-- Rodapé da página  -->
        <footer class="rodape container bg-gradient">
        <div class="social-icons">
          <a href="#"><i class="fa fa-facebook"></i></a>
          <a href="#"><i class="fa fa-twitter"></i></a>
          <a href="#"><i class="fa fa-google"></i></a>
          <a href="#"><i class="fa fa-instagram"></i></a>
          <a href="#"><i class="fa fa-envelope"></i></a>
        </div>
        <p class="copyright">
          Copyright © SisPedidos 2016. Todos os direitos reservados - Desenvolvido Por Jean Carlos Penas.
      </footer>
        <script>
			$(".btn-menu").click(function(){
				$(".menu").show();
			});
			$(".btn-close").click(function(){
				$(".menu").hide();
			});
        </script>
    </body>
</html>
