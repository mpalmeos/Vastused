package JavaFX;

/**
 * Created by Maie on 18/01/2017.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane aken = new Pane();
        Scene stseen = new Scene(aken, 500, 500);

        Circle ring1 = new Circle(240, 450, 28);
        ring1.setFill(Color.WHITE);
        Circle ring2 = new Circle(410, 259, 19);
        ring2.setFill(Color.WHITE);
        Circle ring3 = new Circle(320, 378, 30);
        ring3.setFill(Color.WHITE);

        aken.getChildren().addAll(ring1, ring2, ring3);
        primaryStage.setScene(stseen);
        primaryStage.show();

        ring1.setOnMouseClicked(event -> {
            ring1.setFill(Color.GREEN);
            System.out.println("KLICK");
        });

        ring2.setOnMouseClicked(event -> {
            ring2.setFill(Color.GREEN);
            System.out.println("KLICK");
        });

        ring2.setOnMouseClicked(event -> {
            ring2.setFill(Color.GREEN);
            System.out.println("KLICK");
        });
    }
}
