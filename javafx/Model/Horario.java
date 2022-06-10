package modelo;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Horario {
    private SimpleIntegerProperty idade;
    private SimpleStringProperty nome;
    private SimpleStringProperty email;

    public Horario(int idade, String nome, String email) {
        this.idade = new SimpleIntegerProperty(idade);
        this.nome = new SimpleStringProperty(nome);
        this.email= new SimpleStringProperty(email);
    }

    public int getIdade(){
        return idade.get();
    }
    public void setIdade(int idade){
        this.idade.set(idade);
    }
    public String getNome(){
        return nome.get();
    }
    public void setNome(String nome){
        this.nome.set(nome);
    }
    public String getEmail(){
        return email.get();
    }
    public void setEmail(String email){
        this.email.set(email);
    }
}
