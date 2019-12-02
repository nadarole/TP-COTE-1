package be.ac.umons;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int idChef;
    private List<Worker> listWorker = new ArrayList<Worker>();

    public Team (int idChef, List<Worker> listWorker){
       this.idChef= idChef;
       this.listWorker = listWorker;
    }
    public int getIdChef(){
        return idChef;
    }


}
