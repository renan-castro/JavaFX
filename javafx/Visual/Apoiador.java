package Visual;
import java.io.IOException;
import java.util.ArrayList;

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
import javafx.scene.control.ChoiceBox;

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
    private ChoiceBox<String> choice; 

    @FXML
    void acaoCadastrar(ActionEvent event) {
    
    private ArrayList<String> gs = new ArrayList<String>();
    
    String nome = textInput.getText();
    String senha = passInput.getText();
    
    gs.add(nome);
    gs.add(senha);
    textInput.setText("");
    passInput.setText("");

        int duda = gs.size();
        System.out.println(duda);

        choice.getItems().addAll(gs);
        choice.setOnAction(this::setcuplice);
    }

        public void setcuplice(ActionEvent event){
            name.setText(choice.getValue());
        }

    @FXML
     void senha (ActionEvent event){

     }

    @FXML
     void textword(ActionEvent event){

     }

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

