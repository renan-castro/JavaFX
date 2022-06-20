package Visual;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.Node;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import Model.Horario;


public class diasColeta implements Initializable{
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button btnVoltar2;

    @FXML
    private TableColumn<Horario, String> quarta;

    @FXML
    private TableColumn<Horario, String> quinta;

    @FXML
    private TableColumn<Horario, String> sabado;

    @FXML
    private TableColumn<Horario, String> segunda;

    @FXML
    private TableColumn<Horario, String> sexta;

    @FXML
    private TableView<Horario> tabela;

    @FXML
    private TableColumn<Horario, String> terca;

    @FXML
    void acaoVoltar2(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        segunda.setCellValueFactory(new PropertyValueFactory<>("segunda"));
        terca.setCellValueFactory(new PropertyValueFactory<>("terca"));
        quarta.setCellValueFactory(new PropertyValueFactory<>("quarta"));
        quinta.setCellValueFactory(new PropertyValueFactory<>("quinta"));
        sexta.setCellValueFactory(new PropertyValueFactory<>("sexta"));
        sabado.setCellValueFactory(new PropertyValueFactory<>("sabado"));
        tabela.setItems(criarLista());
        
    }
    private ObservableList<Horario> criarLista(){
        return FXCollections.observableArrayList(
            new Horario(null, "  06:20", null, "  6:20", null,"  6:20"),
            new Horario(null, "     |", null, "     |",null, "     |"),
            new Horario(null,   "     |", null,"     |", null,"     |"),
            new Horario(null, "     |", null, "     |", null,"     |"),
            new Horario(null, "  19:00", null, "  19:00", null,"  19:00")  
        );
    }
}
