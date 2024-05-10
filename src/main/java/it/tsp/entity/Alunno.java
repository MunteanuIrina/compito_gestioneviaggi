package it.tsp.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "alunni")
public class Alunno extends BaseEntity implements Serializable {

@Column(name = "nome_alunno")
  private String nomealunno;
  @Column(name = "cognome_alunno")
  private String cognomealunno;
  @Column(name = "classe_alunno")
  private int classe;
  @Column(name = "sezione_alunno")
  private int sezione;

  
   @Email(message = "la proprietà email non contiene un indirizzo email valido")
  @Column(nullable = false, unique = true, name = "email_alunno")
  private String emailalunno;
  
   

  

    public Alunno(String nomealunno, String cognomealunno,int classe, int sezione,
        @Email(message = "la proprietà email non contiene un indirizzo email valido") String emailalunno) {
      this.nomealunno = nomealunno;
      this.cognomealunno = cognomealunno;
      this.emailalunno = emailalunno;
      this.classe = classe;
      this.sezione = sezione;
    }

   

  

    public String getNomealunno() {
      return nomealunno;
    }

    public void setNomealunno(String nomealunno) {
      this.nomealunno = nomealunno;
    }

    public String getCognomealunno() {
      return cognomealunno;
    }

    public void setCognomealunno(String cognomealunno) {
      this.cognomealunno = cognomealunno;
    }

    public String getEmailalunno() {
      return emailalunno;
    }

    public void setEmailalunno(String emailalunno) {
      this.emailalunno = emailalunno;
    }

    
    public int getClasse() {
      return classe;
    }



    public void setClasse(int classe) {
      this.classe = classe;
    }



    public int getSezione() {
      return sezione;
    }



    public void setSezione(int sezione) {
      this.sezione = sezione;
    }



    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((nomealunno == null) ? 0 : nomealunno.hashCode());
      result = prime * result + ((cognomealunno == null) ? 0 : cognomealunno.hashCode());
      result = prime * result + ((emailalunno == null) ? 0 : emailalunno.hashCode());
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
      Alunno other = (Alunno) obj;
      if (nomealunno == null) {
        if (other.nomealunno != null)
          return false;
      } else if (!nomealunno.equals(other.nomealunno))
        return false;
      if (cognomealunno == null) {
        if (other.cognomealunno != null)
          return false;
      } else if (!cognomealunno.equals(other.cognomealunno))
        return false;
      if (emailalunno == null) {
        if (other.emailalunno != null)
          return false;
      } else if (!emailalunno.equals(other.emailalunno))
        return false;
      return true;
    }



    @Override
    public String toString() {
      return "Alunno [nomealunno=" + nomealunno + ", cognomealunno=" + cognomealunno + ", classe=" + classe
          + ", sezione=" + sezione + ", emailalunno=" + emailalunno + "]";
    }

    

    





}
