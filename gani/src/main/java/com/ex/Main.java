package com.ex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class Main{
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();


            

        em.getTransaction().commit();
    }
}
