/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;
import java.sql.*;
/**
 * @author FIFI
 * Kelas JDBC berisi metode untuk mengelola pengguna di database, termasuk pendaftaran, pengecekan pengguna dan validasi login
 */
public class JDBC {
    //Metode untuk mendaftarkan pengguna baru ke database
    public static boolean daftar(String username, String password){
        try {
            //Memeriksa apakah pengguna sudah ada, jika tidak, lanjutkan pendaftaran 
            if (!periksaPengguna(username)){
                Connection koneksi = DriverManager.getConnection(Konstanta.DB_URL, Konstanta.DB_USERNAME, Konstanta.DB_PASSWORD);
            
                //Query untuk memasukkan data pengguna baru ke tabel 'users'
                PreparedStatement insertUser = koneksi.prepareStatement(
                    "INSERT INTO " + Konstanta.DB_USERS_TABLE_NAME + "(username, password)" + "VALUES(?, ?)");
            
                //Mengisi parameter query dengan username dan password yang diberikan
                insertUser.setString(1, username);
                insertUser.setString(2, password);
            
                //Menjalankan perintah untuk menyimpan pengguna baru didatabase
                insertUser.executeUpdate();
                return true;    //Mengembalikan nilai true jika pendaftaran berhasil
            }
        }catch(SQLException e){
            e.printStackTrace();    //Menampilkan pesan error jika terjadi kesalahan saat eksekusi
        }
        return false;   //Mengembalikan nilai false jika pendaftaran gagal atau pengguna sudah ada 
    }
    
    //Metode untuk memeriksa apakah pengguna sudah ada di database
    public static boolean periksaPengguna(String username){
        try{
           Connection koneksi = DriverManager.getConnection(Konstanta.DB_URL, Konstanta.DB_USERNAME, Konstanta.DB_PASSWORD);
           
           //Query untuk memeriksa keberadaan pengguna berdasarkan username
           PreparedStatement checkUserExists = koneksi.prepareStatement(
                    "SELECT * FROM " + Konstanta.DB_USERS_TABLE_NAME + " WHERE USERNAME = ?");
           
           //Mengisi parameter query dengan username yang diberikan
           checkUserExists.setString(1, username);
           
           //Mengeksekusi query danmenyimpan hasilnya dalam ResultSet
           ResultSet  resultSet = checkUserExists.executeQuery();
           
           //Mengembalikan false jika ResultSet kosong, artinya pengguna belum ada
           if(!resultSet.isBeforeFirst()){
               return false;
           }
        }catch(SQLException e){
            e.printStackTrace();    //Menampilkan pesan error jika terjadi kesalahan saat eksekusi
        }
        
        return true;    //Mengembalikan true jika pengguna sudah ada
    }
    
    //Metode untuk memvalidasi Login pengguna
    public static boolean validasiLogin(String username, String password){
        try{
            Connection koneksi = DriverManager.getConnection(Konstanta.DB_URL, Konstanta.DB_USERNAME, Konstanta.DB_PASSWORD);
            
            //Query untuk memeriksa username dan password yang sesuai di database
            PreparedStatement validasiUser = koneksi.prepareStatement(
                    "SELECT * FROM " + Konstanta.DB_USERS_TABLE_NAME + " WHERE USERNAME = ? AND PASSWORD = ?");
            
            //Mengisi parameter query dengan username dan password yang diberikan
            validasiUser.setString(1, username);
            validasiUser.setString(2, password);
            
            //Mengeksekusi query dan menyimpan hasilnya dalam ResultSet
            ResultSet resultSet = validasiUser.executeQuery();
            
            //Mengembalikan false jika ResultSet kosong, artinya Login gagal
            if(!resultSet.isBeforeFirst()){
                return false;
            }
        }catch(SQLException e){
            e.printStackTrace();    //Menampilkan pesan error jika terjadi kesalahan saat ekseskusi
        }
        
        return true;    //Mengembalikan true jika login berhasil
    }
}
