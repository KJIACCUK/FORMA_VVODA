package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Main{ //extends Application {

    //@Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
//    }


    public static void main(String[] args) {
        //launch(args);
        Controller con = new Controller("КуКУсики");
        con.setVisible(true);
        con.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setSize(300,200);
        con.setResizable(false); //нельзя изменять размер
        con.setLocationRelativeTo(null); //форма по центру экрана
        con.Scan();
        con.z = counts(con.z);
        con.x = counts(con.x);
        con.Scan(con.z, con.x);
        //con.Scan(con.z,con.x);
    }
        public static int counts(int x){
            x += 1;
            return x;
    }


}
