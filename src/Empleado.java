public class Empleado {
    private String dni;
    private String nombreYapellido;
    private  float salario;

    public String getNombreYapellido() {
        return nombreYapellido;
    }
    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float aumentaSalario(float porc, float salario){

        return (porc*salario)/100;
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
