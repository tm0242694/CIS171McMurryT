
package racecar;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;



/**
 * Ty McMurry
 * Exercise 15.29 Racing Car
 * copyright Feb 2018
 */
public class RaceCar  extends Application {
   @Override 
    public void start(Stage primaryStage) {
 
      StackPane pane = new StackPane();
       int pWidth = 250;
       int pHeight = 200;
      
       
       
       HBox hBox = new HBox(5);// creating my 4 buttons to pause resume faster and slower
       Button btPause = new Button("Pause");
       Button btResume = new Button("Resume");
       Button btFaster = new Button("Faster");
       Button btSlower = new Button("Slower");
       hBox.setAlignment(Pos.CENTER);
       hBox.getChildren().addAll(btPause, btResume, btFaster, btSlower);
       
       
       
        
       
       btPause.setOnAction(e -> pt.pause());
       btResume.setOnAction(e -> pt.play());
       btFaster.setOnAction(e -> pt.faster());
       btSlower.setOnAction(e -> pt.slower());
                
        BorderPane borderPane = new BorderPane();//setting up buttons on bottom
        borderPane.setCenter(pane);
        borderPane.setAlignment(hBox, Pos.CENTER);
        borderPane.setBottom(hBox);
        
        
        
       Scene scene = new Scene(pane, pWidth, pHeight);
       primaryStage.setTitle("Race Car Vroom");
       primaryStage.setScene(scene);
       primaryStage.show();
       
       int antTime = 1000; 
       PathTransition pt = new PathTransition(Duration.millis(antTime),//creating path for car
       new Line((pWidth - pWidth), (pHeight / 2), (pWidth), (pHeight / 2)), car  
       pt.setCycleCount(PathTransition.INDEFINITE);
       pt.play();
       );      
    }
    
    class car extends Pane {
    // ImageView imageView = new ImageView("image/racecar.gif");//car gif
     private int pWidth = 250;
     private int pHeight = 200;   
     private Rectangle rectangle = new Rectangle(60, 14);//creating rectangle size and color
     
     
     public car() {
       rectangle.setStroke(Color.BLACK);
       rectangle.setFill(Color.RED);
       getChildren().add(rectangle);
     }
              
       
    }
    public void faster (int antTime){//double speed
      antTime = antTime * 2;          
            
    }
    public void slower (int antTime){//slow speed by half
      antTime = antTime / 2;          
            
    }
    
    public static void main(String[] args) {
        launch(args);
       
       
    }
    
}
