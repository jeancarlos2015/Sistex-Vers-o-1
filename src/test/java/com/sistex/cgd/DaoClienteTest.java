/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgd;

import com.sistex.cdp.Item;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import padroes.Fabrica;
import padroes.Tipo;
import static padroes.Tipo.cliente;

/**
 *
 * @author jean
 */
public class DaoClienteTest {
    private final Fabrica f = Fabrica.make(cliente);
    private final Dao dao = f.criaDao();
    
//    @Test
//    public void cadastrarClientes(){
//        boolean result=true;
//        for(int posicao=0;posicao<10;posicao++){
//            result= result && dao.cadastrar(f.criaObjeto());
//        }
//        assertTrue(result);
//    }
    
    @Test
    public void testCadastrar() {
        System.out.println("cadastrar");
        boolean result = dao.cadastrar(f.criaObjeto());
        assertTrue(result);
    }

//    /**
//     * Test of excluir method, of class DaoCliente.
     
    

    /**
     * Test of listar method, of class DaoCliente.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        List<Item> result = dao.listar();
        assertNotNull(result);
    }

//    /**
//     * Test of existe method, of class DaoCliente.
//     */
    @Test
    public void testExiste_Item() {
        System.out.println("existe item objeto");
        Dao instance = f.criaDao();
        Item item = f.criaObjeto();
        boolean result = instance.existe(item);
        assertTrue(result);
    }
    
    
////
////    /**
////     * Test of existe method, of class DaoCliente.
////     */
    @Test
    public void testExiste_String() {
        System.out.println("existe");
        String codigo = "";
        Dao instance = f.criaDao();
        assertTrue(instance.existe(codigo));
    }
////    
//    
//    @Test
//    public void testExcluir() {
//        System.out.println("excluir");
//        Item item = null;
//        DaoCliente instance = new DaoCliente();
//        boolean expResult = false;
//        boolean result = instance.excluir(item);
//        assertEquals(expResult, result);
//    }
}
