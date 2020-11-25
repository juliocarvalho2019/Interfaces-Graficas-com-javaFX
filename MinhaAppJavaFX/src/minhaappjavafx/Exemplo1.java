/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaappjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author julio
 */
public class Exemplo1 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
       
        //Layout
        FlowPane noRaiz = new FlowPane();
        //Cena
        Scene minhaCena = new Scene(noRaiz, 300, 200);
        
        //Nó
//        Label label = new Label();
        
        Button botao =  new Button();
        
//        label.setText("Olá mundo!");
        botao.setText("TIGRÃO");
        
        //Adicionar elemento em cena.
        noRaiz.getChildren().add(botao);
        
        
        //Adicionar a cena no palco.
        primaryStage.setScene(minhaCena);
        
        //Exibir palco e sua cena
        primaryStage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
}
