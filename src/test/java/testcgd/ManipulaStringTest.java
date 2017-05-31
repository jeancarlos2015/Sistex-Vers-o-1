/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcgd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jean
 */
public class ManipulaStringTest {
    
    private String obterTabela(String comando){
            String comando1 = comando.toLowerCase();
            if(!comando1.contains("where")){
                return comando.toLowerCase().split("from")[1].trim();
            }
            String parte2 = comando1.split("from")[1];
            String tabela = parte2.split(" ")[1];
            return tabela;
       
    }
    private List<String> obterColunas(String comando){
        String parte1;
        if(comando.contains("from")){
            parte1 = comando.split("from")[0];   
        }else{
            parte1 = comando.split("FROM")[0];   
        }
         
        
        List<String> list = new ArrayList<>();
        if(!parte1.contains(",")){
            list.add(parte1.split(" ")[1]);
            return list;
        }else{
            String colunas[] = parte1.split(" ")[1].split(",");
            list.addAll(Arrays.asList(colunas));
            return list;
        }
    }
    
    @Test
    public void testSentenca(){
        String comando3 = "SELECT codigo,codigo_funcionario,nome,idade,cpf,email,senha from cliente";
        List<String> colunas = obterColunas(comando3);
        System.out.println(colunas);
        assertEquals(colunas.get(0)+","+colunas.get(1)+","+colunas.get(2)+","+colunas.get(3)+","+colunas.get(4)+","+colunas.get(5)+","+colunas.get(6), "codigo,codigo_funcionario,nome,idade,cpf,email,senha");
    }
    
    @Test
    public void testSentenca1(){
        String comando3 = "SELECT codigo from cliente";
        List<String> colunas = obterColunas(comando3);
        System.out.println(colunas);
        assertEquals(colunas.get(0), "codigo");
    }
    
     @Test
    public void testSentenca2(){
        String comando3 = "SELECT codigo from cliente";
        List<String> colunas = obterColunas(comando3);
        System.out.println(colunas);
        assertEquals(colunas.get(0), "codigo");
    }
    
     @Test
    public void testSentenca3(){
        String comando3 = "SELECT codigo from cliente";
        String tabela = obterTabela(comando3);
        assertEquals(tabela, "cliente");
    }
    
    @Test
    public void testSentenca4(){
        String comando3 = "SELECT codigo,codigo_funcionario,nome,idade,cpf,email,senha from cliente where codigo=1";
        List<String> colunas = obterColunas(comando3);
        System.out.println(colunas);
        assertEquals(colunas.get(0)+","+colunas.get(1)+","+colunas.get(2)+","+colunas.get(3)+","+colunas.get(4)+","+colunas.get(5)+","+colunas.get(6), "codigo,codigo_funcionario,nome,idade,cpf,email,senha");
    }
    
     @Test
    public void testSentenca5(){
        String comando3 = "SELECT codigo from cliente";
        String result = comando3.toLowerCase();
        List<String> colunas = obterColunas(comando3);
        System.out.println(colunas);
        assertEquals(result,"select codigo from cliente");
    }
    
     @Test
    public void testSentenca6(){
        String comando3 = "SELECT cpf FROM cliente WHERE cpf='1234'";
        String result = comando3.toLowerCase();
        String tabela = obterTabela(result);
         assertEquals(tabela, "cliente");
    }
    
    @Test
    public void testSentenca7(){
        String comando3 = "SELECT cpf FROM cliente WHERE cpf='1234'";
        String result = comando3.toLowerCase();
        String tabela = obterTabela(result);
         assertEquals(tabela, "cliente");
    }
}
