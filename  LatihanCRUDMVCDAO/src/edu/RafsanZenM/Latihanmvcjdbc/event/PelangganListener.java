/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.RafsanZenM.Latihanmvcjdbc.event;

import edu.RafsanZenM.Latihanmvcjdbc.entity.Pelanggan;
import edu.RafsanZenM.Latihanmvcjdbc.model.PelangganModel;

/**
 * Nama : Rafsan Zen Mustaofa 
 * NIm  : 10119083
 * Kelas : IF 2
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    public void onDelete();

    public void onChange();

    public void onInsert();

    public void onUpdate();
}
