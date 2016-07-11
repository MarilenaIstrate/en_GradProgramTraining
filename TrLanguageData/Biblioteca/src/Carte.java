/**
 * Created by mistrate on 7/10/2016.
 */
public class Carte {
    private String titlu;
    private String autor;
    private String editura;
    private Integer numarPagini;

    public Carte() {}

    public Carte(String titlu, String autor, String editura, Integer numarPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.editura = editura;
        this.numarPagini = numarPagini;
    }

    public void afisare(){
        System.out.println("\nTitul cartii este :" + titlu.toUpperCase());
        System.out.println("\nNumele autorului este :" + autor);
        System.out.println("\nNumele editurii este: " + editura.toLowerCase());

    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public Integer getNumarPagini() {
        return numarPagini;
    }

    public void setNumarPagini(Integer numarPagini) {
        this.numarPagini = numarPagini;
    }
}
