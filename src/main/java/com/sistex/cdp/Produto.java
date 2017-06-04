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
public class Produto extends ItemAbstract{
    private String marca="nenhum";
    private String nome="produto";
    private float preco=0;
    private int quantidade=0;
    
    private String descricao="nenhum";
    
    public Produto() {
        super("produto");
    }
    
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getMarca() {
        return marca;
    }
     
    @Override
    public  String[] getAtributos(){
        String vetor[] = {"codigo","nome","descricao","preco","marca","quantidade"};
        return vetor;
    }
    
    @Override
    public String toString(){
        return codigo+" "+nome+" "+descricao+" "+preco+" "+marca+" "+quantidade;
    }
    
    @Override
    public String getTipo(){
        if(getNome().contains("salada")){
            return "salada";
        }
        else if(getNome().contains("tropeiro")){
            return "tropeiro";
        }
        else if(getNome().contains("macarrao")){
            return "espaguete";
        }
        else if(getNome().contains("frango")){
            return "prato1";
        }
        else if(getNome().contains("bife")){
            return "prato2";
        }
        else if(getNome().contains("coca cola")){
            return "cocazero";
        }
        else if(getNome().contains("refrigerante")){
            return "refrigerante";
        }
        else{
            return "cs";
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void setPreco(String preco){
        this.preco = Float.parseFloat(preco);
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
   
    public void setQuantidade(String quantidade){
        this.quantidade = Integer.parseInt(quantidade);
    }

}
