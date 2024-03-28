public class CuentBancaria {

    private  Integer cbu;
    private  String nombreDeTitular;
    private double balance;


    public CuentBancaria(Integer cbu, String nombreDeTitular, double balance) {
        this. cbu = cbu;
        this.nombreDeTitular=nombreDeTitular;
        this.balance=balance;
    }


    public String getNombreDeTitular() {
        return nombreDeTitular;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNombreDeTitular(String nombreDeTitular) {
        this.nombreDeTitular = nombreDeTitular;
    }


    public double credito (double montoDeposito){

        return balance=balance+montoDeposito;
    }

    public double debito(double montoExtracion){
        if(montoExtracion>balance ){
            System.out.println("saldo insuficiente NO ES POSIBLE LA EXTRACCION...... su saldo actual es de :  ");
        }else{
        balance=balance-montoExtracion;
    }
        return balance;
    }
    @Override
    public String toString() {
        return "CuentBancaria{" +
                "cbu=" + cbu +
                ", nombreDeTitular='" + nombreDeTitular + '\'' +
                ", balance=" + balance +
                '}';
    }
}
