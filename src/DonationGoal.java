import java.util.Random;
//ex4
public class DonationGoal {
    private static double totalDonations = 0;
    private static double donationGoal = 15000;

    public static void main(String[] args) {
        while(totalDonations < donationGoal) {
            donate("Beni are nevoie de bani");
        }
    }
    public static void donate(String organization){
        Random money = new Random();
        double suma = 1 + money.nextDouble() * 15000;

        if(suma < 7999){
            System.out.println("Apreciem intentia, dar cu sumele astea ne simtim jigniti, un pic de respect totusi... Donate at least 8000$");
            return;
        }

        totalDonations += suma;

        System.out.println("Multumim ca sustii problema financiara a lui Beni cu " + suma + "$");

        if(totalDonations >= donationGoal){
            System.out.println("Beni nu mai face foamea<3, cei " + donationGoal + "$ s-au strans");
        } else{
            System.out.println("Il lasati asa pe Beni sa faca FOAMEA?... Inca nu s-au strans cei " + donationGoal + "$");
        }
    }
}
