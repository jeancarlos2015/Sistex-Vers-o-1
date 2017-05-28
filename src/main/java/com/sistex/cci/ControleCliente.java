/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cci;

import cgt.Api;
import com.sistex.cdp.Cliente;
import com.sistex.cdp.Item;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import padroes.Fabrica;
import padroes.Tipo;

/**
 *
 * @author jean
 */
public class ControleCliente extends HttpServlet {

    private Fabrica fabrica = Fabrica.make(Tipo.cliente);
    private Api api;
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Item item = fabrica.criaObjeto();
        boolean libera=true;
        for(String atributo:item.getAtributos()){
            if(!atributo.equals("codigo")){
                if(request.getParameter(atributo)==null){
                    libera=false;
                }
            }
        }
        if(libera){
            item.setCodigo_funcionario(request.getParameter("codigo_funcionario"));
            item.setNome(request.getParameter("nome"));
            item.setIdade(request.getParameter("idade"));
            item.setCpf(request.getParameter("cpf"));
            item.setEmail(request.getParameter("email"));
            item.setSenha(request.getParameter("senha"));
            api = fabrica.criaApi();
            api.cadastrar(item);
        }else{
            out.println("Existe algum dado inválido no envio do formulario");
        }
    }

    

}
