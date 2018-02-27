/*
 * Ty McMurry
 * 16.6 Class Assigment
 * copyright Feb 2018
 */
package pkg16_6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    
    public void start(Stage primaryStage) {
        TextField tfTextField = new TextField();
        TextField tfPreColumnSize = new TextField();
        
        tfTextField.setAlignment(Pos.BOTTOM_RIGHT);
        tfPreColumnSize.setAlignment(Pos.BOTTOM_RIGHT);
        
        tfTextField.setPrefColumnCount(13);
        tfPreColumnSize.setPrefColumnCount(3);
        
        HBox hBox1 = new HBox();//creating space for text box
        hBox1.setAlignment(Pos.CENTER);
        hBox1.getChildren().addAll(new Label("Input Text Here"), tfTextField);
        
        RadioButton rbLeft = new RadioButton("Left");//creating 3 radio buttons for left right and center
        RadioButton rbMiddle = new RadioButton("Middle");
       RadioButton rbRight = new RadioButton("Right");
       
       ToggleGroup group = new ToggleGroup();//setting radio buttons so only one can be selected at at time
       rbLeft.setToggleGroup(group);
       rbMiddle.setToggleGroup(group);
       rbRight.setToggleGroup(group);        
       
       HBox hBox2 = new HBox(5);//adding radio buttons to the stage
       hBox2.setAlignment(Pos.CENTER);
       hBox2.getChildren().addAll(rbLeft, rbMiddle, rbRight);
       
       HBox hBox3 = new HBox(5);//adding column size text field to output
       hBox3.getChildren().addAll(new Label("Column Size"), tfPreColumnSize);
       
       HBox hBox4 = new HBox(15);//adding horizontal box to stage
       hBox4.setAlignment(Pos.CENTER);
       hBox4.getChildren().addAll(hBox2, hBox3);
       
       VBox vBox = new VBox(5);//adding vertical box to stage
       vBox.getChildren().addAll(hBox1, hBox4);
       
       Scene scene = new Scene(vBox);//setting primary stage
       primaryStage.setTitle("Execise 16.6");
       primaryStage.setScene(scene);
       primaryStage.show();
       
       tfPreColumnSize.setOnAction(e -> {//action event for input from column size
           tfTextField.setPrefColumnCount(
           Integer.parseInt(tfPreColumnSize.getText())        
           );
       });
       
       rbLeft.setOnAction(e -> tfTextField.setAlignment(Pos.BASELINE_LEFT));//adding action event to handle when a radio button is clicked
       rbMiddle.setOnAction(e -> tfTextField.setAlignment(Pos.BASELINE_CENTER));
       rbRight.setOnAction(e -> tfTextField.setAlignment(Pos.BASELINE_RIGHT));
    }
    
    public static void main(String[] args) {
       launch(args);
    }
    
}
