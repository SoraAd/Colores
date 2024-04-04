package org.example.interfazbase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("inicio-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Colors");
        stage.setScene(scene);
        stage.show();
    }

    public void chargetColor(TextField rgb, Circle circle, Label error){
        String color = rgb.getText().toLowerCase();
        if(color.length()==7){
            if(color.charAt(0) == '#') {
                for (int i = 1; i < 7; i++) {
                    if((int) color.charAt(i) >=97 && (int) color.charAt(i) <=102 ||
                            (int) color.charAt(i) >=48 && (int) color.charAt(i)<=57) {
                        if(i==6) {
                            circle.setFill(Paint.valueOf(rgb.getText().toLowerCase()));
                            error.setText("");
                        }

                    }else {
                        error.setText("The character "+i+" valuet is incorrect");
                        return;
                    }
                }
            }else{error.setText("Your missing #");}
        }else {error.setText("It is not the correct measurement");}
    }

    public static void main(String[] args) {
        launch();
    }
}