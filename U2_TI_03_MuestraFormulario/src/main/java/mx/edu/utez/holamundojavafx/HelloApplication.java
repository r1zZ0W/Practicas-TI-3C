package mx.edu.utez.holamundojavafx;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.controlsfx.control.spreadsheet.Grid;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        
        
        /*///FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label myLabel = new Label("Hello 3C");
        ////Label laberl2 = new Label("Label 2");
        Button btnAceptar = new Button ("Aceptar");
        Button btnCancelar = new Button("Cancelar"); 

        btnAceptar.setOnAction(e ->{
            myLabel.setText("Aceptado");
        });
        btnCancelar.setOnAction(e ->{
            myLabel.setText("Cancelado");
        }); */

        GridPane form = new GridPane();


        Label lblName = new Label("Nombre");
        TextField tfName = new TextField();

        Label lblAge = new Label("Edad");
        TextField tfAge = new TextField();

        Label lblOptions = new Label("Opciones");
        ObservableList<String> options = FXCollections.observableArrayList("Estudiante", "Profesor", "Admin");
        ComboBox<String> comOptions = new ComboBox<>(options);

        Button btnAceptar = new Button("Aceptar");
        Label lblResultado = new Label();


        btnAceptar.setOnAction(e -> {

            String name = tfName.getText();
            String age = tfAge.getText();
            String selection = comOptions.getSelectionModel().getSelectedItem();

            if (name.isEmpty() || age.isEmpty() || selection.isEmpty()){

                System.out.println("TODOS LOS CAMPOS SON OBLIGATORIOS");

                lblResultado.setText("Todos los valores deben ser obligarotrios");
                lblResultado.setStyle("-fx-text-fill: red;");

            }else {

                lblResultado.setText("Nombre: "+name +"\nEdad: "+age + "\nOpciones: "+selection);

                lblResultado.setStyle("-fx-text-fill: darkgreen;");
                form.setStyle("-fx-background-color: lightgreen;");

            }
        });

        //VBox root = new VBox(50, myLabel, btnAceptar, btnCancelar);





        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);

        form.add(lblName, 0, 0);
        form.add(tfName, 1, 0);

        form.add(lblAge, 0, 1);
        form.add(tfAge, 1, 1);

        form.add(lblOptions, 0, 2);
        form.add(comOptions, 1, 2);

        form.add(btnAceptar, 0, 3);
        form.add(lblResultado, 0, 4);

        //root.setPadding(new Insets(20));
        //root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(form, 500, 700);

        stage.setTitle("Primera App en JavaFX");
        Image image = new Image(getClass().getResourceAsStream("/icons/goku.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}