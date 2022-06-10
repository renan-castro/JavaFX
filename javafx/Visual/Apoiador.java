package Visual;
import java.io.IOException;

import Controle.cadastroUsuario;
import Model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;

public class Apoiador {
    
    private cadastroUsuario controle = new cadastroUsuario();
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button btnCadastro;

    @FXML
    private Button btnVoltar4;

    @FXML
    private PasswordField confirmpassInput;

    @FXML
    private PasswordField passInput;

    @FXML
    private TextField textInput;

    @FXML
    private ChoiceBox<String> choice; 

    @FXML
    void acaoCadastrar(ActionEvent event) {
    if(passInput.getText().equals("") || confirmpassInput.getText().equals("")){
        Alert alerta = new Alert(AlertType.ERROR);
        alerta.setContentText("As senhas não podem ficar em branco.");
        alerta.show();
    }else if(!passInput.getText().equals(confirmpassInput.getText())){
        Alert alerta = new Alert(AlertType.ERROR);
        alerta.setContentText("As senhas estão diferentes.");
        alerta.show();
    }else if(textInput.getText().equals("")){
        Alert alerta = new Alert(AlertType.ERROR);
        alerta.setContentText("O campo de usuário não foi preenchido.");
        alerta.show();
    }else{
        Usuario user = new Usuario();
        user.setNome(textInput.getText());
        user.setSenha(textInput.getText());
    if(controle.addUser(user)){
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setContentText("O usuário foi cadastrado com sucesso.");
        alerta.show();
        choice.getItems().addAll(controle.nomes());
    }else{
        Alert alerta = new Alert(AlertType.ERROR);
        alerta.setContentText("Usuário já foi cadastrado.");
        alerta.show();
            }
        }
    }

    @FXML
     void senha (ActionEvent event){

     }

    @FXML
     void textword(ActionEvent event){

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

