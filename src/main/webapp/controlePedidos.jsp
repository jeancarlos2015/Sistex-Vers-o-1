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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        
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
                   <li class="acesso123"><a href="controlePedidos.jsp">Pedidos</a></li>
                   <li class="sobre"><a href="controleProdutos.jsp">Produtos</a></li>
                   <li class="contato"><a href="controleClientes.jsp">Clientes</a></li>
                   <li class="contato"><a href="controleFuncionarios.jsp">Funcionários</a></li>

               </ul>
           </nav>
        </header>
<!-- Formulario de cadastro  -->
        <section class="newsletter container bg-grey">
            <h1 class="bg-titulo">CADASTRO DE PEDIDOS</h1>
            <form method="post" action="Controlador" onsubmit="mensagem();">
                <input class="bg-white radius campo" type="text"  name="codigo_cliente" placeholder="Codigo do cliente" required>
                <input class="bg-white radius campo" type="text" name=codigo_produto" placeholder="Codigo do produto" required>
                <input class="bg-white radius campo" type="text"  name="descricao" placeholder="Descricao" required>
                <input class="bg-white radius campo" type="text"  name="preco" placeholder="Digite o preço" required>
                <input class="oculto" type="text" value="pedido"  name="tipo">
                <input class="oculto" type="text" value="cadastro"  name="operacao">
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
