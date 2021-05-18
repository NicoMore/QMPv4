import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Meteorologo {
    Servicio servicio;

    Servicio getServicio() {
        return servicio;
    }

    void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    static Clima obtenerClima(LocalDate fecha) {
        return new Clima();
    }
}

interface Servicio {
    float obtenerTemperatura();
    float obtenerProbabilidadDeLluvia();
    String obtenerCondiciones();
    LocalDate obtenerFecha();
}

class AccuWeather implements Servicio {

    AccuWeatherAPI api = new AccuWeatherAPI();

    List<Map<String, Object>> condicionesClimaticasBsAs = api.getWeather(“Buenos Aires, Argentina”); // Por 12 horas

    void actualizarCondicionesClimaticasBsAs() {
        condicionesClimaticasBsAs = api.getWeather(“Buenos Aires, Argentina”);
    }

    HashMap<String, Object> obtenerTemperatura(){
        return condicionesClimaticasBsAs.get(0).get("Temperature");
    }

    float obtenerProbabilidadDeLluvia() {
        return condicionesClimaticasBsAs.get(0).get("PrecipitationProbability");
    } 

    String obtenerCondiciones() { 
        return condicionesClimaticasBsAs.get(0).get("IconPhrase");
    }

    LocalDate obtenerFecha() {

    }

}