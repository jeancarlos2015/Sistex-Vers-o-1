/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cdp;

/**
 *
 * @author jean
 */
public class Cliente extends ItemAbstract{
    private int idade=0;
    private String email="fulano@servidor.com";
    private int codigo_funcionario=0;
    private final String nome;
    private String senha,cpf;
    public Cliente() {
        super("cliente");
        this.nome = "fulano";
    }
    
    public int getIdade() {
        return idade;
    }

    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setIdade(String idade) {
        this.setIdade(Integer.parseInt(idade.trim()));
    }
    
    
    public String getEmail() {
        return email;
    }


    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public  String[] getAtributos(){
        String vetor[] = {"codigo","codigo_funcionario","nome","idade","cpf","email","senha"};
        return vetor;
    }
    
    
    @Override
    public String toString(){
        return codigo+" "+getNome()+" "+getIdade()+" "+getCpf()+" "+getEmail()+" "+getSenha();
    }

    /**
     * @return the codigo_funcionario
     */
    
    public int getCodigo_funcionario() {
        return codigo_funcionario;
    }

    /**
     * @param codigo_funcionario the codigo_funcionario to set
     */
    
    public void setCodigo_funcionario(int codigo_funcionario) {
        this.codigo_funcionario = codigo_funcionario;
    }
    
    
    public void setCodigo_funcionario(String codigo_funcionario) {
        this.setCodigo_funcionario(Integer.parseInt(codigo_funcionario.trim()));
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
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
