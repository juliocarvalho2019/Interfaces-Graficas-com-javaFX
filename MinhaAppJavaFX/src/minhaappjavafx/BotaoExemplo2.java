/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhaappjavafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author julio
 */
public class BotaoExemplo2 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Layout
        FlowPane noRaiz = new FlowPane();
        //Cena
        Scene minhaCena = new Scene(noRaiz, 300, 200);

        //Nó
        Button botao = new Button();
        botao.setText("TIGRÃO");
        botao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Ola Mundo");
            }
        });

        //Adicionar elemento em cena.
        noRaiz.getChildren().add(botao);

        //Adicionar a cena no palco.
        primaryStage.setScene(minhaCena);

        //Exibir palco e sua cena
        primaryStage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }

}
