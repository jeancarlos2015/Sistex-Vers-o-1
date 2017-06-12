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
    
    public boolean cadastrar(Item item);
    public boolean excluir(Item item);
    public boolean excluirAll();
    public boolean existe(Item item);
    public List<Item> listar();
    public List<Item> listarVinculados(Item item); 
}
