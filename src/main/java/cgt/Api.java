/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import com.sistex.cdp.Item;
import java.util.List;

/**
 *
 * @author jean
 */
public interface Api {
    public void cadastrar(Item item);
    public void excluir(Item item);
    public List<Item> listar();
    public List<Item> listarVinculados(Item item);
}
