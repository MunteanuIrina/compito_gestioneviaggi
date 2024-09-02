package it.tsp.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Store {
    private static final String JPA_PU = "gestioneviaggi";
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory(JPA_PU);
    protected static EntityManager em = emf.createEntityManager();
}
