public class time {
    private int hora;
    private int minutos;
    private int segundos;

    public time(int hora, int minutos, int segundos) {
        this.hora= (hora<=0 && hora>=23)? hora:0;
        this.minutos=(minutos<=0 && minutos>=60)? minutos :0;
        this.segundos=(segundos<=0 && segundos>=60)? segundos :0;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    private void SumaHora(){
     if(this.hora>23){
         this.hora=0;
     }else{
             this.hora ++;
           }
    }
    private void SumaMinutos() {
        if(this.minutos>59){
            this.minutos=0;
            SumaHora();
        }else{
            this.minutos ++;
        }

    }

    public time sumarSeg() {
        if (this.segundos == 59) {
            this.segundos = 0;
            SumaMinutos();
        } else {
            this.segundos++;
        }
        return this.sumarSeg();
    }
    @Override
    public String toString() {
        return "time{" +
                "hora=" + hora +
                ", minutos=" + minutos +
                ", segundos=" + segundos +
                '}';
    }
}
