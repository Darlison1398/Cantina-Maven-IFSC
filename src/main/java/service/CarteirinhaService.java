
package service;

import Dao.CarteirinhaDAO;
import java.util.List;
import model.bo.Carteirinha;

public class CarteirinhaService {
    
    public static void adicionar(Carteirinha objeto) {
        CarteirinhaDAO.getInstance().create(objeto);
    }
    
    public static List<Carteirinha> carregar(){
        return CarteirinhaDAO.getInstance().retrieve();
    }
    
    public static Carteirinha carregar(int parPK){
        return CarteirinhaDAO.getInstance().retrieve(parPK);
    }
    
    public static List<Carteirinha> carregar(String parString){
        return CarteirinhaDAO.getInstance().retrieve(parString);
    }
    
    public static void atualizar(Carteirinha objeto){
        CarteirinhaDAO.getInstance().update(objeto);
    }
    
    public static void remover(Carteirinha objeto){
        CarteirinhaDAO.getInstance().delete(objeto);
    }
    
    public static List<Carteirinha> retrieveByCodBarras(String codBarras){
        return CarteirinhaDAO.getInstance().retrieveByCodBarras(codBarras);
        
    }
    
    
}
