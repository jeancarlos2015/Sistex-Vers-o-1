/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cih;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jean
 */
public abstract class TelaAbstract {
      
      
      public void montahead(PrintWriter pw, String titulo){
        pw.println(" <head>");
        pw.println(" <meta charset='utf-8'>");
        pw.println(" <meta name='viewport' content='width=device-width, initial-scale=1'>");
        pw.println(" <title>"+titulo+"</title>");
        pw.println("<link rel='stylesheet' href='css/style.css'/>");
        pw.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css'>");
        pw.println("<link href='https://fonts.googleapis.com/css?family=Lato:400,300,700' rel='stylesheet' type='text/css'>");
        pw.println("<link rel='icon' href='img/icon.png'>");
        pw.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>");
        pw.println(" </head>");
    }
    
      public void montaTabela(PrintWriter pw){
          pw.println("<section class='newsletter container bg-white'>");
          pw.println("<div class='panel panel-default'>");
          pw.println("<div class='panel-heading'><h1 class='bg-titulo'>LISTA DE PRODUTOS</h1></div>");
          pw.println("<div class='panel-body'>");
          pw.println("<p>...</p>");
          pw.println("</div>");
          pw.println("<table class='table'>");
          
          pw.println("<thread>");
          pw.println("<tr>");
          pw.println("<th>#</th>");
          pw.println("<th>NOME</th>");
          pw.println("<th>DESCRICAO</th>");
          pw.println("<th>PRECO</th>");
          pw.println("</tr>");
          pw.println("</thread>");
          
          pw.println("<tbody>");
          pw.println("<tr>");
          pw.println("<th scope='row'>1</th>");
          pw.println("<td>Feijao</td>");
          pw.println("<td>Rio Doce</td>");
          pw.println("<td>Preco</td>");
          pw.println("</tr>");
          pw.println("</tbody>");
          pw.println("</table>");
          pw.println("</div>");
          pw.println("</section>");
          
      }
      public void montarodape(PrintWriter pw) {
        pw.println("<footer class='rodape container bg-gradient'>");
        pw.println("<div class='social-icons'>");
        pw.println("<a href='#'><i class='fa fa-facebook'></i></a>");
        pw.println("<a href='#'><i class='fa fa-twitter'></i></a>");
        pw.println("<a href='#'><i class='fa fa-google'></i></a>");
        pw.println("<a href='#'><i class='fa fa-instagram'></i></a>");
        pw.println("<a href='#'><i class='fa fa-envelope'></i></a>");
        pw.println("</div>");
        pw.println("<p class='copyright'>");
        pw.println("Copyright © SisPedidos 2016. Todos os direitos reservados - Desenvolvido Por Jean Carlos Penas.");
        pw.println("</footer>");
        pw.println("<script>");
        pw.println("$('.btn-menu').click(function(){");
        pw.println("$('.menu').show();");
        pw.println("});");
        pw.println("$('.btn-close').click(function(){");
        pw.println("$('.menu').hide();");
        pw.println("});");
        pw.println("</script>"); 
    }
    public void criaItemMenu(PrintWriter pw,String classe, String url, String item){
        pw.println("<li class='"+classe+"'><a href='"+url+"'>"+item+"</a></li>");
    }
    public void criaCampo(PrintWriter pw, String nome, String placeholder){
        pw.println("<input class='bg-white radius campo' type='text'  name='"+nome+"' placeholder='"+placeholder+"' required>");
    }
    public void criaCampoSenha(PrintWriter pw, String nome, String placeholder){
        pw.println("<input class='bg-white radius campo' type='password'  name='"+nome+"' placeholder='"+placeholder+"' required>");
    }
    public void criaCampoOculto(PrintWriter pw, String tipo, String value){
        pw.println("<input class='oculto' type='text' value='"+value+"'  name='"+tipo+"'>");
    }
    public void criaBotao(PrintWriter pw, String descricao){
        pw.println("<button type='submit' class='bg-white radius campo'> "+descricao+"</button>");
    }
    
    public static boolean valida(HttpServletRequest request, String[] atributos){
        
        for(String atributo:atributos){
            if(!atributo.equals("codigo")){
                if(request.getParameter(atributo)==null){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void montapagina(HttpServletResponse response){
        
    }
    
    public void montamenu(PrintWriter pw) {}
    public void montacampos(PrintWriter pw, String titulo){}
    public void montabody(PrintWriter pw, String titulo){}
      
      
}
