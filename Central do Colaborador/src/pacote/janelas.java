/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

/**
 *
 * @author c02maq1
 */
public class janelas {
    static tela logar = new tela();
    static inicio menu = new inicio();
    static alterar altera = new alterar();
    static estoque stock = new estoque();
    static vender venda = new vender();
    
    // ALTER TABLE historico ADD FOREIGN KEY (item) reference estoque (itemid)
    
    //SELECT * FROM historico iNNER JOIN estoque ON estoque.itemid = historico.item WHERE historico.protocolo = ?
    
    // SELECT historico.protocolo, historico.item, estoque.item, estoque.preco FROM historico iNNER JOIN estoque ON estoque.itemid = historico.item WHERE historico.protocolo = ?
    
    
}
