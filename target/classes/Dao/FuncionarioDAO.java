
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Endereco;
import model.bo.Funcionario;

public class FuncionarioDAO implements InterfaceDAO<Funcionario> {
    
    
                
      /*********   inicio   **********/
    private static FuncionarioDAO instance;
    protected EntityManager entityManager;
    
    public static FuncionarioDAO getInstance(){
        if (instance == null) {
            instance = new FuncionarioDAO();
        }
        
        return instance;
    }

    public FuncionarioDAO() {
        entityManager = getEntityManager();
    }
    
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu_Cantina");
        
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        
        return entityManager;
    }
    
    
    /*********   fim   **********/
    
    
    
    
    

    @Override
    public void create(Funcionario objeto) {
        
        
        try {
            entityManager.getTransaction().begin();

            Endereco endereco = objeto.getEndereco();
            entityManager.persist(endereco);


            entityManager.persist(objeto);

            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    

    @Override
    public List<Funcionario> retrieve() {
        
        List<Funcionario> listaFuncionario;
        listaFuncionario = entityManager.createQuery("SELECT f FROM Funcionario f LEFT JOIN FETCH f.endereco", Funcionario.class).getResultList();
        return listaFuncionario;
        
    }

    
    
    
    @Override
    public Funcionario retrieve(int parPK) {
        
        return entityManager.find(Funcionario.class, parPK);

    }
    
    
    

    @Override
    public List<Funcionario> retrieve(String parString) {
        List<Funcionario> listaFuncionario;
        listaFuncionario = entityManager.createQuery("SELECT f FROM Funcionario f WHERE f.nome LIKE :parString", Funcionario.class)
                .setParameter("parString", "%" + parString +  "%" ).getResultList();
        
        return listaFuncionario;
    }
    
    
    

 @Override
 public void update(Funcionario objeto) {
        
    try {
        entityManager.getTransaction().begin();

        // Obtém o cliente do banco de dados
        Funcionario funcionario = entityManager.find(Funcionario.class, objeto.getId());

        // Atualiza os atributos do cliente com base no objeto passado como parâmetro
        funcionario.setNome(objeto.getNome());
        funcionario.setFone1(objeto.getFone1());
        funcionario.setFone2(objeto.getFone2());
        funcionario.setEmail(objeto.getEmail());
        funcionario.setStatus(objeto.getStatus());
        funcionario.setCpf(objeto.getCpf());
        funcionario.setRg(objeto.getRg());
        funcionario.setUsuario(objeto.getUsuario());
        funcionario.setSenha(objeto.getSenha());
        funcionario.setComplementoEndereco(objeto.getComplementoEndereco());

        // Atualiza o endereço associado ao cliente com base no objeto passado como parâmetro
        Endereco endereco = objeto.getEndereco();
        funcionario.getEndereco().setCep(endereco.getCep());
        funcionario.getEndereco().setLogradouro(endereco.getLogradouro());
        funcionario.getEndereco().setCidade(endereco.getCidade());
        funcionario.getEndereco().setBairro(endereco.getBairro());

        // Mescla as alterações no cliente
        entityManager.merge(funcionario);

        entityManager.getTransaction().commit();

    } catch (Exception ex) {
        ex.printStackTrace();
        entityManager.getTransaction().rollback();
    }
    
        
}

    
    
    @Override
    public void delete(Funcionario objeto) {
         
        try {
            Funcionario Funcionario = entityManager.find(Funcionario.class, objeto.getId());
            entityManager.getTransaction().begin();
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            
        }
    }

 
    
}
