/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgd;

import org.junit.Test;
import static org.junit.Assert.*;
import padroes.Fabrica;
import static padroes.Tipo.pedido;

/**
 *
 * @author jean
 */
public class PersistenciaPedidoTest {
    
    private final Fabrica fabrica = Fabrica.make(pedido);
    private final Persistencia conexao = fabrica.criaPersistencia();
    /**
     * Test of executar method, of class Persistencia.
     */
    @Test
    public void testExecutar() {
      
        System.out.println("INSERIR PEDIDO");
        String comando = "INSERT INTO PEDIDO(codigo_cliente, codigo_produto, descricao, preco) VALUES(1,1,'test',24.5)";
        boolean result = conexao.executar(comando);
        assertTrue(result);
    }

    /**
     * Test of executarSelecao method, of class Persistencia.
     */
    @Test
    public void testArrayFuncionarios() {
      testExecutar();
      System.out.println("LISTAR PEDIDOS");
      Persistencia p = fabrica.criaPersistencia();
      String vetor[] = p.getValores("SELECT *FROM PEDIDO").split(";");
      for(String str:vetor){
          System.out.println(str);
      }
      assertNotNull(vetor);
    }
    @Test
    public void testInserirPedido() {
        System.out.println("INSERIR PEDIDO");
        Persistencia p = fabrica.criaPersistencia();
        String comando = "INSERT INTO PEDIDO(codigo_cliente, codigo_produto, descricao, preco) VALUES(1,1,'Teste',10.5)";
        boolean result = p.executar(comando);
        assertTrue(result);
    }
     @Test
    public void testPedidoExiste(){
        
        Persistencia p = fabrica.criaPersistencia();
        System.out.println("EXISTE Funcionario");
        
        String comando = "INSERT INTO PEDIDO(codigo_cliente,codigo_produto, descricao,preco) VALUES(1,1,'teste',20.0)";
        p.executar(comando);
        String info[] = p.getValores("SELECT codigo FROM pedido WHERE codigo=1 or codigo_cliente=1").split(";");
        boolean result=false;
        for(String str:info){
            System.out.println(str);
            if(str.equals("1")){
                result=true;
            }
        }
        assertNotNull(info);
    }

    @Test
    public void testDeleteFuncionarios(){
        testExecutar();
        System.out.println("DELETAR PEDIDO");
        String comando = "DELETE FROM PEDIDO where codigo="+1;
        boolean result = conexao.executar(comando);
        assertTrue(result);
    }
    
    
}
