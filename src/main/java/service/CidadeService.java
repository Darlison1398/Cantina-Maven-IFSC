
package service;

//import Dao.BairroDAO;
import Dao.CidadeDAO;
import java.util.List;
import model.bo.Cidade;

public class CidadeService {
    
    public static void adicionar(Cidade objeto) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.create(objeto);
    }
    
    public static List<Cidade> carregar(){
        CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.retrieve();
    }
    
    public static Cidade carregar(int parPK){
        CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.retrieve(parPK);
    }
    
    public static List<Cidade> carregar(String parString){
        CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.retrieve(parString);
    }
    
    
    
    
    
    
    /*  implementei aqui. se não de certo, aapagar        
    public static List<Cidade> carregar(String nomeParametro, String parString){
        CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.retrieve(nomeParametro, parString);
    }*/
    
    
    
    
    
    
    public static void atualizar(Cidade objeto){
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.update(objeto);
    }
    
    public static void remover(Cidade objeto){
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.delete(objeto);
    }
    
}
