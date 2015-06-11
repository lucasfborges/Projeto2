/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;
import java.util.*;
/**
 *
 * @author Lucas
 */


public class Modelo {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
    
    
    private List<Actor> Actors;
    
    public Modelo()
    {

        Actors = new ArrayList<Actor>();
    }

    public void setActors(List<Actor> Actors) {
        this.Actors = Actors;
    }
    public void addActor(Actor actor) {
        Actors.add(actor);
    }

    public List<Actor> getActors() {
        return Actors;
    }
    
    
}
