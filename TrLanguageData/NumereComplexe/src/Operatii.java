/**
 * Created by mistrate on 7/7/2016.
 */
public class Operatii {
    //Adunare si inmultire numere complexe

    public NumarComplex sum(NumarComplex z1, NumarComplex z2){
        NumarComplex add = new NumarComplex();
        float im, re;

        im = z1.getIm() + z2.getIm();
        re = z1.getRe() + z2.getRe();

        add.setIm(im);
        add.setRe(re);

        return add;
    }

    public NumarComplex produs(NumarComplex z1, NumarComplex z2){
        NumarComplex prod = new NumarComplex();
        float im, re;

        im = z1.getRe()*z2.getIm() + z1.getIm()*z2.getRe();
        re = z1.getRe()*z2.getRe() - z1.getIm()*z2.getIm();

        prod.setIm(im);
        prod.setRe(re);

        return prod;
    }
}
