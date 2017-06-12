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

    private void cadastrar(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("cadastro")){
            Item item = fabrica.criaObjeto();
            if(TelaAbstract.valida(request, item.getAtributos())){
                api = fabrica.criaApi();
                item = getItem(request);
                api.cadastrar(item);
            }
        } 
    }
    private void excluir(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("exclusao")){
            Item item = fabrica.criaObjeto();
            if(TelaAbstract.valida(request, item.getAtributos())){
                api = fabrica.criaApi();
                item = getItem(request);
                api.cadastrar(item);
                
            }
        } 
    }
    private void autentica(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("autenticacao")){
            Cliente item = (Cliente)fabrica.criaObjeto();
            api = fabrica.criaApi();
            item.setCpf(request.getParameter("cpf"));
            item.setSenha(request.getParameter("senha"));
            TelaAbstract tela = new TelaControleProdutos();
            if(api.existe(item)){
                tela.montapagina(response);
            }else{
                tela.alert("Esse usuario não existe!!!", response.getWriter());
            }
        } 
    }
    
    private void listar(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("operacao").equals("listar")){
            Item item = fabrica.criaObjeto();
            if(TelaAbstract.valida(request, item.getAtributos())){
                api = fabrica.criaApi();
               
            }
        }
    }
    
    private Item getItem(HttpServletRequest request) {
        Cliente item = (Cliente) fabrica.criaObjeto();
        item.setCpf(request.getParameter("cpf"));
        item.setNome(request.getParameter("nome"));
        item.setIdade(request.getParameter("idade"));
        item.setEmail(request.getParameter("email"));
        item.setSenha(request.getParameter("senha"));
        return item;
    }
}
