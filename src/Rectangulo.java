public class Rectangulo {
    private double alto =1.0;
    private double largo=1.0;


    public Rectangulo() {

    }
    public Rectangulo(double alto,double largo){
        this.alto=alto;
        this.largo=largo;

    }
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    public double CalcularArea(){ //paso parametros o va bien return alto*largo

        return alto*largo;
    }
    public  double CalcularPerim(){//paso los parametros gracias al setter y al getter

        return 2*( alto + largo );
    }


}

