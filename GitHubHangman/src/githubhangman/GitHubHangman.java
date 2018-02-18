/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubhangman;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class GitHubHangman extends Application{

    private static double HEIGHT = 400;//setting height of pane
    private static double WIDTH = 400;//setting widthe of pane

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        ObservableList<Node> list = pane.getChildren();

        primaryStage.setTitle("Hangman");
        primaryStage.setScene(new Scene(pane, WIDTH, WIDTH));
        Arc arc = new Arc(WIDTH / 4, HEIGHT - HEIGHT / 12, WIDTH / 5, HEIGHT / 12, 0, 180);//creating arc
        arc.setFill(Color.TRANSPARENT);
        arc.setStroke(Color.BLACK);
        list.add(arc);

        Line pole = new Line(arc.getCenterX(), arc.getCenterY() - arc.getRadiusY(), arc.getCenterX(), pane.getHeight() / 12);//creating pole off the center of the arc
        list.add(pole);

        Line topLine = new Line(pole.getEndX(), pole.getEndY(), pane.getWidth() / 1.5, pole.getEndY());//creating top line where pole line ended
        list.add(topLine);
        Line hangLine = new Line(topLine.getEndX(), topLine.getEndY(), topLine.getEndX(), pane.getHeight() / 6);//vertical line connecting to top line
        list.add(hangLine);

        double radius = WIDTH / 10;
        Circle c = new Circle(topLine.getEndX(), pane.getHeight()/ 6 + radius, radius);//creating cirlce using the hang line as reference point
        c.setFill(Color.TRANSPARENT);
        c.setStroke(Color.BLACK);
        list.add(c);

        double[] p = getPointAtAngle(c, 220);
        Line leftArm = new Line(pane.getWidth() / 2, pane.getHeight() / 2, p[0], p[1]);//creating left arm using degree reference from cirle
        list.add(leftArm);
        p = getPointAtAngle(c, 315);
        Line rightArm = new Line(pane.getWidth() / 1.2, pane.getHeight() / 2, p[0], p[1]);//creating right arm bases on degree reference from cicle        
        list.add(rightArm);

        p = getPointAtAngle(c, 270);
        Line body = new Line(p[0], p[1], p[0], pane.getHeight() / 1.6);//creating line base on angle off cicle
        list.add(body);

        Line leftLeg = new Line(body.getEndX(), body.getEndY(),
                pane.getWidth() / 2, pane.getHeight() / 1.3);//creating line based off body reference
        list.add(leftLeg);

        Line rightLeg = new Line(body.getEndX(), body.getEndY(),
                pane.getWidth() / 1.2, pane.getHeight() / 1.3);//creating line based off body reference
        list.add(rightLeg);


        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);

    }

    private double[] getPointAtAngle(Circle c, double angle) {//angle reference converting radians to degrees
        double x = c.getCenterX() + c.getRadius() * Math.cos(Math.toRadians(angle));
        double y = c.getCenterY() - c.getRadius() * Math.sin(Math.toRadians(angle));

        return new double[]{x, y};
    }


}
