/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgt;

import com.sistex.cdp.Item;
import com.sistex.cdp.Pedido;
import java.util.List;
import padroes.Fabrica;
import static padroes.Tipo.pedido;

/**
 *
 * @author jean
 */
public class ControlarPedidos extends Controlar{

    public ControlarPedidos() {
        super(Fabrica.make(pedido));
    }

    @Override
    public Item getItem() {
        Pedido item = (Pedido) fabrica.criaObjeto();
        item.setCodigo_cliente(request.getParameter("codigo_cliente"));
        item.setCodigo_produto(request.getParameter("codigo_produto"));
        item.setDescricao(request.getParameter("descricao"));
        item.setPreco(request.getParameter("preco"));
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
