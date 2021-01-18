/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ASUS
 */
public class DataPersonal {

    private final StringProperty namadepan = new SimpleStringProperty();
    private final StringProperty namabelakang = new SimpleStringProperty();
    private final StringProperty alamat = new SimpleStringProperty();
    private final StringProperty kotakabupaten = new SimpleStringProperty();
    private final StringProperty nohp = new SimpleStringProperty();

    public DataPersonal() {
    }
    
    public DataPersonal(String namadepan,String namabelakang) {
        //inisialisasi dari parameter
        this.namadepan = new SimpleStringProperty(namadepan);
        this.namabelakang =  new SimpleStringProperty(namabelakang);
        //inisialisasi dengan nilai sekedar untuk memudahkan tes
        this.alamat = new SimpleStringProperty("Suatu Alamat");
        this.kotakabupaten = new SimpleStringProperty("Suatu Kota");
        this.nohp = new SimpleStringProperty("0007007");
    }
    
    

    public String getNohp() {
        return nohp.get();
    }

    public void setNohp(String value) {
        nohp.set(value);
    }

    public StringProperty nohpProperty() {
        return nohp;
    }
    

    public String getKotakabupaten() {
        return kotakabupaten.get();
    }

    public void setKotakabupaten(String value) {
        kotakabupaten.set(value);
    }

    public StringProperty kotakabupatenProperty() {
        return kotakabupaten;
    }
    

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String value) {
        alamat.set(value);
    }

    public StringProperty alamatProperty() {
        return alamat;
    }
    

    public String getNamabelakang() {
        return namabelakang.get();
    }

    public void setNamabelakang(String value) {
        namabelakang.set(value);
    }

    public StringProperty namabelakangProperty() {
        return namabelakang;
    }
    

    public String getNamadepan() {
        return namadepan.get();
    }

    public void setNamadepan(String value) {
        namadepan.set(value);
    }

    public StringProperty namadepanProperty() {
        return namadepan;
    }
    
    
}
