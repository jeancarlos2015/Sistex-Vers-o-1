/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcgd;

import com.sistex.cdp.Produto;
import com.sistex.cgd.Persistencia;
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
      String vetor[] = p.getValores("SELECT *FROM PRODUTO").split(";");
      for(String str:vetor){
          System.out.println(str);
      }
      assertNotNull(vetor);
    }
   
    @Test
    public void testInserirProduto() {
        System.out.println("INSERIR PRODUTO");
        String comando = "INSERT INTO PRODUTO(nome, descricao, preco, marca, quantidade, tipo) VALUES('Feijao Tropeiro','Tropeiro',12.4,'sistex',10,'tropeiro')";
        Persistencia p = fabrica.criaPersistencia();
        boolean result = p.executar(comando);
        assertTrue(result);
    }
    

    
    @Test
    public void testDeleteFuncionarios(){
        System.out.println("DELETAR PRODUTO");
        String comando1 = "INSERT INTO PRODUTO(nome, descricao, preco, marca, quantidade, tipo) VALUES('teste','Tropeiro',12.4,'sistex',10,'tropeiro')";
        String comando = "DELETE FROM PRODUTO WHERE nome='teste'";
        Persistencia instance = fabrica.criaPersistencia();
        instance.executar(comando1);
        boolean result = instance.executar(comando);
        assertTrue(result);
    }
    
}
