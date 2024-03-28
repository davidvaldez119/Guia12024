public class ItemVenta {
    private int id;
    private String descripcion;
    private int cantidad;

    public ItemVenta(int id, String descripcion,int cantidad,Float presioUnitario ) {
        this.id=id;
        this.descripcion = descripcion;
        this.cantidad=cantidad;
        this.presioUnitario=presioUnitario;
    }
    public Float getPresioUnitario() {
        return presioUnitario;
    }

    public void setPresioUnitario(Float presioUnitario) {
        this.presioUnitario = presioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Float presioUnitario;


    public int getId() {
        return id;
    }

    public double precioTotal(int cant){
        return presioUnitario*cant;
    }
    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", presioUnitario=" + presioUnitario +
                '}';
    }
}
