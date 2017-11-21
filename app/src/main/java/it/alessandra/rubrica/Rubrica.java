package it.alessandra.rubrica;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by utente7.academy on 20/11/2017.
 */

public class Rubrica {
    List<Persona> contatti;

    public Rubrica(){
        this.contatti = new ArrayList<Persona>();
    }

    public Rubrica(List contatti){
        this.contatti = contatti;
    }

    public List<Persona> getContatti() {
        return contatti;
    }

    public void setContatti(List<Persona> contatti) {
        this.contatti = contatti;
    }

    public void init(){
        Persona p1 = new Persona("Alessio", "Aiello", "3335289674");
        Persona p2 = new Persona("Serena", "Lo Giudice","3478521479");
        Persona p3 = new Persona("Giuseppe", "Giustolisi", "3392031573");
        Persona p4 = new Persona("Mario", "Panettieri", "3392031573");
        Persona p5 = new Persona("Federica", "Raneri", "3392031741");
        Persona p6 = new Persona("Giuseppe", "Rapisarda", "3392336573");
        Persona p7 = new Persona("Alessandra", "Giustolisi", "3358031573");

        contatti.add(p1);

        contatti.add(p2);
        contatti.add(p3);
        contatti.add(p4);
        contatti.add(p5);
        contatti.add(p6);
        contatti.add(p7);
    }
}
