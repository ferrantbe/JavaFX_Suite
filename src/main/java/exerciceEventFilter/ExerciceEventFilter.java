package exerciceEventFilter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ExerciceEventFilter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Pane pane = new Pane();

        Rectangle rect = new Rectangle(10, 10, 200, 200);
        rect.setFill(Color.BLUE);
        Circle circ = new Circle(320, 200, 100);
        circ.setStroke(Color.RED);
        pane.getChildren().addAll(rect, circ);

        circ.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent ->  System.out.println("Premier EH sur le cercle."));
        circ.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> System.out.println("Deuxième EH sur le cercle."));
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEvent ->  {
            System.out.println("EF sur le BorderPane.");
            // si je ne veux pas que l'événement soit traité par les EH du cercle...
            mouseEvent.consume();
        });
        root.setCenter(pane);

        Scene scene = new Scene(root, 1200, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Evenements Souris");
        primaryStage.setResizable(true);
        primaryStage.show();

    }

}