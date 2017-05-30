/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgt;

import com.sistex.cdp.Item;
import java.util.List;
import padroes.Fabrica;
import static padroes.Tipo.funcionario;

/**
 *
 * @author jean
 */
public class ControlarFuncionarios extends Controlar{

    public ControlarFuncionarios() {
        super(Fabrica.make(funcionario));
    }

    @Override
    public Item getItem() {
        Item item = fabrica.criaObjeto();
        item.setNome(request.getParameter("nome"));
        item.setMatricula(request.getParameter("matricula"));
        item.setCpf(request.getParameter("cpf"));
        item.setSenha(request.getParameter("senha"));
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
