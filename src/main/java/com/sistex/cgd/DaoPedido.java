/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistex.cgd;

import com.sistex.cdp.Item;
import com.sistex.cdp.Pedido;
import java.util.ArrayList;
import java.util.List;
import padroes.Fabrica;
import static padroes.Tipo.pedido;

/**
 *
 * @author jean
 */
public class DaoPedido implements Dao{
    Fabrica f = Fabrica.make(pedido);
    private final Persistencia conexao = f.criaPersistencia();
    
    @Override
    public boolean cadastrar(Item item) {
        Pedido p =(Pedido) item;
        String comando = "INSERT INTO PEDIDO(codigo_cliente, codigo_produto, descricao, preco) VALUES("+p.getCodigo_cliente()+","+p.getCodigo_produto()+",'"+p.getDescricao()+"',"+p.getPreco()+")";
        return conexao.executar(comando);
    }

    @Override
    public boolean excluir(Item item) {
        String comando = "DELETE FROM PEDIDO where codigo_cliente="+item.getCodigo()+" or codigo="+item.getCodigo();
        return conexao.executar(comando);
    }

    @Override
    public List<Item> listar() {
        Persistencia p = f.criaPersistencia();
        String vetor[] = p.getValores("SELECT *FROM PEDIDO").split(";");
        Pedido ped;
        List<Item> list = new ArrayList<>();
        for(String pedido:vetor){
            String str[] = pedido.split(",");
            ped= new Pedido();
            ped.setCodigo(str[0]);
            ped.setCodigo_cliente(str[1]);
            ped.setCodigo_produto(str[2]);
            ped.setDescricao(str[3]);
            ped.setPreco(str[4]);
            list.add(ped);
        }
        return list;
    }

    @Override
    public boolean existe(Item item) {
        Persistencia p = f.criaPersistencia();
        Pedido ped = (Pedido) item;
        String info[] = p.getValores("SELECT codigo FROM pedido WHERE codigo="+ped.getCodigo()+" or codigo_cliente="+ped.getCodigo_cliente()+"").split(";");
        return info.length>0;
    }

    
   
    @Override
    public List<Item> listarVinculo(Item item) {
        Persistencia p = f.criaPersistencia();
        String vetor[] = p.getValores("SELECT *FROM PEDIDO where codigo_cliente = "+item.getCodigo()).split(";");
        Pedido ped;
        List<Item> list = new ArrayList<>();
        for(String pedido:vetor){
            String str[] = pedido.split(",");
            ped= new Pedido();
            ped.setCodigo(str[0]);
            ped.setCodigo_cliente(str[1]);
            ped.setCodigo_produto(str[2]);
            ped.setDescricao(str[3]);
            ped.setPreco(str[4]);
            list.add(ped);
        }
        return list;
    }

    @Override
    public Item getItem(int codigo) {
        Persistencia p = f.criaPersistencia();
        String info[] = p.getValores("SELECT *FROM pedido WHERE codigo="+codigo).split(";");
        Pedido ped = new Pedido();
        for(String pedido:info){
            String str[] = pedido.split(",");
            ped= new Pedido();
            ped.setCodigo(str[0]);
            ped.setCodigo_cliente(str[1]);
            ped.setCodigo_produto(str[2]);
            ped.setDescricao(str[3]);
            ped.setPreco(str[4]);
        }
        return ped;
    }

    @Override
    public Item getItem(String codigo1) {
        int codigo = Integer.parseInt(codigo1);
        return getItem(codigo);
    }

    @Override
    public boolean existe(String codigo1) {
        Persistencia p = f.criaPersistencia();
        String info[] = p.getValores("SELECT codigo FROM pedido WHERE codigo="+codigo1+"").split(";");
        return info.length>0;
    }

    @Override
    public boolean excluirAll() {
        return conexao.executar("Delete FROM PEDIDO") && conexao.executar("ALTER SEQUENCE pedido_codigo_seq RESTART WITH 1;");
    }
    
}
