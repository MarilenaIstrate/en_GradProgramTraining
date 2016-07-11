/**
 * Created by mistrate on 7/7/2016.
 */
public class NumarComplex {
    private float re;
    private float im;

    public NumarComplex(){
        re = 0;
        im = 0;
    }

    public  NumarComplex(float re, float im){
        this.re = re;
        this.im = im;
    }

    public float getRe() {
        return re;
    }

    public void setRe(float re) {
        this.re = re;
    }

    public float getIm() {
        return im;
    }

    public void setIm(float im) {
        this.im = im;
    }
}

