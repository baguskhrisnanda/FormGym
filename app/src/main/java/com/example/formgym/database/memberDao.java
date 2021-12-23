package com.example.formgym.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface memberDao {
    @Query("SELECT * FROM memberEntity")
    List<memberEntity> getAll();

    @Query("INSERT INTO memberEntity (Nama,Alamat,Telepon,JenisKelamin,Fasilitas,Umur) VALUES(:Nama,:Alamat,:Telepon,:JenisKelamin,:Fasilitas,:Umur)")
    void insertAll(String Nama, String Alamat, Integer Telepon , String JenisKelamin, String Fasilitas, Integer Umur);

    //edit
    @Query("UPDATE memberEntity SET Nama=:Nama, Alamat=:Alamat, Telepon=:Telepon, JenisKelamin=:JenisKelamin WHERE idMember=:idMember")
    void update(int idMember, String Nama, String Alamat, Integer Telepon , String JenisKelamin);

    @Query("SELECT * FROM memberEntity WHERE idMember=:idMember")
    memberEntity get(int idMember);

    @Delete
    void delete(memberEntity memberEntity);

}
