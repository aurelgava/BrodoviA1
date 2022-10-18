package more;

public class Brod {
    String ime;
    int kapacitet;
    Mornar[] mornars;

   private int trenutnibr;

    public Brod(String ime,int kapacitet, Mornar mornar) {
        mornars=new Mornar[kapacitet];
        this.ime=ime;
        this.kapacitet=kapacitet;
        this.mornars[0]=mornar;
        trenutnibr=1;
    }
    public void dodajMorn(Mornar m){
        if()
    }

    public int dohvBr() {
        return trenutnibr;

    }
}
