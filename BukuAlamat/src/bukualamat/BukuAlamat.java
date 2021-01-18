/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;

import bukualamat.model.DataPersonal;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 *
 * @author ASUS
 */
public class BukuAlamat extends Application {
    
    //variabel kelas
    private Stage stageAplikasi;
    private BorderPane rootAplikasi;
    //listdataperson bertipe ObservableList, yang berisi data dari model DataPersonal
    private ObservableList<DataPersonal> dataperson = FXCollections.observableArrayList();
    
    //Konstruksi untuk inisialisasi data sebagai bahan tes
    public BukuAlamat(){
        dataperson.add(new DataPersonal("Budi","Santoso"));
        dataperson.add(new DataPersonal("Ahmad","Dahlan"));
        dataperson.add(new DataPersonal("Hasyim","Asy'ari"));
        dataperson.add(new DataPersonal("Anies","Baswedan"));
        dataperson.add(new DataPersonal("Ridwan","Kamil"));
    }
    //fungsi untuk membaca data list
    public ObservableList<DataPersonal> getDataPersonal(){
        return dataperson;
    }
    
    @Override
    public void start(Stage primaryStage){
        this.stageAplikasi = primaryStage;
        this.stageAplikasi.setTitle("Buku Alamat");
        
        initGuiKerangka();//fungsi inisialisasi node dari GuiKerangka.fxml
        initViewBukuAlamat();//fungsi inisialisasi node dari viewBukuAlamat.fxml
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void initGuiKerangka() {
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(BukuAlamat.class.getResource("view/GuiKerangka.fxml"));
            rootAplikasi = (BorderPane)loader.load();
            
            Scene sceneAplikasi = new Scene(rootAplikasi);
            stageAplikasi.setScene(sceneAplikasi);
            stageAplikasi.show();
        }catch (IOException ex){
            Logger.getLogger(BukuAlamat.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    private void initViewBukuAlamat(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(BukuAlamat.class.getResource("view/viewBukuAlamat.fxml"));
            AnchorPane guiIsi = (AnchorPane)loader.load();
            rootAplikasi.setCenter(guiIsi);
        }catch(IOException ex){
            Logger.getLogger(BukuAlamat.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
