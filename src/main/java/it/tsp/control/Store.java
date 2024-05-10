package it.tsp.control;

import it.tsp.entity.Alunno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Store {


    // private static EntityManagerFactory emf =
    // Persistence.createEntityManagerFactory(Store.JPA_PU);
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(Store.JPA_PU);
    private static EntityManager em = null;

    private static final String JPA_PU = "colloqui";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/payghost";
    private static final String JDBC_USR = "root";
    private static final String JDBC_PWD = "root";


    // costruttore static
    static {
        System.out.println("create entity manager");
        em = emf.createEntityManager();
    }


    public static void beginTran() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'beginTran'");
    }


    public static Alunno saveAlunno(Alunno alunno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAlunno'");
    }


    public static void rollTran() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rollTran'");
    }


    public static void commitTran() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'commitTran'");
    }

}
