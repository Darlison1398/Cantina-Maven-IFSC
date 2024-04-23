
package service;

import Dao.CompraDAO;
import java.util.List;
import model.bo.Carteirinha;
import model.bo.Compra;


public class CompraService {
    
    public static Carteirinha dadosCliente (int clienteId){
        return CompraDAO.getInstance().dadosCliente(clienteId);
    }
    
    
    public static void adicionar(Compra objeto) {
        CompraDAO.getInstance().create(objeto);
    }
    
    public static List<Compra> carregar(){
        return CompraDAO.getInstance().retrieve();
    }
    
}
