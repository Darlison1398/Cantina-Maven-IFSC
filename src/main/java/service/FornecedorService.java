
package service;

import Dao.FornecedorDAO;
import java.util.List;
import model.bo.Fornecedor;

public class FornecedorService {
    
    public static void adicionar(Fornecedor objeto) {
        FornecedorDAO.getInstance().create(objeto);
    }
    
    public static List<Fornecedor> carregar(){
        return FornecedorDAO.getInstance().retrieve();
    }
    
    public static Fornecedor carregar(int parPK){
        return FornecedorDAO.getInstance().retrieve(parPK);
    }
    
    public static List<Fornecedor> carregar(String parString){
        return FornecedorDAO.getInstance().retrieve(parString);
    }
    
    public static void atualizar(Fornecedor objeto){
        FornecedorDAO.getInstance().update(objeto);
    }
    
    public static void remover(Fornecedor objeto){
        FornecedorDAO.getInstance().delete(objeto);
    }
    
}
