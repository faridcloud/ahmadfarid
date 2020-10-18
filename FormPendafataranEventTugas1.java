/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guijava1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ASUS
 */
public class FormPendafataranEventTugas1 extends Application {
    @Override
    public void start(Stage stage) {
        //creating label email
        Text namaEvent = new Text("Hack Fest 3.0");
        Text text1 = new Text("Nama");
        //creating label password
        Text text2 = new Text("No Telp.");
        Text text3 = new Text("Alamat");
        //Creating Text Filed for email
        TextField textField1 = new TextField();
        //Creating Text Filed for password
        TextField textField2 = new TextField();
        TextArea textarea = new TextArea();
        //Creating Buttons
        Button button1 = new Button("Kirim");
        Button button2 = new Button("Hapus");
        //Creating a Grid Pane
        GridPane gridPane = new GridPane();
        //Setting size for the pane
        gridPane.setMinSize(400, 200);
        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);
        //Arranging all the nodes in the grid
        gridPane.add(namaEvent, 0, 0);
        gridPane.add(text1, 0, 1);
        gridPane.add(textField1, 1, 1);
        gridPane.add(text2, 0, 2);
        gridPane.add(textField2, 1, 2);
        gridPane.add(text3, 0, 3);
        gridPane.add(textarea, 1, 3);
        gridPane.add(button1, 0, 4);
        gridPane.add(button2, 1, 4);
        //Creating a scene object
        Scene scene = new Scene(gridPane);
        //Setting title to the Stage
        stage.setTitle("Grid Pane Example");
        //Adding scene to the stage
        stage.setScene(scene);
        //Displaying the contents of the stage
        stage.show();
        }
        public static void main(String args[]){
        launch(args);
        }
}
