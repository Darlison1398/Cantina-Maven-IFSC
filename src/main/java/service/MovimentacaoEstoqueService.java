
package service;

import Dao.MovimentacaoEstoqueDAO;
import model.bo.MovimentacaoEstoque;

public class MovimentacaoEstoqueService {
    
    public static void adicionar(MovimentacaoEstoque objeto) {
        MovimentacaoEstoqueDAO.getInstance().create(objeto);
    }
    
}
