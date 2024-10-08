package it.tsp.control;

import java.util.List;

import it.tsp.entity.Partecipanti;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

public class PartecipantiService {

    // public PartecipantiService(EntityManager em) {
    // this.em = em;
    // }

    public Partecipanti createPartecipanti(Partecipanti partecipanti) {

        EntityTransaction transaction = Store.em.getTransaction();
        Partecipanti saved;
        try {
            transaction.begin();
            saved = Store.em.merge(partecipanti);
            transaction.commit();
            return saved;
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
            throw new RuntimeException("Errore durante la creazione del partecipanti.");
        }
    }

    public Partecipanti getPartecipantiById(int id) {

        Partecipanti partecipanti = Store.em.find(Partecipanti.class, id);

        if (partecipanti != null) {
            printPartecipantiDetails(partecipanti);
        } else {
            System.out.println("Partecipante non trovato con ID: " + id);
        }

        return partecipanti;
    }

    public void getPartecipanti() {

        TypedQuery<Partecipanti> query = Store.em.createQuery("SELECT p FROM Partecipanti p", Partecipanti.class);
        List<Partecipanti> partecipanti = query.getResultList();

        if (!partecipanti.isEmpty()) {
            System.out.println("Elenco dei Partecipanti:");
            for (Partecipanti p : partecipanti) {
                printPartecipantiDetails(p);
            }
        } else {
            System.out.println("Nessun partecipante trovato.");
        }

    }

    public void updatePartecipanti(Partecipanti partecipanti, int id) {

        EntityTransaction transaction = Store.em.getTransaction();

        try {
            transaction.begin();
            Partecipanti p = Store.em.find(Partecipanti.class, id);
            if (p != null) {
                p.setViaggio(partecipanti.getViaggio());
                p.setTurista(partecipanti.getTurista());
                p.setStatoPrenotazione(partecipanti.getStatoPrenotazione());
                Store.em.merge(p);
                transaction.commit();
                System.out.println("Partecipante aggiornato con successo!");
            } else {
                System.out.println("Partecipante non trovato con ID: " + id);
            }
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
            System.out.println("Errore durante l'aggiornamento del partecipante.");
        }
    }

    public void deletePartecipanti(int id) {

        EntityTransaction transaction = Store.em.getTransaction();

        try {
            transaction.begin();
            Partecipanti partecipanti = Store.em.find(Partecipanti.class, id);
            if (partecipanti != null) {
                Store.em.remove(partecipanti);
                transaction.commit();
                System.out.println("Partecipante eliminato con successo!");
            } else {
                System.out.println("Partecipante non trovato con ID: " + id);
            }
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
            System.out.println("Errore durante l'eliminazione del partecipante.");
        }
    }

    public List<Partecipanti> read() {
        List<Partecipanti> partecipante = null;

        try {
            TypedQuery<Partecipanti> query = Store.em.createQuery("SELECT p FROM Partecipanti p", Partecipanti.class);
            partecipante = query.getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return partecipante;
    }

    private void printPartecipantiDetails(Partecipanti p) {
        System.out.println("----------------------------------------------");
        System.out.println("ID Partecipanti: " + p.getIdPartecipanti());
        System.out.println("ID Viaggio: " + p.getViaggio().getIdViaggio());
        System.out.println("ID Turista: " + p.getTurista().getIdTurista());
        System.out.println("Stato Prenotazione: " + p.getStatoPrenotazione());
        System.out.println("----------------------------------------------");
    }
}