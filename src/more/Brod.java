package more;

public class Brod {
    String ime;
    int kapacitet;
    Mornar[] mornars;

    public Brod(String ime,int kapacitet, Mornar mornar) {
        mornars=new Mornar[kapacitet];
        this.ime=ime;
        this.kapacitet=kapacitet;
        this.mornars[0]=mornar;
    }
}
