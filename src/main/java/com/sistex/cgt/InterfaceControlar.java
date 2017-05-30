/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgt;

import com.sistex.cdp.Cliente;
import com.sistex.cdp.Item;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jean
 */
public interface InterfaceControlar {
    
    public void setRequest(HttpServletRequest request);
    public Item getItem();
    public void cadastrar();
    public void excluir();
    public List<Item> listar();
    public List<Item> listarVinculados();
    public boolean existe(Item item);
    
    public boolean solicitarPedido();
    public List<Item> monitorarPedidos();

    
}
