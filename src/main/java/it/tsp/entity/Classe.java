package it.tsp.entity;

import java.io.Serializable;

public class Classe extends BaseEntity implements Serializable {

public Classe(){

}


private String classe;
  private String sezione;
  private String specializzazione;
  private int idalunno;
  private int iddocente;


  
public Classe(String classe, String sezione, String specializzazione, int idalunno, int iddocente) {
    this.classe = classe;
    this.sezione = sezione;
    this.specializzazione = specializzazione;
    this.idalunno = idalunno;
    this.iddocente = iddocente;
}



public String getClasse() {
    return classe;
}



public void setClasse(String classe) {
    this.classe = classe;
}



public String getSezione() {
    return sezione;
}



public void setSezione(String sezione) {
    this.sezione = sezione;
}



public String getSpecializzazione() {
    return specializzazione;
}



public void setSpecializzazione(String specializzazione) {
    this.specializzazione = specializzazione;
}



public int getIdalunno() {
    return idalunno;
}



public void setIdalunno(int idalunno) {
    this.idalunno = idalunno;
}



public int getIddocente() {
    return iddocente;
}



public void setIddocente(int iddocente) {
    this.iddocente = iddocente;
}



@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((classe == null) ? 0 : classe.hashCode());
    result = prime * result + ((sezione == null) ? 0 : sezione.hashCode());
    result = prime * result + ((specializzazione == null) ? 0 : specializzazione.hashCode());
    result = prime * result + idalunno;
    result = prime * result + iddocente;
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
    Classe other = (Classe) obj;
    if (classe == null) {
        if (other.classe != null)
            return false;
    } else if (!classe.equals(other.classe))
        return false;
    if (sezione == null) {
        if (other.sezione != null)
            return false;
    } else if (!sezione.equals(other.sezione))
        return false;
    if (specializzazione == null) {
        if (other.specializzazione != null)
            return false;
    } else if (!specializzazione.equals(other.specializzazione))
        return false;
    if (idalunno != other.idalunno)
        return false;
    if (iddocente != other.iddocente)
        return false;
    return true;
}



@Override
public String toString() {
    return "Classe [classe=" + classe + ", sezione=" + sezione + ", specializzazione=" + specializzazione
            + ", idalunno=" + idalunno + ", iddocente=" + iddocente + "]";
}

  

}
