import java.util.Scanner;




/**
 * Created by mistrate on 7/10/2016.
 */
public class Test {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String titlu = s.nextLine();
        String autor = s.nextLine();
        String editura = s.nextLine();

        Integer numarPagini = new Integer(0);
        do {
           numarPagini = s.nextInt();
           if(numarPagini <= 0 ){
               System.out.println("Introduceti un numar pozitiv:");
           }
        } while(numarPagini <= 0);


        Carte carte = new Carte(titlu, autor, editura, numarPagini);
        Carte carte1 = new Carte("Amintiri din copilarie","Ion Creanga","Humanitas",100);

        Verificari verif = new Verificari();
        boolean test = verif.duplicat(carte,carte1);
        if(test == true){
            System.out.println("Cartea este duplicat");}
        else {System.out.println("Cartea nu este duplicat");}


        verif.verifGrosime(carte,carte1).afisare();

    }
}
