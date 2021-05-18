import java.time.LocalDate;
import java.util.HashMap;

class Clima {
    HashMap<String, Object> temperatura;
    float probabilidadDeLluvia;
    String condiciones;
    LocalDate fecha;

    Clima(HashMap<String, Object> temperatura, float probabilidadDeLluvia, String condiciones, LocalDate fecha){
        this.temperatura = temperatura;
        this.probabilidadDeLluvia = probabilidadDeLluvia;
        this.condiciones = condiciones;
        this.fecha = fecha;
    }
}
