/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Deklarasi package dan import library SQL untuk koneksi ke database
package Tugas10;
import java.sql.*;
/**
 * @author FIFI
 * Kelas Konstanta ini menyimpan konstanta yang diperlukan untuk menghubungkan aplikasi ke database
 */
public class Konstanta {
    //Menyimpan nama driver JDBC untuk MySQL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //URL koneksi ke database, dengan database bernama 'LoginKalkulator'
    static final String DB_URL = "jdbc:mysql://localhost/LoginKalkulator";
    //Username dan password database, kosong karena default MySQL tidak ada password
    static final String DB_USERNAME = "root";
    //Nama tabel pengguna di database
    static final String DB_PASSWORD = "";
    static final String DB_USERS_TABLE_NAME = "users";
}
