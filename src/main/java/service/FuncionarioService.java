
package service;

import Dao.FuncionarioDAO;
import java.util.List;
import model.bo.Funcionario;

public class FuncionarioService {
    
        
    public static void adicionar(Funcionario objeto) {
        FuncionarioDAO.getInstance().create(objeto);
    }
    
    public static List<Funcionario> carregar(){
        return FuncionarioDAO.getInstance().retrieve();
    }
    
    public static Funcionario carregar(int parPK){
        return FuncionarioDAO.getInstance().retrieve(parPK);
    }
    
    public static List<Funcionario> carregar(String parString){
        return  FuncionarioDAO.getInstance().retrieve(parString);
    }
    
    public static void atualizar(Funcionario objeto){
        FuncionarioDAO.getInstance().update(objeto);
    }
    
    public static void remover(Funcionario objeto){
        FuncionarioDAO.getInstance().delete(objeto);
    }
    
}
