/**
 * Created by mistrate on 7/10/2016.
 */
public class Verificari {

    public boolean duplicat(Carte c1, Carte c2){
        //return c1.equals(c2);
        if (c1.getAutor().equals(c2.getAutor()) && c1.getTitlu().equals(c2.getTitlu()) ){ return true;}
        else {return false;}
    }

    public Carte verifGrosime(Carte c1, Carte c2){
        if(c1.getNumarPagini() > c2.getNumarPagini()){return c1;}
        else{ return c2; }
    }

}
