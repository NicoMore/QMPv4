import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// import del api de AccuWeather

interface Servicio {
    HashMap<String, Object> obtenerTemperatura();
    float obtenerProbabilidadDeLluvia();
    String obtenerCondiciones();
    LocalDate obtenerFecha();
    LocalDate asLocalDate(String fechaEnOtroFormato);
    HashMap<String, Object> asHashMap(String temperaturaEnOtroFormato);
}

class AccuWeather implements Servicio {

    AccuWeatherAPI api = new AccuWeatherAPI();

    List<Map<String, Object>> condicionesClimaticasBsAs = api.getWeather(“Buenos Aires, Argentina”); // Por 12 horas

    void actualizarCondicionesClimaticasBsAs() {
        condicionesClimaticasBsAs = api.getWeather(“Buenos Aires, Argentina”);
    }

    @Override
    HashMap<String, Object> obtenerTemperatura() {
        return condicionesClimaticasBsAs.get(0).get("Temperature");
    }

    @Override
    float obtenerProbabilidadDeLluvia() {
        return condicionesClimaticasBsAs.get(0).get("PrecipitationProbability");
    } 

    @Override
    String obtenerCondiciones() { 
        return condicionesClimaticasBsAs.get(0).get("IconPhrase");
    }

    @Override
    LocalDate obtenerFecha() {
        String fechaEnDateTime = condicionesClimaticasBsAs.get(0).get("DateTime");
        return asLocalDate(fechaEnDateTime);
    
    }

    @Override
    public LocalDate asLocalDate(String fechaEnOtroFormato) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HashMap<String, Object> asHashMap(String temperaturaEnOtroFormato) {
        // TODO Auto-generated method stub
        return null;
    }
}