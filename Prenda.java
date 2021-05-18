import java.util.ArrayList;
import java.util.Scanner;

abstract class Prenda {
    String tipo;
    String material;
    String trama;
    String color;
    String colorSecundario;

    void setSiNullTipo(String tipo) {

    }

    void setSiNullMaterial(String material) {

    }

    void setSiNullColor(String color) {

    }

    void setSiNullColorSecundario(String colorSecundario) {

    }

}

class PrendaSuperior extends Prenda {
    PrendaSuperior(String tipo) {
        this.tipo = tipo;
    }
}

class PrendaInferior extends Prenda {
    PrendaInferior(String tipo) {
        this.tipo = tipo;
    }
}

class Calzado extends Prenda {
    Calzado(String tipo) {
        this.tipo = tipo;
    }
}

class Accesorio extends Prenda {
    Accesorio(String tipo) {
    this.tipo = tipo;
}
}