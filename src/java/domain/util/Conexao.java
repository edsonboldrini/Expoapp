/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author yagoz
 */
public class Conexao {
    public static EntityManager entityManager;


    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("expoApp");
            entityManager = factory.createEntityManager();
        }
        
        return entityManager;
    }
public static void close(){
            entityManager.close();
        }
}
