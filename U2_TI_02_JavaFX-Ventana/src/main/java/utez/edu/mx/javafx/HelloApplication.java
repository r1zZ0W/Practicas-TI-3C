package utez.edu.mx.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label label = new Label("Hello World");
        StackPane pane = new StackPane(label);
        Scene scene = new Scene(pane, 320, 240);

        stage.setTitle("Hello!");
        Image image = new Image(getClass().getResourceAsStream("/icons/icons8-invitado-masculino-50.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}