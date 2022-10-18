package more;

public class Brod {
    String ime;
    int kapacitet;
    Mornar[] mornars;

   private int trenutnibr;

    public Brod(String ime,int kapacitet, Mornar kapetan) {
        mornars=new Mornar[kapacitet];
        this.ime=ime;
        this.kapacitet=kapacitet;
        this.mornars[0]=kapetan;
        trenutnibr=1;
    }
    public void dodajMorn(Mornar m){
        if(mornars[0].dohvatiKvalitet()<m.dohvatiKvalitet()){
            mornars[trenutnibr] = mornars[0];
            mornars[0]=m;
        }
        else{
            mornars[trenutnibr]=m;
        }
        trenutnibr++;
    }

    public int dohvBr() {
        return trenutnibr;
    }

    public Mornar dohvatiKapetana() {
        return mornars[0];
    }
}
