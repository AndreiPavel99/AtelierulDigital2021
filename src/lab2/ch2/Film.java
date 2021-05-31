package lab2.ch2;

public class Film {
    private String name;
    private Integer anAparitie;
    private Actor[] actori;

    public Film(String name, Integer anAparitie, Actor[] actori) {
        this.name = name;
        this.anAparitie = anAparitie;
        this.actori = actori;
    }

    public String getName() {
        return name;
    }

    public boolean hasActorAbove50(){
        boolean toReturn = false;

        for(int i = 0; i< actori.length;i++){
            if(actori[i].getVarsta()>50){
                toReturn=true;
            }
        }
        return toReturn;
    }
}
