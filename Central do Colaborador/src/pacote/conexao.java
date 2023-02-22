/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; // Busca e analisa algum erro na comunicação SQL
import javax.swing.JOptionPane; // Importação para utilizar de Pop-Ups

/**
 *
 * @author c02maq1
 */
public class conexao {
    public static Connection con = null;
    
    public static void Conectar() {
        //System.out.println("Conectando ao banco");
        try {
            Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java","root","");
            System.out.println("Conectado.");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada.");
        } catch (SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Erro ao conectar" + e, "ERRO", JOptionPane.INFORMATION_MESSAGE);
            
            throw new RuntimeException(e);
        }
    }
}
