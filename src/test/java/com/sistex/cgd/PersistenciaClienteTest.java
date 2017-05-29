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
    public void testInserirCliente() {
        System.out.println("INSERIR CLIENTE");
        String comando = "INSERT INTO CLIENTE(codigo_funcionario, nome, idade, cpf, email, senha) VALUES(1,'Fulano',24,'12312312','fulano@gmail.com','1234')";
        boolean result = persistencia.executar(comando);
        assertTrue(result);
    }
    
    @Test
    public void testInserirFuncionario() {
        System.out.println("INSERIR FUNCIONARIO");
        String comando = "INSERT INTO FUNCIONARIO(nome, matricula, cpf, senha) VALUES('Fulano','12341','12312','1234')";
        boolean result = persistencia.executar(comando);
        assertTrue(result);
    }
    
   
    
    @Test
    public void testListarClientes() {
      testInserirCliente();
      System.out.println("LISTAR CLIENTES");
      String info = persistencia.getValores("SELECT *from CLIENTE");
      String vetor[] = info.split(";");
      assertNotNull(vetor);
    }
    
    @Test
    public void testClientExiste(){
        System.out.println("EXISTE CLIENTE");
        String comando = "INSERT INTO CLIENTE(codigo_funcionario, nome, idade, cpf, email, senha) VALUES(1,'Fulano',24,'12312312','fulano@gmail.com','1234')";
        persistencia.executar(comando);
        String[] info = persistencia.getValores("SELECT cpf FROM cliente WHERE cpf='12312312'").split(";");
        boolean achou=false;
        for(String str:info){
            if(str.equals("12312312")){
                achou=true;
            }
        }
        assertTrue(achou);
    }
   
    
    @Test
    public void testDeleteCliente(){
        System.out.println("DELETAR CLIENTE");
        String comando1 = "INSERT INTO CLIENTE(codigo_funcionario, nome, idade, cpf, email, senha) VALUES(1,'Fulano',24,'123123','fulano@gmail.com','1234')";
        persistencia.executar(comando1);
        String comando = "Delete from cliente WHERE cpf='123123'";
        boolean result = persistencia.executar(comando);
        assertTrue(result);
    }
    
   
}
