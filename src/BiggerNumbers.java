import java.util.Arrays;
//ex3
public class BiggerNumbers {
    public static void main(String[] args) {
        int[] numbers = {7, 9, 11, 14, 21, 5, 3, 31, 52, 63, 81, 72};
        int number = 25;
        int[] result = BiggerOne(numbers, number);
        /*
        folosim Arrays.toString(), sa dam convert la array intr-un string, ca sa poata fii efectuata
        comanda sout, ca sa poti sa si vezi Beni ce atent sunt cand imi fac tema<3
         */
        System.out.println("Numbers bigger than " + number + ": " + Arrays.toString(result));
    }
    public static int[] BiggerOne(int[] numbers, int number){
        int[] biggerNumbers = new int[numbers.length];//facem inca un array, pe sa poata fii modificat in functie de cate numere sunt mai mari
        int count = 0;

        for(int numar : numbers){
            if(numar > number){
                biggerNumbers[count] = numar;
                count++;
            }
        }
        int[] result = Arrays.copyOf(biggerNumbers, count);/*folosim comanda Arrays.copyOf(), care copiaza array-ul creat mai sus
         si count care ii modifica indexul in functie de cate numere mai mari avem*/
        return result;
    }
}
