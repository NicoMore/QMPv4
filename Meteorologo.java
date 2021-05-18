import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Meteorologo {
    static Servicio servicio;

    Servicio getServicio() {
        return servicio;
    }

    static void setServicio(Servicio unServicio) {
        servicio = unServicio;
    }

    static Clima obtenerClimaActual() {
        return new Clima(servicio.obtenerTemperatura(), servicio.obtenerProbabilidadDeLluvia(), servicio.obtenerCondiciones(), servicio.obtenerFecha());
    }
}