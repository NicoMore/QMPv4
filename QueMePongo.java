import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class QueMePongo { 
    ArrayList<Prenda> prendasCreadas = new ArrayList<>();
    ArrayList<Uniforme> uniformesSugeridos = new ArrayList<>();
    
    List<Prenda> getPrendasSuperiores() {
        return prendasCreadas.stream().filter(unaPrenda -> unaPrenda.getClass() == PrendaSuperior.class).collect(Collectors.toList());
    }

    List<Prenda> getPrendasInferiores() {
        return prendasCreadas.stream().filter(unaPrenda -> unaPrenda.getClass() == PrendaInferior.class).collect(Collectors.toList());
    }

    List<Prenda> getCalzado() {
        return prendasCreadas.stream().filter(unaPrenda -> unaPrenda.getClass() == Calzado.class).collect(Collectors.toList());
    }

    List<Prenda> getAccesorios() {
        return prendasCreadas.stream().filter(unaPrenda -> unaPrenda.getClass() == Accesorio.class).collect(Collectors.toList());
    }

    Prenda crearPrenda() {
        Prenda prenda = BuilderPrenda.crearPrenda();
        agregarPrenda(prenda);
        
        return prenda;
    }

    void agregarPrenda(Prenda unaPrenda) {
        prendasCreadas.add(unaPrenda);
    }

    Uniforme recibirSugerenciaUniforme() {
        return uniformesSugeridos.get(new Random().nextInt(uniformesSugeridos.size()));
    }

    void agregarUniforme(Uniforme unUniforme) {
        uniformesSugeridos.add(unUniforme);
    }
}