/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.projetpod.peer3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Laerton
 */
public class Contexto {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAC_PU");
    
    
    public static void perssitPessoa(Pessoa p){
        EntityTransaction transacao = null;
        EntityManager em = emf.createEntityManager();
        try {
            transacao = em.getTransaction();
            transacao.begin();
            em.persist(p);
            transacao.commit();
                    
        } catch (RuntimeException e) 
        {
            if (transacao != null){
                transacao.rollback();
            }
            throw e;
        } finally{
            em.close();
        }
        
    }
}
