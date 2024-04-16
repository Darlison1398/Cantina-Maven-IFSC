
package service;


import Dao.ClienteDAO;
import java.util.List;
import model.bo.Cliente;

public class ClienteService {
    
    public static void adicionar(Cliente objeto) {
        ClienteDAO.getInstance().create(objeto);
    }
    
    public static List<Cliente> carregar(){
        return ClienteDAO.getInstance().retrieve();
    }
    
    public static Cliente carregar(int parPK){
        return ClienteDAO.getInstance().retrieve(parPK);
    }
    
    public static List<Cliente> carregar(String parString){
        return ClienteDAO.getInstance().retrieve(parString);
    }
    
    public static void atualizar(Cliente objeto){
        ClienteDAO.getInstance().update(objeto);
    }
    
    public static void remover(Cliente objeto){
        ClienteDAO.getInstance().delete(objeto);
    }
    
}
