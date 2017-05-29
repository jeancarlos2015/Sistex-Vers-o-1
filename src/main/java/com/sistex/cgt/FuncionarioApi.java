/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgt;

import com.sistex.cdp.Item;
import padroes.Fabrica;
import static padroes.Tipo.funcionario;

/**
 *
 * @author jean
 */
public class FuncionarioApi extends ApiAbstract{

    public FuncionarioApi() {
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
    
    
    
    
}
