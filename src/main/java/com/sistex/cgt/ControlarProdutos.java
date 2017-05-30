/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgt;

import com.sistex.cdp.Item;
import com.sistex.cdp.Produto;
import java.util.List;
import padroes.Fabrica;
import static padroes.Tipo.produto;

/**
 *
 * @author jean
 */
public class ControlarProdutos extends Controlar{

    public ControlarProdutos() {
        super(Fabrica.make(produto));
    }

    @Override
    public Item getItem() {
        Produto item = (Produto) fabrica.criaObjeto();
        item.setNome(request.getParameter("nome"));
        item.setDescricao(request.getParameter("descricao"));
        item.setPreco(request.getParameter("preco"));
        item.setMarca(request.getParameter("marca"));
        item.setQuantidade(request.getParameter("quantidade"));
        
        
        return item;
    }

    @Override
    public boolean solicitarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> monitorarPedidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
    
}
