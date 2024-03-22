//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Rectangulo rec1=new Rectangulo(12.1,23.4);
        System.out.printf( "high :..."+ rec1.getAlto()+"   long:..."+ rec1.getLargo());
        System.out.println("     area :...."+rec1.CalcularArea());
        System.out.println("perimeter :..."+rec1.CalcularPerim());
        //instancio rec1

        rec1.setAlto(45.5);
        rec1.setLargo(34.9);

        System.out.printf( "high :..."+ rec1.getAlto()+"   long:..."+ rec1.getLargo());
        System.out.println("     area :...."+rec1.CalcularArea());
        System.out.println("perimeter :..."+rec1.CalcularPerim());
        }
       //verifico datos por defecto

        Rectangulo rec2=new Rectangulo();
        s

}
