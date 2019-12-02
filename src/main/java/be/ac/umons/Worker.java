package be.ac.umons;

import java.util.ArrayList;
import java.util.List;

public class Worker extends User{
    private boolean dispo = true;
    private List<Skill> listSkill= new ArrayList<Skill>();

    public Worker(String nom, String prenom){
        super(nom,prenom);
    }
    public void addSkill(Skill skill){
        listSkill.add(skill);
    }
    public void setDispo(boolean dispo){
        this.dispo = dispo;
    }
    public boolean getDispo (){
        return dispo;
    }
}
