package factorial;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Factorial extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        //grid.getChildren().add(btn);
        grid.setHgap(20);
        grid.setVgap(10);
        grid.setPadding(new Insets(27, 27, 27, 27));

        Label etiqueta = new Label();
        etiqueta.setAlignment(Pos.CENTER);
        etiqueta.setText("Numero");

        grid.add(etiqueta, 0, 1);

        TextField numero = new TextField();
        grid.add(numero, 1, 1);

        Button factorial = new Button("Factorial");
        grid.add(factorial, 1, 2);

        Label resultado = new Label();
        grid.add(resultado, 2, 1);
        
        

        factorial.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int numero1 = Integer.parseInt(numero.getText());
                int mult = 1;

                for (int i = numero1; i >= 1; i--)
                    mult *= i;

                Label etiqueta = new Label();
                etiqueta.setAlignment(Pos.CENTER);
                etiqueta.setText("el resultado es:  " + mult);

                grid.add(etiqueta, 1, 3);
            }
        });

        Scene scene = new Scene(grid, 400, 400);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
