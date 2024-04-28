
package service;

import Dao.ItemVendaDAO;
import model.bo.ItemVenda;


public class ItemVendaService {
    
    public static void adicionar(ItemVenda objeto){
        ItemVendaDAO.getInstance().create(objeto);
    }
    
    
}
