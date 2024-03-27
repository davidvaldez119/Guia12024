public class Empleado {
    private int dni;
    private String nombreYapellido;
    private  float salario;

    public Empleado(int dni, String nombreYapellido, float salario) {
        this.dni=dni;
        this.nombreYapellido=nombreYapellido;
        this.salario=salario;
    }


    public String getNombreYapellido() {
        return nombreYapellido;
    }
    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }
    public int getDni() {
        return dni;
    }

    public void setDni(int  dni) {
        this.dni = dni;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float aumentaSalario(float porc, float salario){

        return (salario)*(porc)/100 +salario ;
    }
    public  float salarioAnual(float salario){

        return 12*salario;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombreYapellido='" + nombreYapellido + '\'' +
                ", salario=" + salario +
                '}';
    }

}
