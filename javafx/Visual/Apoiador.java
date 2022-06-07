package Visual;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Apoiador {
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button btnCadastro;

    @FXML
    private Button btnVoltar4;

    @FXML
    private PasswordField passInput;

    @FXML
    private TextField textInput;

    @FXML
    void acaoCadastrar(ActionEvent event) {

    }

    @FXML
    void acaoVoltar4(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
