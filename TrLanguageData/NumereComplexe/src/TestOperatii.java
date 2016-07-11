/**
 * Created by mistrate on 7/7/2016.
 */
public class TestOperatii {
    public static void main(String[] args) {
        NumarComplex z1 = new NumarComplex(5,7);
        NumarComplex z2 = new NumarComplex(2,1);
        Operatii o = new Operatii();

        System.out.println("Suma este:" + o.sum(z1,z2).getRe() + " + " + o.sum(z1,z2).getIm() + "i");
        System.out.println("Produsul este:" + o.produs(z1,z2).getRe() + " + " + o.produs(z1,z2).getIm() + "i");


    }
    }
