/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cdp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jean
 */
public class Funcionario extends ItemAbstract{
    
    private String matricula="1234";
    private final List<Cliente> clientes;
    
    
    public Funcionario(){
        clientes = new ArrayList();
    }
    
    public void cadastrar(Cliente c){
        clientes.add(c);
    }
    
    public void deletar(Cliente c){
        clientes.remove(c);
    }
    
    public boolean existe(Cliente c){
        return clientes.contains(c);
    }
    
    
    @Override
    public String getMatricula() {
        return matricula;
    }

   
    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public  String[] getAtributos(){
        String vetor[] = {"codigo","nome","matricula","cpf","senha"};
        return vetor;
    }
    
    @Override
    public String toString(){
        return getCodigo()+" "+getNome()+" "+getMatricula()+" "+getCpf()+" "+getSenha();
    }
}
