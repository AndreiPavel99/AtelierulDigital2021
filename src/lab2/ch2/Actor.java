package lab2.ch2;

public class Actor {
    public String name;
    public Integer varsta;
    public Premiu[] premii;

    public Actor(String name, Integer varsta, Premiu[] premii) {
        this.name = name;
        this.varsta = varsta;
        this.premii = premii;
    }

    public Actor(String jennifer, int varsta, lab2.ch2.Premiu[] oscars) {
    }

    public String getName() {
        return name;
    }

    public Integer getVarsta() {
        return varsta;
    }
}
