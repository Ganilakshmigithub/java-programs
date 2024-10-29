package com.gani.jpa;

import com.gani.jpa.entities.Employees;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.LockModeType;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();

            // Persisting employees
            em.persist(new Employees("Ganilakshmi", 30000));
            em.persist(new Employees("Abhilash", 50000));
            em.persist(new Employees("Sasi", 35000));
            em.persist(new Employees("Veeramani", 45000));
            em.persist(new Employees("Veerraju", 65000));

            em.getTransaction().commit();
            em.getTransaction().begin();


            // Query q=em.createQuery("update Employees e set e.name=:name where e.salary=:salary");
            // q.setParameter("name","Bhavya");
            // q.setParameter("salary", 35000);
            // int  rowsAffected = q.executeUpdate();
            // System.out.println("records updated  "+rowsAffected);

            Query q=em.createQuery("select e from Employees e where e.name=:name");
            q.setParameter("name", "veeramani");
            Employees emp = (Employees) q.getSingleResult();
            System.out.println("Employee Name: "+emp.getName());

            em.getTransaction().commit();


        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Rollback in case of error
            }
            e.printStackTrace(); // Handle exceptions
        } finally {
            em.close(); // Ensure the EntityManager is closed
            emf.close(); // Ensure the EntityManagerFactory is closed
        }
    }
}
