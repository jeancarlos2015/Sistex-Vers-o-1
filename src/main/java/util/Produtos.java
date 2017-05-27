/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.sistex.cdp.Item;
import com.sistex.cdp.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jean
 */
public class Produtos {
    private List<Produto> produtos = new ArrayList<>();

    
    
     /**
     * @return the produtos
     */
    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(List<Item> produtos) {
        this.produtos = new ArrayList(produtos);
    }
}
