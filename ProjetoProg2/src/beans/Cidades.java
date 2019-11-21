package beans;

public enum Cidades {
    MANAUS(6,34),RECIFE(17,18),BRASILIA(1,15),SAOPAULO(0,7),PORTOALEGRE(-8,4);

    private int[] par = new int[2];

    Cidades(int x , int y){
        par[0] =x;
        par[1]=y;
    }

    public int[] getCoordenadas(){
        return par;
    }

    public int getX(){
        return par[0];
    }

    public int getY(){
        return par[1];
    }

    public String toString(){
        return "("+par[0]+","+par[1]+")";
    }

}
