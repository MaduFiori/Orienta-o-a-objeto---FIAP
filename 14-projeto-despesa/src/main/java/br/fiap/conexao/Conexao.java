package br.fiap.conexao;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//PADRAO CLASSE DE CONEXÃO

public class Conexao {
    private static String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL"; //url do banco de dados
    private static String USER = "rm559149";
    private static String PASSWORD = "220403";

    private Conexao(){

    }

    public static Connection conectar() { //statico para não instanciar (chamar) - connection (olhar slide)
        try {
            DriverManager.getConnection(URL, USER, PASSWORD);//tres tipos de getconnection (só senha, senha e user ou senha, user e mais um)
        } catch (SQLException e) { //excessao para getconnection
            System.out.println("Erro ao conectar no banco\n" + e); //mensagem para saber se conectou
        }
        return null;
    }
}
