/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cci;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import padroes.Fabrica;
import static padroes.Tipo.cliente;
import static padroes.Tipo.funcionario;
import static padroes.Tipo.none;
import static padroes.Tipo.pedido;
import static padroes.Tipo.produto;

/**
 *
 * @author jean
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {
    private Fabrica fabrica;
    private HttpServlet controle;
    
    private Fabrica getFabrica(HttpServletRequest request){
        switch(request.getParameter("tipo")){
                case "pedido":
                    return Fabrica.make(pedido);
                case "produto":
                    return Fabrica.make(produto);
                case "cliente":
                    return Fabrica.make(cliente);
                case "funcionario":
                    return Fabrica.make(funcionario);
                default:
                    return Fabrica.make(none);
              
        }
    }
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            fabrica = getFabrica(request);
            controle = fabrica.criaControle();
            controle.service(request, response);
        
    }
 
    
}
