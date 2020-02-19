import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class bla extends Application {

    Scene scene1,scene2;

    @Override
    public void start(Stage stage) throws Exception {

        VBox vb = new VBox(10);
        stage.setTitle("My First JavaFX App");
        String version = System.getProperty("javafx.version");
        Button button1 = new Button("Don't touch me");
        Label label1 = new Label("Hello World, JavaFX: " + version + "!");
        vb.setPadding(new Insets(10, 50, 50, 50));
        button1.setOnAction(e -> {
            stage.setScene(scene2);
        });
        vb.getChildren().addAll(label1,button1);
        scene1 = new Scene(vb,300,300);

        HBox hb=new HBox(10);
        Button button2 = new Button("Tilbage");
        Label label2=new Label("fuck af din hund B=> !!!");
        hb.getChildren().addAll(label2,button2);
        button2.setOnAction(e -> {
            stage.setScene(scene1);
        });
        scene2 = new Scene(hb,400,400);
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
