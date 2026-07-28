package br.com.alunis;

import br.com.alunis.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunisApplication {

    public static void main(String[] args) throws SQLException {

        System.out.println("=== ALUNIS ===");
        System.out.println("Aplicação iniciada!");

        // =========================================================
        // CONEXÃO COM O BANCO
        // =========================================================

        Connection connection = DatabaseConnection.getConnection();

        System.out.println(connection.getCatalog());
        System.out.println(connection.getSchema());



        // =========================================================
        // PREPARAÇÃO DO COMANDO SQL
        // =========================================================

        String sql = "SELECT * FROM check_in";

        System.out.println(sql);

        PreparedStatement statement =
                connection.prepareStatement(sql);



        // =========================================================
        // EXECUÇÃO DO SQL
        // =========================================================

        ResultSet resultSet = statement.executeQuery();



        // =========================================================
        // LEITURA DOS RESULTADOS
        // =========================================================

        while (resultSet.next()) {
            System.out.println("Entrou no while");
        }



        // =========================================================
        // INFORMAÇÕES DA CONEXÃO
        // =========================================================

        DatabaseMetaData metaData =
                connection.getMetaData();

        System.out.println(connection);

        System.out.println(metaData.getDatabaseProductName());

        System.out.println(metaData.getURL());

        System.out.println(metaData.getUserName());

    }

}