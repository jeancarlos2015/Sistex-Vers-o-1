/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgt;

import com.sistex.cdp.Item;
import com.sistex.cgd.Dao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import padroes.Fabrica;

/**
 *
 * @author jean
 */
public abstract class  ApiAbstract implements Api{
    protected final  Dao dao;
    protected final Fabrica fabrica;
    protected HttpServletRequest request;
    
    public ApiAbstract(Fabrica f){
        dao = f.criaDao();
        fabrica = f;
    }
    
    @Override
    public void cadastrar() {
        Item item = getItem();
        dao.cadastrar(item);
    }

    @Override
    public void excluir() {
        Item item = getItem();
        dao.excluir(item);
    }

    @Override
    public List<Item> listar() {
        return dao.listar();
    }

    @Override
    public List<Item> listarVinculados() {
        Item item = getItem();
        return dao.listarVinculo(item);
    }

    @Override
    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    
    
}
