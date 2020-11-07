/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class Kalkulator1Controller implements Initializable {

    @FXML
    private Button btTujuh;
    @FXML
    private Button btDelapan;
    @FXML
    private Button btSembilan;
    @FXML
    private Button btEmpat;
    @FXML
    private Button btLima;
    @FXML
    private Button btEnam;
    @FXML
    private Button btSatu;
    @FXML
    private Button btDua;
    @FXML
    private Button btTiga;
    @FXML
    private Button btKurungbuka;
    @FXML
    private Button btKurungtutup;
    @FXML
    private Button btPersen;
    @FXML
    private Button btAC;
    @FXML
    private Button btBagi;
    @FXML
    private Button btKali;
    @FXML
    private Button btMinus;
    @FXML
    private Button btPlus;
    @FXML
    private Button btSamadengan;
    @FXML
    private Button btNol;
    @FXML
    private Button btTitik;
    @FXML
    private TextArea Display;
    private int Angka1 = 0;
    private String operasi = "netral";
    private int Angka2 = 0;
    private int hasil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClicked(ActionEvent event) {
    if(event.getSource()== btNol){
            if(!Display.getText().isBlank()){
                Display.setText(Display.getText()+"0");
            }
        }
        if(event.getSource()==btSatu){
            Display.setText(Display.getText()+"1");
        }else if(event.getSource()==btDua){
            Display.setText(Display.getText()+"2");
        }else if(event.getSource()==btTiga){
            Display.setText(Display.getText()+"3");
        }else if(event.getSource()==btEmpat){
            Display.setText(Display.getText()+"4");
        }else if(event.getSource()==btLima){
            Display.setText(Display.getText()+"5");
        }else if(event.getSource()==btEnam){
            Display.setText(Display.getText()+"6");
        }else if(event.getSource()==btTujuh){
            Display.setText(Display.getText()+"7");
        }else if(event.getSource()==btDelapan){
            Display.setText(Display.getText()+"8");
        }else if(event.getSource()==btSembilan){
            Display.setText(Display.getText()+"9");
        }else if(event.getSource()==btAC){
            Display.setText("");
        }else if(event.getSource()==btKurungbuka){
            Display.setText(Display.getText()+"(");
        }else if(event.getSource()==btKurungtutup){
            Display.setText(Display.getText()+")");
        }else if(event.getSource()==btPersen){
            Display.setText(Display.getText()+"%");
        }else if(event.getSource()==btPlus){
            Angka1 = Integer.parseInt(Display.getText());
            operasi = "plus";
            Display.setText("");
        }else if(event.getSource()==btMinus){
            Angka1 = Integer.parseInt(Display.getText());
            operasi = "minus";
            Display.setText("");
        }else if(event.getSource()==btKali){
            Angka1 = Integer.parseInt(Display.getText());
            operasi = "kali";
            Display.setText("");
        }else if(event.getSource()==btBagi){
            Angka1 = Integer.parseInt(Display.getText());
            operasi = "bagi";
            Display.setText("");
        }else if(event.getSource()==btSamadengan){
            Angka2 = Integer.parseInt(Display.getText());
            if(operasi.equals("plus")){
                hasil = Angka1 + Angka2;
            }
            if(operasi.equals("minus")){
                hasil = Angka1 - Angka2;
            }
            if(operasi.equals("kali")){
                hasil = Angka1 * Angka2;
            }
            if(operasi.equals("bagi")){
                hasil = Angka1 / Angka2;
            }
            Display.setText(String.valueOf(hasil));
            operasi = "netral";
        }
    }
}
    

