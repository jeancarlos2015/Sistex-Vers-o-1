/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcgd;

import com.sistex.cdp.Cliente;
import com.sistex.cdp.Item;
import com.sistex.cgd.Dao;
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
        Cliente cliente = (Cliente) f.criaObjeto();
        boolean result=false;
        for(int i=2;i<1000;i++){
            if(!dao.existe(""+i)){
                //cliente.setCodigo(""+i);
                result = dao.cadastrar(cliente);
                break;
            }
        }
        
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
        Cliente item = (Cliente) f.criaObjeto();
        //item.setCodigo("1");
        item.setCpf("1234");
        boolean result = dao.existe(item);
        assertTrue(result);
    }
    

 

    @Test
    public void testExcluir() {
        System.out.println("EXCLUSÃO");
        Cliente item = (Cliente) f.criaObjeto();
        item.setCpf("890");
        dao.cadastrar(item);
        boolean result = dao.excluir(item);
        assertTrue(result);
    }
    
    @Test
    public void testSenhaUsuario(){
        Cliente item = (Cliente) f.criaObjeto();
        item.setCpf("1234123478");
        item.setSenha("123456789");
        dao.cadastrar(item);
        assertTrue(dao.existe(item));
    }
}
