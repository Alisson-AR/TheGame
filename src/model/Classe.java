package model;

import model.Life;

public class Classe {
    private String name;
    private Life life;

    public Classe(String name, Life life) {
        this.life = life;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}