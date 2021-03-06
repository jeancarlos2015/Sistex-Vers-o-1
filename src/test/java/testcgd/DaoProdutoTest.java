/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcgd;

import com.sistex.cdp.Item;
import com.sistex.cgd.Dao;
import java.util.List;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import padroes.Fabrica;
import static padroes.Tipo.cliente;
import static padroes.Tipo.produto;

/**
 *
 * @author jean
 */
public class DaoProdutoTest {
     private final Fabrica f = Fabrica.make(produto);
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
        for(Item item:result){
            System.out.println(item.toString());
        }
        assertNotNull(result);
    }


    @Test
    public void testExiste_Item() {
        System.out.println("existe item objeto");
        Item item =f.criaObjeto();
        dao.cadastrar(item);
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
