/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcgd;

import com.sistex.cgd.Persistencia;
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
        String comando = "INSERT INTO FUNCIONARIO(matricula,rg,nome,senha) VALUES('0','123','123','teste')";
        Persistencia instance = new Persistencia();
        boolean expResult = true;
        boolean result = instance.executar(comando);
        assertEquals(expResult, result);
    }
//
//    /**
//     * Test of executarSelecao method, of class Persistencia.
//     */
//    @Test
//    public void testArrayFuncionarios() {
//      testExecutar();
//      System.out.println("LISTAR FUNCIONARIO");
//      Persistencia p = fabrica.criaPersistencia();
//      String vetor[] = p.getValores("SELECT *FROM FUNCIONARIO", fabrica.criaObjeto());
//      assertNotNull(vetor);
//    }
//   
//    
//     @Test
//    public void testFuncionarioExiste(){
//        
//        Persistencia p = fabrica.criaPersistencia();
//        System.out.println("EXISTE Funcionario");
//        String comando = "INSERT INTO FUNCIONARIO(nome, matricula, cpf, senha) VALUES('Fulano','12341234','12312312','1234')";
//        p.executar(comando);
//        String info[] = p.getValores("SELECT matricula FROM funcionario WHERE matricula='12341234'").split(";");
//        boolean result=false;
//        for(String str:info){
//            if(str.equals("12341234")){
//                result=true;
//            }
//        }
//        assertTrue(result);
//    }
//    @Test
//    public void testDeleteFuncionarios(){
//        System.out.println("DELETAR FUNCIONARIO");
//        String comando = "Delete from funcionario where codigo="+1;
//        Persistencia instance = new Persistencia();
//        boolean expResult = true;
//        boolean result = instance.executar(comando);
//        assertEquals(expResult, result);
//    }
//    
//    @Test
//    public void testDeleteFuncionarios1(){
//        System.out.println("DELETAR FUNCIONARIO");
//        Persistencia p = fabrica.criaPersistencia();
//        String comando = "Delete from funcionario where matricula='12341234'";
//        boolean result = p.executar(comando);
//        assertTrue(result);
//    }
}
