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
public interface Item {
    public String getNome();
    public void setNome(String nome);
    public String getMarca();
    public String getDescricao();
    public void setDescricao(String descricao);
    public float getPreco();
    public void setPreco(float preco);
    public void setPreco(String preco);
    public int getCodigo();
    public void setCodigo(int codigo);
    public void setCodigo(String codigo);
    public String getSenha();
    public void setSenha(String senha);
    public void setMatricula(String matricula);
    public String getMatricula();
    public void setCpf(String cpf);
    public String getCpf();
    public int getIdade();
    public void setIdade(int idade);
    public void setIdade(String idade);
    public String getEmail();
    public void setEmail(String email);
    public String[] getAtributos();
    public int getCodigo_funcionario();
    public void setCodigo_funcionario(int codigo_funcionario);
    public void setCodigo_funcionario(String codigo_funcionario);
}
