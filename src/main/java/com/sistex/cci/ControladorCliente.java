/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cci;

import com.sistex.cdp.Cliente;
import com.sistex.cdp.Item;
import com.sistex.cih.InteracaoHumana;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import padroes.Fabrica;
import padroes.Tipo;
import com.sistex.cgt.InterfaceControlar;

/**
 *
 * @author jean
 */
public class ControladorCliente extends HttpServlet{

    private final Fabrica fabrica = Fabrica.make(Tipo.cliente);
    private InterfaceControlar api;
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            cadastrar(request, response);
            excluir(request, response);
            listar(request, response);
    }

    public void cadastrar(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("cadastro")){
            Item item = fabrica.criaObjeto();
            if(InteracaoHumana.valida(request, item.getAtributos())){
                api = fabrica.criaApi();
                api.setRequest(request);
                api.cadastrar();
            }else{
                InteracaoHumana.imprime(response,"Existe algum dado inválido no envio do formulario");
            }
        } 
    }
    public void excluir(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("exclusao")){
            Item item = fabrica.criaObjeto();
            if(InteracaoHumana.valida(request, item.getAtributos())){
                api = fabrica.criaApi();
                api.setRequest(request);
                api.excluir();
            }else{
                InteracaoHumana.imprime(response,"");
            }
        } 
    }
    public void autentica(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("autenticacao")){
            Item item = fabrica.criaObjeto();
            api = fabrica.criaApi();
            item.setCpf(request.getParameter("cpf"));
            if(api.existe(item)){
                InteracaoHumana.imprime(response, "Usuario existe!!!");
            }
            
        } 
    }
    
    public void listar(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("listar")){
            Item item = fabrica.criaObjeto();
            if(InteracaoHumana.valida(request, item.getAtributos())){
                api = fabrica.criaApi();
                api.setRequest(request);
                for(Item it:api.listar()){
                    InteracaoHumana.imprime(response, it.getEmail()+it.getNome()+" ");
                }
                
            }else{
                InteracaoHumana.imprime(response,"");
            }
        }
    }
}
