package Visual;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

public class Home {
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private MenuBar menubar;

    @FXML
    void btnAPoie(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("apoiador.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnColeta(ActionEvent event) {

    }

    @FXML
    void btnInicio(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("inicio.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnQuem(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("quemSomos.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
     @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        fundo.setImage(new Image("Visual/imagens/fundo.png"));
        
    }

}
