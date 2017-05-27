/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgd;

import com.sistex.cdp.Cliente;
import com.sistex.cdp.Item;
import java.util.ArrayList;
import java.util.List;
import padroes.Fabrica;
import static padroes.Tipo.cliente;

/**
 *
 * @author jean
 */
public class DaoCliente implements Dao{
    Fabrica f = Fabrica.make(cliente);
    private final Persistencia conexao = f.criaPersistencia();
    
    @Override
    public boolean cadastrar(Item item) {
        return conexao.executar("INSERT INTO CLIENTE(codigo_funcionario, nome, idade, cpf, email, senha) " +
        "VALUES("+item.getCodigo()+",'"+item.getNome()+"',"+item.getIdade()+",'"+item.getCpf()+"','"+item.getEmail()+"','"+item.getSenha()+"')");
    }

    @Override
    public boolean excluir(Item item) {
        return conexao.executar("Delete FROM CLIENTE WHERE cpf="+item.getCpf());
    }

    @Override
    public List listar() {
        String[] result = conexao.getValores("SELECT *FROM CLIENTE", new Cliente());
       List<Item> lista = new ArrayList<>();
       for(String linha:result){
           String[] campo = linha.split(",");
           Cliente cliente = (Cliente) f.criaObjeto();
           cliente.setCodigo(campo[0]);
           cliente.setIdade(campo[1]);
           cliente.setCpf(campo[2]);
           cliente.setEmail(campo[3]);
           cliente.setSenha(campo[4]);
           lista.add(cliente);
       }
       return lista;
        
    }

    @Override
    public boolean existe(Item item) {
        String[] valores = conexao.getValores("SELECT cpf FROM cliente WHERE cpf="+item.getCpf());
        for(String str:valores){
            if(item.getCpf().equals(str)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existe(String codigo) {
        String[] valores = conexao.getValores("SELECT cpf from cliente where cpf='"+codigo+"'");
        for(String str:valores){
            if(str.equals(codigo)){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Item> listarVinculo(Item item) {
        return null;
    }
    
}
