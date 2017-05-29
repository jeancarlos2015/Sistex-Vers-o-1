/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgt;

import com.sistex.cdp.Item;
import com.sistex.cgd.Dao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import padroes.Fabrica;
import static padroes.Tipo.cliente;

/**
 *
 * @author jean
 */
public class ClienteApi extends ApiAbstract{

    public ClienteApi() {
        super(Fabrica.make(cliente));
    }
    
    
    @Override
    public Item getItem() {
        Item item = fabrica.criaObjeto();
        item.setCodigo_funcionario(request.getParameter("codigo_funcionario"));
        item.setNome(request.getParameter("nome"));
        item.setIdade(request.getParameter("idade"));
        item.setCpf(request.getParameter("cpf"));
        item.setEmail(request.getParameter("email"));
        item.setSenha(request.getParameter("senha"));
        return item;
    }
    
    
}
