/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import com.google.gson.Gson;
import com.sistex.cdp.Cliente;
import com.sistex.cdp.Pedido;
import com.sistex.cdp.Produto;
import com.sistex.cgd.Dao;
import util.Produtos;
import util.Pedidos;
import util.Clientes;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import padroes.Fabrica;
import padroes.Tipo;
import static padroes.Tipo.pedido;
import util.Funcionarios;


/**
 *
 * @author jean
 */
@WebService(serviceName = "Ws")
public class Ws {
    private Gson g = new Gson();
    

    /**
     * Operação de Ws service
     */
    @WebMethod(operationName = "listarPedidos")
    public String listarPedidos() {
        Fabrica f = Fabrica.make(pedido);
        Dao dao = f.criaDao();
        Pedidos p = new Pedidos();
        return g.toJson(p);
    }
    
    @WebMethod(operationName = "listarClientes")
    public String listarClientes() {
        Fabrica f = Fabrica.make(Tipo.cliente);
        Dao dao = f.criaDao();
        Clientes c = new Clientes();
        return g.toJson(c);
    }
    
    @WebMethod(operationName = "listarProdutos")
    public String listarProdutos() {
        Fabrica f = Fabrica.make(Tipo.produto);
        Dao dao = f.criaDao();
        Produtos p = new Produtos();
        return g.toJson(p);
    }
    
    @WebMethod(operationName = "listarFuncionarios")
    public String listarFuncionarios() {
        Fabrica f = Fabrica.make(Tipo.funcionario);
        Dao dao = f.criaDao();
        Funcionarios func = new Funcionarios();
        return g.toJson(func);
    }
    /**
     * Operação de Ws service
     * @param codigo
     */
    @WebMethod(operationName = "getPedido")
    public String getPedido(@WebParam(name = "codigo") int codigo) {
        Fabrica f = Fabrica.make(Tipo.pedido);
        Dao dao = f.criaDao();
        return g.toJson(null);
    }

    @WebMethod(operationName = "getCliente")
    public String getCliente(@WebParam(name = "codigo") int codigo) {
        Fabrica f = Fabrica.make(Tipo.cliente);
        Dao dao = f.criaDao();
        Cliente c = null;
        return g.toJson(c);
    }
    
    @WebMethod(operationName = "getProduto")
    public String getProduto(@WebParam(name = "codigo") int codigo) {
        Fabrica f = Fabrica.make(Tipo.produto);
        Dao dao = f.criaDao();
        Produto p = null;
        return g.toJson(p);
    }
   
    
    
}
