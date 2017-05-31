/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcgt;

import com.sistex.cci.Controlador;
import com.sistex.cdp.Item;
import com.sistex.cgt.InterfaceControlar;
import org.junit.Test;
import static org.junit.Assert.*;
import padroes.Fabrica;
import padroes.Tipo;
import static padroes.Tipo.cliente;

/**
 *
 * @author jean
 */
public class ControlarClientesTest {
    private final Fabrica f = Fabrica.make(cliente);
    private InterfaceControlar c;
    private Item item;
    
    @Test
    public void testExiste(){
        c = f.criaApi();
        item = f.criaObjeto();
        item.setCpf("789234");
        item.setSenha("12345");
        c.cadastrar(item);
        System.out.println(c.existe(item));
        assertTrue(c.existe(item));
    }
    
    @Test
    public void testExcluir(){
        c = f.criaApi();
        item = f.criaObjeto();
        item.setCpf("789234");
        item.setSenha("12345");
        c.cadastrar(item);
        System.out.println(c.excluir(item));
        assertTrue(c.excluir(item));
    }
    @Test
    public void testExcluirTodos(){
        c = f.criaApi();
        assertTrue(c.excluirAll());
    }
}
