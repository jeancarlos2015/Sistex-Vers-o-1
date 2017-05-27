/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgd;

import com.sistex.cdp.Funcionario;
import com.sistex.cdp.Item;
import java.util.ArrayList;
import java.util.List;
import padroes.Fabrica;
import static padroes.Tipo.funcionario;

/**
 *
 * @author jean
 */
public class DaoFuncionario implements Dao {
    Fabrica fabr = Fabrica.make(funcionario);
    private final Persistencia conexao = fabr.criaPersistencia();
    

    @Override
    public boolean cadastrar(Item item) {
        Funcionario f = (Funcionario) item;
        return conexao.executar("INSERT INTO FUNCIONARIO (nome, matricula,cpf,senha) VALUES('"+f.getNome()+"','"+f.getMatricula()+"','"+f.getCpf()+"','"+f.getSenha()+"')");
    }

    @Override
    public boolean excluir(Item item) {
        Funcionario f = (Funcionario) item;
        return conexao.executar("DELETE FROM FUNCIONARIO WHERE cpf = '"+f.getCpf()+"'");
    }

    @Override
    public List<Item> listar() {
       String[] result = conexao.getValores("SELECT *FROM FUNCIONARIO", new Funcionario());
       List<Item> lista = new ArrayList<>();
       for(String linha:result){
           String[] campo = linha.split(",");
           Funcionario funcionario = (Funcionario) fabr.criaObjeto();
           funcionario.setCodigo(campo[0]);
           funcionario.setNome(campo[1]);
           funcionario.setMatricula(campo[2]);
           funcionario.setCpf(campo[3]);
           funcionario.setSenha(campo[4]);
           lista.add(funcionario);
       }
       return lista;
    }

    @Override
    public boolean existe(Item item) {
        Funcionario f = (Funcionario) item;
        return conexao.executar("DELETE FROM FUNCIONARIO WHERE cpf = '"+f.getCpf()+"'");
    }

    @Override
    public boolean existe(String cpf) {
        return conexao.executar("DELETE FROM FUNCIONARIO WHERE cpf = '"+cpf+"'");
    }

    @Override
    public List<Item> listarVinculo(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
