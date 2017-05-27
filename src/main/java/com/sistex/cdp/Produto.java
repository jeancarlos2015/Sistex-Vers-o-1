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
    private String marca;
    
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
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
        return getCodigo()+" "+getNome()+" "+getDescricao()+" "+getPreco()+" "+getMarca()+" "+getQuantidade();
    }
}
