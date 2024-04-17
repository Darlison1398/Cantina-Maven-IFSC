
package service;

import Dao.ProdutoDAO;
import java.util.List;
import model.bo.Produto;

public class ProdutoService {
    
     
    public static void adicionar(Produto objeto) {
        ProdutoDAO.getInstance().create(objeto);
    }
    
    public static List<Produto> carregar(){
        return ProdutoDAO.getInstance().retrieve();
    }
    
    public static Produto carregar(int parPK){
        return ProdutoDAO.getInstance().retrieve(parPK);
    }
    
    public static List<Produto> carregar(String parString){
        return ProdutoDAO.getInstance().retrieve(parString);
    }
    
    public static void atualizar(Produto objeto){
        ProdutoDAO.getInstance().update(objeto);
    }
    
    public static void remover(Produto objeto){
        ProdutoDAO.getInstance().delete(objeto);
    }
    public static List<Produto> carregarPorCodigoBarras(String codBarras) {
       ProdutoDAO produtoDAO = new ProdutoDAO();
       return null;
    }

    
}
