package Controle;
import java.util.ArrayList;
import Model.Usuario;

public class cadastroUsuario {
    private ArrayList<Usuario> lista = new ArrayList<>();
    public ArrayList<Usuario> getLista(){
        return lista;
    }
    public boolean addUser(Usuario user){
        boolean retorno = false;
        if(!consultarUser(user)){
            lista.add(user);
            retorno = true;
        }
        return retorno;
    }
    public void showList(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Nome: " + lista.get(i).getNome());
            System.out.println("Senha: " + lista.get(i).getSenha());
            System.out.println("-----------------------------------");
        }
    }
    public ArrayList<String>nomes(){
        ArrayList<String> nomes = new ArrayList<>();
        for(int i = 0; i < lista.size(); i++){
            nomes.add(lista.get(i).getNome());
        }
        return nomes;
}
public boolean consultarUser(Usuario user){
    boolean retorno = false;
    for(int i = 0; i < lista.size(); i++){
        if(lista.get(i).getNome().equals(user.getNome())){
            retorno = true;
        }
    }
    return retorno;
}}

