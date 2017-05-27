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
public class Pedido extends ItemAbstract{
    private final List<Produto> produtos;
    private int codigo_cliente=0;
    private int codigo_produto=0;
    public Pedido(){
        produtos = new ArrayList<>();
    }
    
    public void cadastrar(Item item){
        Produto p = (Produto) item;
        produtos.add(p);
    }
    
    public void excluir(Item item){
        Produto p = (Produto) item;
        produtos.remove(p);
    }
    
    public boolean existe(Item item){
        Produto p = (Produto) item;
        return produtos.contains(p);
    }
   
   @Override
    public  String[] getAtributos(){
        String vetor[] = {"codigo","codigo_cliente","codigo_produto","descricao","preco"};
        return vetor;
    }
    
    @Override
    public String toString(){
        return getCodigo()+" "+getCodigo_cliente()+" "+getCodigo_produto()+""+getNome()+" "+getIdade()+" "+getCpf()+" "+getEmail()+" "+getSenha();
    }

    /**
     * @return the codigo_cliente
     */
    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    /**
     * @param codigo_cliente the codigo_cliente to set
     */
    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    /**
     * @return the codigo_produto
     */
    public int getCodigo_produto() {
        return codigo_produto;
    }

    /**
     * @param codigo_produto the codigo_produto to set
     */
    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }
}
