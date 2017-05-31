/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcgd;

import com.sistex.cgd.Dao;
import org.junit.Test;
import static org.junit.Assert.*;
import padroes.Fabrica;
import static padroes.Tipo.cliente;
import static padroes.Tipo.funcionario;
import static padroes.Tipo.pedido;
import static padroes.Tipo.produto;

/**
 *
 * @author jean
 */
public class testDeleteAll {
    private Fabrica fabrica;
    private Dao dao;
    
    @Test
    public void testDeletePedidos(){
        fabrica = Fabrica.make(pedido);
        dao = fabrica.criaDao();
        assertTrue(dao.excluirAll());
    }
    @Test
    public void testDeleteProdutos(){
        fabrica = Fabrica.make(produto);
        dao = fabrica.criaDao();
        assertTrue(dao.excluirAll());
    }
    
    @Test
    public void testDeleteClientes(){
        fabrica = Fabrica.make(cliente);
        dao = fabrica.criaDao();
        assertTrue(dao.excluirAll());
    }
    
    @Test
    public void testDeleteFuncionarios(){
        fabrica = Fabrica.make(funcionario);
        dao = fabrica.criaDao();
        assertTrue(dao.excluirAll());
    }
    
  
}
