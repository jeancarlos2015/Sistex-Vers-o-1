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

    /**
     * Test of executar method, of class Persistencia.
     */
   
   
    private String obterTabela(String comando){
            String comando1 = comando.toLowerCase();
            if(!comando1.contains("where")){
                return comando.toLowerCase().split("from")[1].trim();
            }
            
            String parte2 = comando1.split("from")[1];
            String tabela = parte2.split(" ")[1];
            return tabela;
       
    }
    
    private Item obterItem(String tabela){
        switch(tabela){
            case "cliente":
                return new Cliente();
            case "produto":
                return new Produto();
            case "pedido":
                return new Pedido();
            case "funcionario":
                return new Funcionario();
            default:
                return null;
            }
    }
  
    private List<String> obterColunas(String comando){
        String parte1 = null;
        
        String buffer = comando.toLowerCase();
        
        if(!buffer.contains("*from")){
            parte1 = buffer.split("from")[0];   
            List<String> list = new ArrayList<>();
            if(!parte1.contains(",")){
                list.add(parte1.split(" ")[1]);
                return list;
            }else{
                return Arrays.asList(parte1.split(" ")[1].split(","));
            }
        }else{
            String tabela = obterTabela(comando);
            Item item = obterItem(tabela);
            if(item==null){
                return new ArrayList<>();
            }
            return Arrays.asList(item.getAtributos());
        }
           
    }
    @Test
    public void testando(){
        String comando="select cpf from cliente where cpf='123'";
        String tabela = obterTabela(comando);
        Item item = obterItem(tabela);
        assertNotNull(item);
    }
    @Test
    public void testExecutar() {
        System.out.println("INSERIR CLIENTE");
        String comando = "INSERT INTO CLIENTE(codigo_funcionario, nome, idade, cpf, email, senha) VALUES(1,'Fulano',24,'12312312','fulano@gmail.com','1234')";
        Persistencia instance = new Persistencia();
        boolean expResult = true;
        boolean result = instance.executar(comando);
        assertEquals(expResult, result);
    }
    
    
 @Test
    public void testArrayClientes() {
      testExecutar();
      System.out.println("LISTAR Clientes");
      Persistencia p = fabrica.criaPersistencia();
      String vetor[] = p.getValores("SELECT *FROM CLIENTE", fabrica.criaObjeto());
      assertNotNull(vetor);
    }
    
    @Test
    public void testArrayClientes1() {
      testExecutar();
      System.out.println("LISTAR Clientes");
      Persistencia p = fabrica.criaPersistencia();
      String vetor[] = p.getValores("SELECT *from CLIENTE");
      for(String str:vetor){
          System.out.println(str);
      }
      assertNotNull(vetor);
    }
    @Test
    public void testDeleteFuncionarios(){
        System.out.println("DELETAR FUNCIONARIO");
        String comando = "Delete from cliente";
        Persistencia instance = fabrica.criaPersistencia();
        boolean expResult = true;
        boolean result = instance.executar(comando);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testExiste(){
        Persistencia conexao = fabrica.criaPersistencia();
        Item item = fabrica.criaObjeto();
        String[] valores = conexao.getValores("SELECT cpf FROM cliente WHERE cpf='"+item.getCpf()+"'");
        for(String str:valores){
            System.out.println(str);
        }
        assertNotNull(valores);
    }
}
