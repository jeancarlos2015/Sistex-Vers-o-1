/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import com.sistex.cdp.Item;
import com.sistex.cgd.Dao;
import java.util.List;
import padroes.Fabrica;
import static padroes.Tipo.cliente;

/**
 *
 * @author jean
 */
public class ClienteApi implements Api{
    private final Fabrica f = Fabrica.make(cliente);
    private final Dao dao = f.criaDao();
    @Override
    public void cadastrar(Item item) {
        dao.cadastrar(item);
    }

    @Override
    public void excluir(Item item) {
        dao.excluir(item);
    }

    @Override
    public List<Item> listar() {
        return dao.listar();
    }

    @Override
    public List<Item> listarVinculados(Item item) {
        return dao.listarVinculo(item);
    }
    
}
