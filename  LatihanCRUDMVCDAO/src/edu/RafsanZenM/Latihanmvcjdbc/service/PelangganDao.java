/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.RafsanZenM.Latihanmvcjdbc.service;

import edu.RafsanZenM.Latihanmvcjdbc.entity.Pelanggan;
import edu.RafsanZenM.Latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
* Nama : Rafsan Zen Mustaofa 
 * NIm  : 10119083
 * Kelas : IF 2
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(Integer id) throws PelangganException;

   
    public Pelanggan getPelanggan(String email) throws PelangganException;

  
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
