package Visual;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import modelo.Horario;

public class DiasDeColeta implements Initializable{

    @FXML
    private Button btnVoltar2;

    @FXML
    private TableColumn<Horario, String> quarta;

    @FXML
    private TableColumn<Horario, String> quinta;

    @FXML
    private TableColumn<Horario, String> sabado;

    @FXML
    private TableColumn<Horario, Integer> segunda;

    @FXML
    private TableColumn<Horario, String> sexta;

    @FXML
    private TableView<Horario> tabela;

    @FXML
    private TableColumn<Horario, String> terca;

    @FXML
    void acaoVoltar2(ActionEvent event) {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        segunda.setCellValueFactory(new PropertyValueFactory<>("idade"));
        terca.setCellValueFactory(new PropertyValueFactory<>("nome"));
        quarta.setCellValueFactory(new PropertyValueFactory<>("email"));
        tabela.setItems(listaDeExemplo());
    }
}
