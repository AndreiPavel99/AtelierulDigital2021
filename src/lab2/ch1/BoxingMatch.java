package lab2.ch1;

public class BoxingMatch {

    private Fighter f1;
    private Fighter f2;

    BoxingMatch(Fighter f1, Fighter f2){
        this.f1=f1;
        this.f2=f2;

    }


    public String fight(){
        String winner="";

        while (f1.getHealth()>0 && f2.getHealth()>0){
            f1.attack(f2);
            if(f2.getHealth()<=0){
                winner = f1.getName();
                return winner;

            }
            f2.attack(f1);
            if(f1.getHealth()<=0){
                winner = f2.getName();
                return winner;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        Fighter f1 = new Fighter("F1", 100, 10);
        Fighter f2 = new Fighter("F2",100,10);
        BoxingMatch boxingMatch = new BoxingMatch(f1,f2);
        String winner = boxingMatch.fight();
        System.out.println("winner = " + winner);
    }

}
