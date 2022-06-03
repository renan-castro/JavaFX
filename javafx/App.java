import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("primeiratela.fxml"));
        Scene tela = new Scene(root);
        primaryStage.setTitle("Recicle aqui!");
        primaryStage.setScene(tela);
        primaryStage.show();

        Image icon = new Image("recicleAqui.png");
        primaryStage.getIcons().add(icon);
    }
}
