interface Servicio {
    float obtenerTemperatura();
    float obtenerProbabilidadDeLluvia();
    String obtenerCondiciones();
    LocalDate obtenerFecha();
    LocalDate asLocalDate(String fechaEnOtroFormato);
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
        String fechaEnDateTime = condicionesClimaticasBsAs.get(0).get("DateTime");
        return asLocalDate(fechaEnDateTime);
    
    }
}