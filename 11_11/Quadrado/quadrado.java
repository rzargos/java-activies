public class quadrado {
    private double lado;

    public quadrado(){
        lado = 0;
    }

    public void setLado(double l){
        lado = l;
    }
    public double getLado(double lado){
        return(lado);
    }

    public double calcularArea(){
        double a;
        a = lado * lado;
        return(a);
    }
}

