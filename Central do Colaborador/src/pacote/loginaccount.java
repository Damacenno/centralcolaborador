/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static pacote.conexao.con;


/**
 *
 * @author c02maq1
 */
public class loginaccount {
    static String login, senha,nome,id;

    public static void loginacess() {
        String sql;
        sql = "select * from usuarios where login = ?  and senha = ?";
       try {
       PreparedStatement stm  = con.prepareStatement(sql);
            stm.setString(1,login);
            stm.setString(2,senha);
       
       ResultSet rs = stm.executeQuery();
        if (!rs.first()) {
            JOptionPane.showMessageDialog(janelas.logar,"Usuario não encontrado. Fale com seu superior para solicitar acesso.");
            janelas.logar.show();
            login = "";
            senha = "";
        } else {
            id = rs.getString("id");
            nome = rs.getString("nome");
            janelas.menu.show();
      
        }
       } catch (SQLException e) {
           System.out.println("Erro");
           System.out.println(e);
       }
}

}

