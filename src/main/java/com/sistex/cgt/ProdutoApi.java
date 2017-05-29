/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgt;

import com.sistex.cdp.Item;
import com.sistex.cdp.Produto;
import padroes.Fabrica;
import static padroes.Tipo.produto;

/**
 *
 * @author jean
 */
public class ProdutoApi extends ApiAbstract{

    public ProdutoApi() {
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
    
    
}
