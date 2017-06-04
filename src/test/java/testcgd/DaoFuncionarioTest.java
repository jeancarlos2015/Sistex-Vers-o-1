/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcgd;

import com.sistex.cdp.Funcionario;
import com.sistex.cdp.Item;
import com.sistex.cgd.Dao;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import padroes.Fabrica;
import static padroes.Tipo.funcionario;

/**
 *
 * @author jean
 */
public class DaoFuncionarioTest {
    private final Fabrica f = Fabrica.make(funcionario);
    

    /**
     * Test of cadastrar method, of class DaoFuncionario.
     */
    @Test
    public void testCadastrar() {
        System.out.println("PERSISTENCIA CADASTRAR");
        Item item = f.criaObjeto();
        Dao instance = f.criaDao();
        boolean result = instance.cadastrar(item);
        assertTrue(result);
    }
    
    @Test
    public void cadastrarTodos(){
        System.out.println("PERSISTENCIA CADASTRAR TODOS");
        Dao instance = f.criaDao();
        boolean result=true;
        for(int i=0;i<10;i++){
            Funcionario item = (Funcionario) f.criaObjeto();
            item.setCpf("1234"+i);
            result = result && instance.cadastrar(item);
        }
        
        assertTrue(result);
    }
    @Test
    public void testExiste_int() {
        System.out.println("EXISTE CPF 1234");
        String cpf ="1234";
        Dao instance = f.criaDao();
        boolean result = instance.existe(cpf);
        assertTrue(result);
    }
    
    @Test
    public void testExiste_Item() {
        System.out.println("EXISTE");
        Item item = f.criaObjeto();
        Dao instance = f.criaDao();
        boolean result = instance.existe(item);
        assertTrue(result);
    }
    
    /**
     * Test of listar method, of class DaoFuncionario.
     */
    @Test
    public void testListar() {
        System.out.println("LISTAR TODOS");
        Dao instance = f.criaDao();
        List result = instance.listar();
        assertNotNull(result);
    }
    /**
     * Test of excluir method, of class DaoFuncionario.
     */
    @Test
    public void testExcluir() {
        System.out.println("EXCLUIR ITEM");
        Item item = f.criaObjeto();
        Dao instance = f.criaDao();
        boolean result = instance.excluir(item);
        assertTrue(result);
    }
    

    
    
    

    /**
     * Test of existe method, of class DaoFuncionario.
     */
    
//
//    /**
//     * Test of existe method, of class DaoFuncionario.
//     */
//    
//    
}
