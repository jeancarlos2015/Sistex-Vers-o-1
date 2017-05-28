/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgd;

import com.sistex.cdp.Cliente;
import com.sistex.cdp.Funcionario;
import com.sistex.cdp.Item;
import com.sistex.cdp.Pedido;
import com.sistex.cdp.Produto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import padroes.Fabrica;
import static padroes.Tipo.cliente;

/**
 *
 * @author jean
 */
public class PersistenciaClienteTest {
    
   private final Fabrica fabrica = Fabrica.make(cliente);
   private final Persistencia persistencia = fabrica.criaPersistencia();

    /**
     * Test of executar method, of class Persistencia.
     */
   
   
    
    @Test
    public void testExecutar() {
        System.out.println("INSERIR CLIENTE");
        String comando = "INSERT INTO CLIENTE(codigo_funcionario, nome, idade, cpf, email, senha) VALUES(1,'Fulano',24,'12312312','fulano@gmail.com','1234')";
        boolean result = persistencia.executar(comando);
        assertTrue(result);
    }
    
    
 @Test
    public void testArrayClientes() {
      testExecutar();
      System.out.println("LISTAR CLIENTES");
      String vetor[] = persistencia.getValores("SELECT *FROM CLIENTE").split(";");
      assertNotNull(vetor);
    }
    
    @Test
    public void testArrayClientes1() {
      testExecutar();
      System.out.println("LISTAR CLIENTES");
      String info = persistencia.getValores("SELECT *from CLIENTE");
      String vetor[] = info.split(";");
      assertNotNull(vetor);
    }
    
     @Test
    public void testExiste(){
        System.out.println("EXISTE CLIENTE");
        String comando = "INSERT INTO CLIENTE(codigo_funcionario, nome, idade, cpf, email, senha) VALUES(1,'Fulano',24,'12312312','fulano@gmail.com','1234')";
        persistencia.executar(comando);
        String info = persistencia.getValores("SELECT cpf FROM cliente WHERE cpf='12312312'");
        assertEquals(info,"12312312");
    }
    
    @Test
    public void testDeleteFuncionarios(){
        System.out.println("DELETAR FUNCIONARIO");
        String comando = "Delete from cliente";
        boolean result = persistencia.executar(comando);
        assertTrue(result);
    }
    
   
}
