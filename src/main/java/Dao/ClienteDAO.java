
package Dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Cliente;
import model.bo.Endereco;


public class ClienteDAO implements InterfaceDAO<Cliente> {
    
    
        
      /*********   inicio   **********/
    private static ClienteDAO instance;
    protected EntityManager entityManager;
    
    public static ClienteDAO getInstance(){
        if (instance == null) {
            instance = new ClienteDAO();
        }
        
        return instance;
    }

    public ClienteDAO() {
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
    public void create(Cliente objeto) {
        
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
    public List<Cliente> retrieve() {         
       List<Cliente> listaClientes;
       listaClientes = entityManager.createQuery("SELECT c FROM Cliente c LEFT JOIN FETCH c.endereco", Cliente.class).getResultList();
       return listaClientes;
    }
    
    

    @Override
    public Cliente retrieve(int parPK) {
                 
        return entityManager.find(Cliente.class, parPK);
    }

    

    @Override
    public List<Cliente> retrieve(String parString) {
        
        List<Cliente> listaClientes;
        listaClientes = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.nome LIKE :parString", Cliente.class)
                .setParameter("parString", "%" + parString +  "%" ).getResultList();
        
        return listaClientes;
    }


@Override
public void update(Cliente objeto) {
    
    try {
        entityManager.getTransaction().begin();

        // Obtém o cliente do banco de dados
        Cliente cliente = entityManager.find(Cliente.class, objeto.getId());

        // Atualiza os atributos do cliente com base no objeto passado como parâmetro
        cliente.setNome(objeto.getNome());
        cliente.setFone1(objeto.getFone1());
        cliente.setFone2(objeto.getFone2());
        cliente.setEmail(objeto.getEmail());
        cliente.setStatus(objeto.getStatus());
        cliente.setCpf(objeto.getCpf());
        cliente.setRg(objeto.getRg());
        cliente.setMatricula(objeto.getMatricula());
        cliente.setComplementoEndereco(objeto.getComplementoEndereco());

        // Atualiza o endereço associado ao cliente com base no objeto passado como parâmetro
        Endereco endereco = objeto.getEndereco();
        cliente.getEndereco().setCep(endereco.getCep());
        cliente.getEndereco().setLogradouro(endereco.getLogradouro());
        cliente.getEndereco().setCidade(endereco.getCidade());
        cliente.getEndereco().setBairro(endereco.getBairro());

        // Mescla as alterações no cliente
        entityManager.merge(cliente);

        entityManager.getTransaction().commit();

    } catch (Exception ex) {
        ex.printStackTrace();
        entityManager.getTransaction().rollback();
    }
    
}

    
    @Override
    public void delete(Cliente objeto) {
        
        try {
            Cliente cliente = entityManager.find(Cliente.class, objeto.getId());
            entityManager.getTransaction().begin();
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            
        }
    }
    
}
