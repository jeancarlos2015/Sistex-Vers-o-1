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
    protected String descricao;
    private String tipo;
    
    public ItemAbstract(String tipo){
        this.tipo = tipo;
    }
    /**
     * @return the descricao
     */
    @Override
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param codigo
     * @return the codigo
     */
   
    @Override
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    
    
   
    @Override
    public String[] getAtributos(){return null;}
    
   
}
