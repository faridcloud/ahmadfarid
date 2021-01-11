/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ASUS
 */
public class BukuAlamat extends Application {
    
    //variabel kelas
    private Stage stageAplikasi;
    private BorderPane rootAplikasi;
    
    @Override
    public void start(Stage primaryStage){
        this.stageAplikasi = primaryStage;
        this.stageAplikasi.setTitle("Buku Alamat");
        
        initGuiKerangka();//fungsi inisialisasi node dari GuiKerangka.fxml
        //initViewBukuAlamat();//fungsi inisialisasi node dari viewBukuAlamat.fxml
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void initGuiKerangka() {
        try {
            FMXLLoader loader = new FMXLLoader();
            loader.setLocation(BukuAlamat.class.getResource("view/GuiKerangka.fxml"));
            rootAplikasi = (BorderPane)loader.load();
            
            Scene sceneAplikasi = new Scene(rootAplikasi);
            stageAplikasi.setScene(sceneAplikasi);
            stageAplikasi.show();
        } catch (IOException ex){
            logger.getLogger(BukuAlamat.class.getName()).log(level.SEVERE,null,ex);
        }
    }
    
}
