/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.m_toko;

/**
 *
 * @author A455L
 */
public interface implementToko {
    public void TampilData(m_toko a);
    public void UbahData(m_toko a);
    public void SimpanData(m_toko a);
    public void HapusData(String kode);
    public List<m_toko> getCariKategori(String kategori);
    public List<m_toko> getAll();

}
