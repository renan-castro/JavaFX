package Visual;
import java.io.IOException;
import java.util.ArrayList;

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
    private PasswordField passInput;

    @FXML
    private TextField textInput;

    @FXML
    private ChoiceBox<String> choice; 

    @FXML
    void acaoCadastrar(ActionEvent event) {
    choice.getItems().clear();
    ArrayList<Usuario> gs = controle.getLista();   
    Usuario user = new Usuario();
    if(controle.addUser(user)){
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setContentText(("Usuário cadastrado com sucesso."));
        alerta.show();
    }else if(user.equals(user)){
        Alert alerta = new Alert(AlertType.WARNING);
        alerta.setContentText("Usuário já cadastrado.");
        alerta.show();
    }

    user.setNome(textInput.getText());
    gs.add(user);
    textInput.setText("");
    passInput.setText("");
    String[] nomes = new String[controle.getLista().size()];
    for(int i = 0; i < gs.size(); i++){
        nomes[i] = gs.get(i).getNome();
    }

        int duda = gs.size();
        System.out.println(duda);

        choice.getItems().addAll(nomes);
        choice.setOnAction(this::informacoes);
        
        
    }

        public void informacoes(ActionEvent event){
            textInput.setText(choice.getValue());
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

