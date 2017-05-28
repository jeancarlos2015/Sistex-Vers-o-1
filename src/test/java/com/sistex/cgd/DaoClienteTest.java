/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgd;

import com.sistex.cdp.Cliente;
import com.sistex.cdp.Item;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import padroes.Fabrica;
import static padroes.Tipo.cliente;

/**
 *
 * @author jean
 */
public class DaoClienteTest {
    private final Fabrica f = Fabrica.make(cliente);
    private final Dao dao = f.criaDao();
    

    
    @Test
    public void testCadastrar() {
        System.out.println("cadastrar");
        
        boolean result = dao.cadastrar(f.criaObjeto());
        assertTrue(result);
    }


    @Test
    public void testListar() {
        System.out.println("listar");
        List<Item> result = dao.listar();
        assertNotNull(result);
    }


    @Test
    public void testExiste_Item() {
        System.out.println("existe item objeto");
        Item item =f.criaObjeto();
        dao.cadastrar(item);
        System.out.println(item.getCpf());
        boolean result = dao.existe(item);
        assertTrue(result);
    }
    

    @Test
    public void testExiste_String() {
        System.out.println("existe");
        String codigo = "1";
        assertTrue(dao.existe(codigo));
    }

    @Test
    public void testExcluir() {
        System.out.println("EXCLUSÃO");
        Item item = f.criaObjeto();
        item.setCpf("890");
        dao.cadastrar(item);
        boolean result = dao.excluir(item);
        assertTrue(result);
    }
}
