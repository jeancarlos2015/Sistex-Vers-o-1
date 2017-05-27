/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes;

import com.sistex.cdp.Item;
import com.sistex.cdp.Pedido;
import com.sistex.cgd.Dao;
import com.sistex.cgd.DaoPedido;
import com.sistex.cgd.Persistencia;

/**
 *
 * @author jean
 */
public class FabricaPedido extends Fabrica{
    @Override
    public Item criaObjeto(){return new Pedido();}
    
    
    @Override
    public Dao criaDao(){return new DaoPedido();}
    
   @Override
    public Persistencia criaPersistencia(){return new Persistencia();}
}
