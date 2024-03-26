
package service;

import Dao.BairroDAO;
import java.util.List;
import model.bo.Bairro;

public class BairroService {
    
    public static void adicionar(Bairro objeto) {
        BairroDAO.getInstance().create(objeto);
    }
    
    public static List<Bairro> carregar(){
        BairroDAO.getInstance().retrieve();
        return null;
    }
    
    public static Bairro carregar(int parPK){
        BairroDAO.getInstance().retrieve(parPK);
        return null;
    }
    
    public static List<Bairro> carregar(String parString){
        BairroDAO.getInstance().retrieve(parString);
        return null;
    }
    
    public static void atualizar(Bairro objeto){
        BairroDAO.getInstance().update(objeto);
    }
    
    public static void remover(Bairro objeto){
        BairroDAO.getInstance().delete(objeto);
    }
    
}
