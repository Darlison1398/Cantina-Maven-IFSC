
package service;

import Dao.AbrirCaixaDAO;
import java.util.List;
import model.bo.Caixa;
import model.bo.Funcionario;


public class CaixaService {
    
    public static void adicionar(Caixa objeto) {
        AbrirCaixaDAO.getInstance().create(objeto);
    }
    
    
    public static Caixa carregar(int parPK){
        return AbrirCaixaDAO.getInstance().retrieve(parPK);
    }
    
    public static List<Caixa> carregar(){
        return AbrirCaixaDAO.getInstance().retrieve();
        //return null;
    }
    
    public static String nomeFuncionario(String nomeF) {
        return AbrirCaixaDAO.getInstance().retornarFuncionario(nomeF);
    }
    
    public static Funcionario carregarFuncionarioPorCaixaId(int caixaId) {
        return AbrirCaixaDAO.getInstance().retrieveEmployeeByCaixaId(caixaId);
    }
    
    
}
