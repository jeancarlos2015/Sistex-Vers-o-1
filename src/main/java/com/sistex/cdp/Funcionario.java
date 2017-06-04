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

    private String nome = "Ciclano";
    private String senha = "123";
    private String matricula = "1234";
    private String cpf="12345678910";
    private List<Cliente> clientes = new ArrayList<>();

    public Funcionario() {
        super("funcionario");
        this.matricula = "1234";
    }
    
   
    
    public void cadastrar(Cliente c){
        getClientes().add(c);
    }
    
    public void deletar(Cliente c){
        getClientes().remove(c);
    }
    
    public boolean existe(Cliente c){
        return getClientes().contains(c);
    }
    
    
    
    public String getMatricula() {
        return matricula;
    }

   
    
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

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the clientes
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

   
    
}
