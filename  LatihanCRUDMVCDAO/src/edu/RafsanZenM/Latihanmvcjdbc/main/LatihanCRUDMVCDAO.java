/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.RafsanZenM.Latihanmvcjdbc.main;

import edu.RafsanZenM.Latihanmvcjdbc.database.KingsBabershopDatabase;
import edu.RafsanZenM.Latihanmvcjdbc.entity.Pelanggan;
import edu.RafsanZenM.Latihanmvcjdbc.error.PelangganException;
import edu.RafsanZenM.Latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;

/**
 * Nama : Rafsan Zen Mustaofa 
 * NIm  : 10119083
 * Kelas : IF 2
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        PelangganDao dao = KingsBabershopDatabase.getPelangganDao();
        Pelanggan pelanggan = dao.getPelanggan(1);
        pelanggan.setNama("uuy");
        pelanggan.setAlamat("prancis");
      
        
        dao.updatePelanggan(pelanggan);
    }
    
}
