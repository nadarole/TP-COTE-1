package be.ac.umons;

public class Skill {
    private String skillName;
    public Skill(String name){
        this.skillName = name;
    }
    public String getSkillNom(){
        return skillName;
    }
    public void setSkillNom(String nom){
        this.skillName = nom;
    }

}
