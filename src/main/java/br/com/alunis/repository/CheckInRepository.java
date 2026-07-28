package br.com.alunis.repository;

import br.com.alunis.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class CheckInRepository {

    private Connection connection;

    public CheckInRepository() throws SQLException {
        this.connection = DatabaseConnection.getConnection();
    }
}
