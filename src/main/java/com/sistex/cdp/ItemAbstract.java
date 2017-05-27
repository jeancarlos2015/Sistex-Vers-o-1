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
public abstract class ItemAbstract implements Item{
    private String nome, cpf, senha, descricao;
    private float preco;
    private int codigo, quantidade;
    
    public ItemAbstract(){
        nome = "Fulano";
        cpf = "1234";
        senha="senha";
        descricao="descricao";
        preco = 0;
        codigo = 0;
        quantidade=0;
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = Integer.parseInt(codigo);
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    public void setMarca(String marca){};
    @Override
    public String getMarca(){return null;}
    @Override
    public void setMatricula(String matricula){}
    @Override
    public String getMatricula(){return null;}
    @Override
    public int getIdade(){return -1;}
    @Override
    public void setIdade(int idade){}
    @Override
    public void setIdade(String idade){}
    @Override
    public String getEmail(){return null;}
    @Override
    public void setEmail(String email){}
    
    @Override
    public String[] getAtributos(){return null;}
}
