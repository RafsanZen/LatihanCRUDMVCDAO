/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.RafsanZenM.Latihanmvcjdbc.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.RafsanZenM.Latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.RafsanZenM.Latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;

/**
 * Nama : Rafsan Zen Mustaofa 
 * NIm  : 10119083
 * Kelas : IF 2
 */
public class KingsBabershopDatabase {
    
   private static Connection connection;
   private static PelangganDao pelangganDao;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = (Connection) dataSource.getConnection();
        }
        return connection;
    }
    public static PelangganDao getPelangganDao() throws SQLException {
        if (pelangganDao == null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }
  
}

