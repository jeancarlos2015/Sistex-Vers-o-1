/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgd;

import com.sistex.cdp.Produto;
import org.junit.Test;
import static org.junit.Assert.*;
import padroes.Fabrica;
import static padroes.Tipo.produto;

/**
 *
 * @author jean
 */
public class PersistenciaProdutoTest {
    
   private final Fabrica fabrica = Fabrica.make(produto);

    /**
     * Test of executar method, of class Persistencia.
     */
    @Test
    public void testExecutar() {
        System.out.println("INSERIR PRODUTO");
        String comando = "INSERT INTO PRODUTO(nome, descricao, preco, marca, quantidade) VALUES('Feijao','test',20.1,'Rio Doce',5)";
        Persistencia instance = fabrica.criaPersistencia();
        boolean result = instance.executar(comando);
        assertTrue(result);
    }

    /**
     * Test of executarSelecao method, of class Persistencia.
     */
    @Test
    public void testArrayFuncionarios() {
      testExecutar();
      System.out.println("LISTAR PRODUTO");
      Persistencia p = fabrica.criaPersistencia();
      String vetor[] = p.getValores("SELECT *FROM PRODUTO", fabrica.criaObjeto());
      assertNotNull(vetor);
    }
   
    
    

    
    @Test
    public void testDeleteFuncionarios(){
        System.out.println("DELETAR PRODUTO");
        String comando = "DELETE FROM PRODUTO WHERE codigo="+1;
        Persistencia instance = fabrica.criaPersistencia();
        boolean result = instance.executar(comando);
        assertTrue(result);
    }
    
}
