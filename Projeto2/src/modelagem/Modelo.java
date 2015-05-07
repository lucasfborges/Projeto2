/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelagem;
import java.util.*;
import objetos.*;
/**
 *
 * @author Lucas
 */


public class Modelo {
    private List<UserCase> UCs;
    private List<Actor> Actors;
    
    public Modelo()
    {
        UCs = new ArrayList<UserCase>();
        Actors = new ArrayList<Actor>();
    }

    public void setUCs(List<UserCase> UCs) {
        this.UCs = UCs;
    }
    public void addUC(UserCase UC) {
        UCs.add(UC);
    }

    public void setActors(List<Actor> Actors) {
        this.Actors = Actors;
    }
    public void addActor(Actor actor) {
        Actors.add(actor);
    }

    public List<UserCase> getUCs() {
        return UCs;
    }

    public List<Actor> getActors() {
        return Actors;
    }
    
    
}
