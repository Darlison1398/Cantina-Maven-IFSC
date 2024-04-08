
package service;

import Dao.EnderecoDAO;
import java.util.List;
import model.bo.Endereco;

public class EnderecoService {
    
    public static void adicionar(Endereco objeto){
        EnderecoDAO.getInstance().create(objeto);
    }
    
    public static List<Endereco> carregar(){
        return EnderecoDAO.getInstance().retrieve();
    }
    
    public static Endereco carregar(int parPK){
        return EnderecoDAO.getInstance().retrieve(parPK);
    }
    
    public static List<Endereco> carregar(String parString){
        return EnderecoDAO.getInstance().retrieve(parString);
    }
    
    public static void atualizar(Endereco objeto){
        EnderecoDAO.getInstance().update(objeto);
    }
    
    public static void remover(Endereco objeto){
        EnderecoDAO.getInstance().delete(objeto);
    }
    
}
