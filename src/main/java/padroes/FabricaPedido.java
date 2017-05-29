/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes;

import com.sistex.cgt.Api;
import com.sistex.cgt.PedidoApi;
import com.sistex.cci.ControlePedido;
import com.sistex.cdp.Item;
import com.sistex.cdp.Pedido;
import com.sistex.cgd.Dao;
import com.sistex.cgd.DaoPedido;
import com.sistex.cgd.Persistencia;
import javax.servlet.http.HttpServlet;

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
    
    @Override
    public HttpServlet criaControle(){return new ControlePedido();}
    
    @Override
    public Api criaApi(){return new PedidoApi();}
    
}
