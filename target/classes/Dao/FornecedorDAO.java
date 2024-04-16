
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
import model.bo.Fornecedor;


public class FornecedorDAO implements InterfaceDAO<Fornecedor>{
    
    
            
      /*********   inicio   **********/
    private static FornecedorDAO instance;
    protected EntityManager entityManager;
    
    public static FornecedorDAO getInstance(){
        if (instance == null) {
            instance = new FornecedorDAO();
        }
        
        return instance;
    }

    public FornecedorDAO() {
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
    public void create(Fornecedor objeto) {
        
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
    public List<Fornecedor> retrieve() {
        
        List<Fornecedor> listaFronecedores;
       listaFronecedores = entityManager.createQuery("SELECT f FROM Fornecedor f LEFT JOIN FETCH f.endereco", Fornecedor.class).getResultList();
       return listaFronecedores;
    }

    @Override
    public Fornecedor retrieve(int parPK) {
        
        return entityManager.find(Fornecedor.class, parPK);
    }

    @Override
    public List<Fornecedor> retrieve(String parString) {
        
        List<Fornecedor> listaFornecedores;
        listaFornecedores = entityManager.createQuery("SELECT f FROM Fornecedor f WHERE f.nome LIKE :parString", Fornecedor.class)
                .setParameter("parString", "%" + parString +  "%" ).getResultList();
        
        return listaFornecedores;
        
    }

    @Override
    public void update(Fornecedor objeto) {
        
           try {
               entityManager.getTransaction().begin();
               Fornecedor fornecedor = entityManager.find(Fornecedor.class, objeto.getId());

              // Atualiza os atributos do cliente com base no objeto passado como parâmetro
              fornecedor.setNome(objeto.getNome());
              fornecedor.setFone1(objeto.getFone1());
              fornecedor.setFone2(objeto.getFone2());
              fornecedor.setEmail(objeto.getEmail());
              fornecedor.setStatus(objeto.getStatus());
              fornecedor.setCnpj(objeto.getCnpj());
              fornecedor.setInscricaoEstadual(objeto.getInscricaoEstadual());
              fornecedor.setRazaoSocial(objeto.getRazaoSocial());
              fornecedor.setComplementoEndereco(objeto.getComplementoEndereco());

              // Atualiza o endereço associado ao cliente com base no objeto passado como parâmetro
              Endereco endereco = objeto.getEndereco();
              fornecedor.getEndereco().setCep(endereco.getCep());
              fornecedor.getEndereco().setLogradouro(endereco.getLogradouro());
              fornecedor.getEndereco().setCidade(endereco.getCidade());
              fornecedor.getEndereco().setBairro(endereco.getBairro());

              // Mescla as alterações no cliente
              entityManager.merge(fornecedor);

              entityManager.getTransaction().commit();
           } catch (Exception ex) {
               ex.printStackTrace();
               entityManager.getTransaction().rollback();
           }
    }

    
    @Override
    public void delete(Fornecedor objeto) {
        
        try {
            Fornecedor fornecedor = entityManager.find(Fornecedor.class, objeto.getId());
            entityManager.getTransaction().begin();
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            
        }
        
    }

    
}
