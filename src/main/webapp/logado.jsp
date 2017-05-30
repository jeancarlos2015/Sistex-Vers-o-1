<%-- 
    Document   : index
    Created on : 06/05/2017, 12:09:08
    Author     : jean
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
    	<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
    	<title> Sistema Web De Gerenciamento FastFood </title>
    	<link rel="stylesheet" href="css/style.css">
    	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    	<link href='https://fonts.googleapis.com/css?family=Lato:400,300,700' rel='stylesheet' type='text/css'>
    	<link rel="icon" href="img/icon.png">
        <script type="text/javascript" src="js/funcoes.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    </head>

    <body>
        <!-- CABEÇALHO -->
        <header class="cabecalho container Home1">
           <a href="index.html"><h1 class="logo"> SISTEC-Especializada em Soluções Digitais </h1></a>
           <button class="btn-menu bg-gradient" ><i class="fa fa-bars fa-lg"></i></button>

           <nav class="menu" id="close1">
               <a class="btn-close"><i class="fa fa-times"></i></a>
               <ul>
                   <li class="home"><a href="index.jsp">Home</a></li>
                   <li class="home"><a href="acesso.jsp">Acesso</a></li>
               </ul>
           </nav>
        </header>

        <!-- SERVICOS -->
         
        <main class="imagem servicos container">
         
                <h1 class="bg-titulo">PRODUTOS</h1>
                <form method="post" action="controlePedidos.jsp" onsubmit="mensagem();">
                    <div class="produtos">
                        
                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/prato.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Prato Personalizado</figcaption>
                        </figure>

                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/tropeiro.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Tropeiro</figcaption>
                        </figure>

                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/espaguete.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Espaguete</figcaption>
                        </figure>
                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/salada.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Espaguete</figcaption>
                        </figure>
                        
                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/refrigerante.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Coca Cola</figcaption>
                        </figure>
                        
                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/fanta.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Coca Cola</figcaption>
                        </figure>
                        
                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/cocazero.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Coca Cola</figcaption>
                        </figure>
                        
                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/prato1.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Coca Cola</figcaption>
                        </figure>
                        
                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/prato2.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Coca Cola</figcaption>
                        </figure>
                        
                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/cocazero.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Coca Cola</figcaption>
                        </figure>
                        
                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/prato1.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Coca Cola</figcaption>
                        </figure>
                        
                        <figure class="figure" >
                            <a href="controlePedidos.jsp"><img class="prato" src="img/prato2.png" alt="..." class="img-thumbnail"></a> 
                            <figcaption class="figure-caption">Coca Cola</figcaption>
                        </figure>
                    </div>
                    
<!--                      
                    <div class="newsletter container bg-grey botaopedido">
                        <button type="submit" class="bg-white radius campo">Solicitar Pedido</button>
                    </div>
                    -->
                </form>
        </main>

        <!-- RODAPÉ -->
        <footer class="rodape container bg-gradient">
          <div class="social-icons">
            <a href="#"><i class="fa fa-facebook"></i></a>
            <a href="#"><i class="fa fa-twitter"></i></a>
            <a href="#"><i class="fa fa-google"></i></a>
            <a href="#"><i class="fa fa-instagram"></i></a>
            <a href="#"><i class="fa fa-envelope"></i></a>
          </div>
          <p class="copyright">
            Copyright © SISTEX 2016. Todos os direitos reservados - Desenvolvido Por Jean Carlos Penas.
        </footer>
        <!-- JQUERY-->
		
		<script>
			$(".btn-menu").click(function(){
				$(".menu").show();
			});
			$(".btn-close").click(function(){
				$(".menu").hide();
			});
		</script>
	</body>

    </body>
</html>

