package it.tsp;

import it.tsp.boundary.MainFrame;
import it.tsp.control.TuristiService;
import it.tsp.entity.Turisti;

public class App {
    public static void main(String[] args) {
        TuristiService ts = new TuristiService();
        Turisti turista = new Turisti("Qwe","Qwe","1995-07-09","It","qwe@qwe","12345678");
        ts.createTuristi(turista);
        new MainFrame().setVisible(true);
    }
}
