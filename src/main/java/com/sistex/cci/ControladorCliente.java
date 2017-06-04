/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cci;

import com.sistex.cdp.Cliente;
import com.sistex.cdp.Item;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import padroes.Fabrica;
import padroes.Tipo;
import com.sistex.cgt.InterfaceControlar;
import com.sistex.cih.TelaAbstract;
import com.sistex.cih.TelaControleClientes;
import com.sistex.cih.TelaControleProdutos;

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
            autentica(request, response);
    }

    public void cadastrar(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("cadastro")){
            Item item = fabrica.criaObjeto();
            if(TelaAbstract.valida(request, item.getAtributos())){
                api = fabrica.criaApi();
                api.setRequest(request);
                api.cadastrar();
            }
        } 
    }
    public void excluir(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("exclusao")){
            Item item = fabrica.criaObjeto();
            if(TelaAbstract.valida(request, item.getAtributos())){
                api = fabrica.criaApi();
                api.setRequest(request);
                api.excluir();
               // TelaAbstract.imprime(response,"Exclusão feita");
            }
        } 
    }
    public void autentica(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("autenticacao")){
            Cliente item = (Cliente)fabrica.criaObjeto();
            api = fabrica.criaApi();
            item.setCpf(request.getParameter("cpf"));
            item.setSenha(request.getParameter("senha"));
            TelaAbstract tela = new TelaControleProdutos();
            if(api.existe(item)){
                tela.montapagina(response);
            }
            
        } 
    }
    
    public void listar(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("listar")){
            Item item = fabrica.criaObjeto();
            if(TelaAbstract.valida(request, item.getAtributos())){
                api = fabrica.criaApi();
                api.setRequest(request);
                for(Item it:api.listar()){
                    
                }
            }
        }
    }
}
