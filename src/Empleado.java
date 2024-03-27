public class Empleado {
<<<<<<< HEAD
    private int dni;
    private String nombreYapellido;
    private  float salario;

    public Empleado(int dni, String nombreYapellido, float salario) {
        this.dni=dni;
        this.nombreYapellido=nombreYapellido;
        this.salario=salario;
    }


=======
    private String dni;
    private String nombreYapellido;
    private  float salario;

>>>>>>> origin/master
    public String getNombreYapellido() {
        return nombreYapellido;
    }
    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }
<<<<<<< HEAD
    public int getDni() {
        return dni;
    }

    public void setDni(int  dni) {
=======
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
>>>>>>> origin/master
        this.dni = dni;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float aumentaSalario(float porc, float salario){

<<<<<<< HEAD
        return (salario)*(porc)/100 +salario ;
    }
    public  float salarioAnual(float salario){

        return 12*salario;
    }
=======
        return (porc*salario)/100;
    }

>>>>>>> origin/master
    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombreYapellido='" + nombreYapellido + '\'' +
                ", salario=" + salario +
                '}';
    }
<<<<<<< HEAD

=======
>>>>>>> origin/master
}
