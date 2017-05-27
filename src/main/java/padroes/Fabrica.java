/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes;

import com.sistex.cdp.Item;
import com.sistex.cgd.Dao;
import com.sistex.cgd.Persistencia;

/**
 *
 * @author jean
 */
public class Fabrica {
    public static Fabrica make(Tipo tipo){
        switch(tipo){
            case cliente:
                return new FabricaCliente();
            case produto:
                return new FabricaProduto();
            case pedido:
                return new FabricaPedido();
            case funcionario:
                return new FabricaFuncionario();
            default:
                return new Fabrica();
        }
    }
    
    public Item criaObjeto(){return null;}
    public Dao criaDao(){return null;}
    public Persistencia criaPersistencia(){return null;}
    
}
