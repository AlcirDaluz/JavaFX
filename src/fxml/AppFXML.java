package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class AppFXML extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        String arquivoCss = getClass().getResource("/fxml/Login.css").toExternalForm();
        URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
        GridPane raiz = FXMLLoader.load(arquivoFXML);

        Scene cena = new Scene(raiz, 350, 400);
        cena.getStylesheets().add(arquivoCss);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Tela de Login");
        primaryStage.setScene(cena);
        primaryStage.show();
    }
}
