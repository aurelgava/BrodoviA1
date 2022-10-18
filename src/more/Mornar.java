package more;

public class Mornar {
    private int kvalitet;
    public String s;
    public void setKvalitet(int kvalitet){
        if(kvalitet<0){
            this.kvalitet=0;
        }else if(kvalitet>100){
            this.kvalitet=100;
        }
        else {
            this.kvalitet=kvalitet;
        }

    }
    public Mornar (String a, int k){
        kvalitet=k;
        s=a;
    }
    @Override
    public String toString(){
        return"M_"+s+" : "+ kvalitet;
    }
}
