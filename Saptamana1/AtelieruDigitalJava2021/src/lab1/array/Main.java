package lab1.array;

public class Main {
    public static void main(String[] args){
        System.out.println("it works");
        displayArray();

    }

    public static void displayArray(){
        int a[] = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        for (int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static int[] copyArray(int[] b){
        int[]c = new int[3];
        System.arraycopy(b, 1 , c, 0, 2);
        return c;
    }


}
