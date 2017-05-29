/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgt;

import com.sistex.cdp.Item;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jean
 */
public interface Api {
    public void setRequest(HttpServletRequest request);
    public Item getItem();
    public void cadastrar();
    public void excluir();
    public boolean existe(Item item);
    public List<Item> listar();
    public List<Item> listarVinculados();
}
