package lab3.singleton;

public class LazyInit {
    static private LazyInit instance;
    private LazyInit(){ }

    static public LazyInit getInstance(){
       if (instance == null){
           instance = new LazyInit();
       }
        return instance;
    }

    public static void main(String[] args) {
        LazyInit li = LazyInit.getInstance();
        System.out.println(li);
    }
}





