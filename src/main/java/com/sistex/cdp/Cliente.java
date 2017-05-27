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
    private int idade;
    private String email;
   

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public void setIdade(String idade) {
        this.idade = Integer.parseInt(idade.trim());
    }
    
    @Override
    public String getEmail() {
        return email;
    }


    @Override
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
        return getCodigo()+" "+getNome()+" "+getIdade()+" "+getCpf()+" "+getEmail()+" "+getSenha();
    }
        
}
