package it.tsp.boundary;

import java.math.BigDecimal;
import java.util.Objects;

import it.tsp.control.Store;
import it.tsp.entity.Alunno;

public class Colloqui {

    public static Alunno richiestaColloqui(String nomealunno,String 
    cognomealunno, int classe, int sezione) {

          try {
          

            Store.beginTran();

           Alunno alunno = new Alunno(nomealunno, cognomealunno, classe,sezione);

          Alunno saved = Store.saveAlunno(alunno);

           
           
            Store.commitTran();
            return saved;
            
        } catch (Exception ex) {
            Store.rollTran();
            throw new richiestaColloquiException(ex.getMessage());
        }

    }

}
