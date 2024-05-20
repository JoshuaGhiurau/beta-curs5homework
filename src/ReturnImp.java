import java.util.Scanner;
//ex2
public class ReturnImp {
    public static void main(String[] args) {
        int[] masini = {2, 7, 4, 1, 6, 8, 11, 15};
        int[] biciclete= {1,1,1,1,1,1,1,1,1,1,};
        System.out.println(OddFinder(masini));
    }
    public static int OddFinder(int[] numereImpare){
        int counter = 0;
        for (int numar : numereImpare){
            if(numar % 2 == 1){
                counter++;
            }
        }
        return counter;
    }
}








