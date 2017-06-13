/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cih;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jean
 */
public class TelaControleClientes extends TelaAbstract{
   
    public void inicioHtml(HttpServletResponse response) throws IOException{
        PrintWriter pw = response.getWriter();
            pw.println("<!DOCTYPE html>");
            pw.println(" <html lang='pt-br'>");
    }
   public void fimHtml(PrintWriter pw){
       pw.println("</html>");
   }
    @Override
    public void montapagina(HttpServletResponse response){
        PrintWriter pw = null;
        try {
            inicioHtml(response);
            montahead(pw, "CONTROLE DE CLIENTES");
            montabody(pw, "CONTROLE DE CLIENTES");
            fimHtml(pw);
            
        } catch (IOException ex) {
            Logger.getLogger(TelaControleClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }
        
    @Override
    public void montabody(PrintWriter pw, String titulo){
        pw.println("<body>");
        montamenu(pw);
        montacampos(pw,titulo);
        montaTabela(pw,titulo);
        montarodape(pw);
        pw.println("</body>");
    }

    @Override
    public void montamenu(PrintWriter pw) {
        pw.println("<header class='cabecalho container'>");
        pw.println("<a href='index.html'><h1 class='logo'> SISclientes</h1></a>");
        pw.println("<button class='btn-menu bg-gradient'><i class='fa fa-bars fa-lg'></i></button>");
        pw.println("<nav class='menu' id='close1'>");
        pw.println("<a class='btn-close'><i class='fa fa-times'></i></a>");
        pw.println("<ul>");
        criaItemMenu(pw, "home", "produtos.jsp", "Consulta de Produtos");
        criaItemMenu(pw, "home", "acesso.jsp", "Logout");
        criaItemMenu(pw, "acesso123","pedidos.jsp", "Solicitacao de Pedidos");
        pw.println("</ul>");
        pw.println("</nav>");
        pw.println("</header>");
    }

    @Override
    public void montacampos(PrintWriter pw, String titulo) {
        pw.println("<section class='newsletter container bg-grey'>");
        pw.println("<h1 class='bg-titulo'>"+titulo+"</h1>");
        pw.println("<form method='post' action='Controlador'>");
        criaCampo(pw, "nome", "Nome do cliente");
        criaCampo(pw, "idade", "Idade do cliente");
        criaCampo(pw, "cpf", "CPF do cliente");
        criaCampo(pw, "email", "Email do Cliente");
        criaCampoSenha(pw, "senha", "Senha do Cliente");
        criaCampoOculto(pw, "tipo", "cliente");
        criaCampoOculto(pw, "operacao", "cadastro");
        criaBotao(pw, "Cadastrar Clientes");
        pw.println("</form>");
        pw.println("</section>");
    }

    
    

}
