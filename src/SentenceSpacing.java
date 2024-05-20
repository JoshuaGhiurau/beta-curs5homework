//ex6
public class SentenceSpacing {
    public static void main(String[] args) {
        String fraza = "Mama are mere.Ea merge cu ele in piata.Acolo le si vinde.Nu prea face bani.Totusi ii face placere.";
        String[] propozitii = splitIntoSentences(fraza);

        for(String propozitie : propozitii){
            System.out.println(propozitie);
        }
    }
    public static String[] splitIntoSentences(String fraza){
        return fraza.split("\\.");
    }
}
