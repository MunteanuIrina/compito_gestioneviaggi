package it.tsp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "partecipanti")
public class Partecipanti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_partecipanti")
    private int idPartecipanti;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_viaggio", nullable = false)
    private Viaggi viaggio;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_turista", nullable = false)
    private Turisti turista;

    public enum StatoPrenotazione {
        CONFIRMATO,
        CANCELLATO,
        PENDENTE
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "stato_prenotazione")
    private StatoPrenotazione statoPrenotazione = StatoPrenotazione.PENDENTE;

    public Partecipanti() {
    }

    public Partecipanti(Viaggi viaggio, Turisti turista, StatoPrenotazione statoPrenotazione) {
        this.viaggio = viaggio;
        this.turista = turista;
        this.statoPrenotazione = statoPrenotazione;
    }

    public int getIdPartecipanti() {
        return idPartecipanti;
    }

    public void setIdPartecipanti(int idPartecipanti) {
        this.idPartecipanti = idPartecipanti;
    }

    public Viaggi getViaggio() {
        return viaggio;
    }

    public void setViaggio(Viaggi viaggio) {
        this.viaggio = viaggio;
    }

    public Turisti getTurista() {
        return turista;
    }

    public void setTurista(Turisti turista) {
        this.turista = turista;
    }

    public StatoPrenotazione getStatoPrenotazione() {
        return statoPrenotazione;
    }

    public void setStatoPrenotazione(StatoPrenotazione statoPrenotazione) {
        this.statoPrenotazione = statoPrenotazione;
    }

}

