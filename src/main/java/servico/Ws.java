/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import com.google.gson.Gson;
import com.sistex.cdp.Cliente;
import com.sistex.cdp.Funcionario;
import com.sistex.cdp.Item;
import com.sistex.cdp.Pedido;
import com.sistex.cdp.Produto;
import com.sistex.cgd.Dao;
import java.util.ArrayList;
import java.util.Collection;
import util.Produtos;
import util.Pedidos;
import util.Clientes;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import padroes.Fabrica;
import padroes.Tipo;
import static padroes.Tipo.cliente;
import static padroes.Tipo.funcionario;
import static padroes.Tipo.pedido;
import static padroes.Tipo.produto;
import util.Funcionarios;


/**
 *
 * @author jean
 */
@WebService(serviceName = "Ws")
public class Ws {
    private Gson g = new Gson();
    private Pedidos pedidos;
    private Clientes clientes;
    private Funcionarios funcionarios;
    /**
     * Operação de Ws service
     * @return 
     */
    @WebMethod(operationName = "listarPedidos")
    public String listarPedidos() {
        Fabrica f = Fabrica.make(pedido);
        Dao dao = f.criaDao();
        pedidos = new Pedidos();
        pedidos.setPedidos(dao.listar());
        return g.toJson(pedidos);
    }
    
    @WebMethod(operationName = "listarClientes")
    public String listarClientes() {
        Fabrica f = Fabrica.make(cliente);
        Dao dao = f.criaDao();
        clientes = new Clientes();
        clientes.setClientes(dao.listar());
        return g.toJson(clientes);
    }
    
    @WebMethod(operationName = "listarProdutos")
    public String listarProdutos() {
        Fabrica f = Fabrica.make(produto);
        Dao dao = f.criaDao();
        Produtos p = new Produtos();
        p.setProdutos(dao.listar());
        return g.toJson(p);
    }
    
    @WebMethod(operationName = "listarFuncionarios")
    public String listarFuncionarios() {
        Fabrica f = Fabrica.make(funcionario);
        Dao dao = f.criaDao();
        Funcionarios func = new Funcionarios();
        funcionarios.setFuncionarios(dao.listar());
        return g.toJson(func);
    }
    /**
     * Operação de Ws service
     * @param codigo
     * @return 
     */
    @WebMethod(operationName = "getPedido")
    public String getPedido(@WebParam(name = "codigo") int codigo) {
        Fabrica f = Fabrica.make(pedido);
        Dao dao = f.criaDao();
        Pedido pedido = (Pedido) dao.getItem(0);
        return g.toJson(pedido);
    }

    @WebMethod(operationName = "getCliente")
    public String getCliente(@WebParam(name = "codigo") int codigo) {
        Fabrica f = Fabrica.make(cliente);
        Dao dao = f.criaDao();
        Cliente item = (Cliente) dao.getItem(0);
        return g.toJson(item);
    }
    
    @WebMethod(operationName = "getProduto")
    public String getProduto(@WebParam(name = "codigo") int codigo) {
        Fabrica f = Fabrica.make(produto);
        Dao dao = f.criaDao();
        Produto p = (Produto) dao.getItem(0);
        return g.toJson(p);
    }
   
    
    
}
