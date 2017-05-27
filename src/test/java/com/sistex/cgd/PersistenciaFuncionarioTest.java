/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgd;

import org.junit.Test;
import static org.junit.Assert.*;
import padroes.Fabrica;
import static padroes.Tipo.funcionario;

/**
 *
 * @author jean
 */
public class PersistenciaFuncionarioTest {
    private final Fabrica fabrica = Fabrica.make(funcionario);

    /**
     * Test of executar method, of class Persistencia.
     */
    @Test
    public void testExecutar() {
        System.out.println("INSERIR FUNCIONARIO");
        String comando = "INSERT INTO FUNCIONARIO(nome, matricula, cpf, senha) VALUES('Fulano','1231','12312312312','senha')";
        Persistencia instance = new Persistencia();
        boolean expResult = true;
        boolean result = instance.executar(comando);
        assertEquals(expResult, result);
    }

    /**
     * Test of executarSelecao method, of class Persistencia.
     */
    @Test
    public void testArrayFuncionarios() {
      testExecutar();
      System.out.println("LISTAR FUNCIONARIO");
      Persistencia p = fabrica.criaPersistencia();
      String vetor[] = p.getValores("SELECT *FROM FUNCIONARIO", fabrica.criaObjeto());
      assertNotNull(vetor);
    }
   
    

    @Test
    public void testDeleteFuncionarios(){
        System.out.println("DELETAR FUNCIONARIO");
        String comando = "Delete from funcionario where codigo="+1;
        Persistencia instance = new Persistencia();
        boolean expResult = true;
        boolean result = instance.executar(comando);
        assertEquals(expResult, result);
    }
    
}
