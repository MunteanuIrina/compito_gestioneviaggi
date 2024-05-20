package it.tsp.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "docenti")
public class Docente implements Serializable {

    @Column(name = "nome_doc")
    private String nomedoc;
    @Column(name = "cognome_doc")
    private String cognomedoc;
    @Email(message = "la proprietà email non contiene un indirizzo email valido")
    @Column(nullable = false, unique = true, name = "email")
    private String email;

    public Docente() {
    }

    public Docente(String email, String cognomedoc, String nomedoc) {
        this.email = email;
        this.cognomedoc = cognomedoc;
        this.nomedoc = nomedoc;
    }

    public Docente(@Email(message = "la proprietà email non contiene un indirizzo email valido") String email) {
        this.email = email;
    }

    public String getNomedoc() {
        return nomedoc;
    }

    public void setNomedoc(String nomedoc) {
        this.nomedoc = nomedoc;
    }

    public String getCognomedoc() {
        return cognomedoc;
    }

    public void setCognomedoc(String cognomedoc) {
        this.cognomedoc = cognomedoc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomedoc == null) ? 0 : nomedoc.hashCode());
        result = prime * result + ((cognomedoc == null) ? 0 : cognomedoc.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Docente other = (Docente) obj;
        if (nomedoc == null) {
            if (other.nomedoc != null)
                return false;
        } else if (!nomedoc.equals(other.nomedoc))
            return false;
        if (cognomedoc == null) {
            if (other.cognomedoc != null)
                return false;
        } else if (!cognomedoc.equals(other.cognomedoc))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

}
