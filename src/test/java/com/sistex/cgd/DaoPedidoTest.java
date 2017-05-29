/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgd;

import com.sistex.cdp.Item;
import com.sistex.cdp.Pedido;
import java.util.List;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import padroes.Fabrica;
import static padroes.Tipo.cliente;
import static padroes.Tipo.pedido;

/**
 *
 * @author jean
 */
public class DaoPedidoTest {
     private final Fabrica f = Fabrica.make(pedido);
    private final Dao dao = f.criaDao();
    

    
    @Test
    public void testCadastrar() {
        System.out.println("cadastrar");
        Pedido item = (Pedido) f.criaObjeto();
        item.setCodigo_cliente("1");
        item.setCodigo_produto("1");
        boolean result = dao.cadastrar(item);
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
        System.out.println(item.getCodigo());
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
        dao.cadastrar(item);
        boolean result = dao.excluir(item);
        assertTrue(result);
    }
}
