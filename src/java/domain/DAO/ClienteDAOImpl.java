/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import domain.models.Cliente;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author edson
 */
public class ClienteDAOImpl extends GenericDAOImpl<Cliente> implements ClienteDAO {

    public ClienteDAOImpl() {
        super();
    }

    public void removeByCpf(String cpf) {
        try {
            entityManager.getTransaction().begin();
            Query q = entityManager.createNativeQuery("DELETE FROM " + Cliente.class.getSimpleName() + " WHERE cpf = '" + cpf + "'");
            q.executeUpdate();
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public Cliente getById(final int id) {
        return entityManager.find(Cliente.class, id);
    }

    public Cliente getByCpf(final String cpf) {
        try {
            return (Cliente) entityManager.createQuery("FROM " + Cliente.class.getName() + " where cpf = '" + cpf + "'").getSingleResult();
        } catch (Exception ex) {
            return null;
        }
    }

    public void remove(Cliente cliente) {
        try {
            entityManager.getTransaction().begin();
            //cliente = entityManager.find(Cliente.class, cliente.getId());
            entityManager.remove(cliente);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

}
