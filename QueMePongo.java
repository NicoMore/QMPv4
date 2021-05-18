import java.util.ArrayList;
import java.util.Random;

class QueMePongo { 
    ArrayList<Prenda> prendasCreadas = new ArrayList<>(); // Agregar getter de listas de las distintas categorias.
    ArrayList<Uniforme> uniformesSugeridos = new ArrayList<>();
    
    Prenda crearPrenda() {
        Prenda prenda = BuilderPrenda.cargarPrenda();
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