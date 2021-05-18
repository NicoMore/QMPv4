import java.util.ArrayList;
import java.util.Scanner;

abstract class Prenda {
    String tipo;
    String material;
    String trama;
    String color;
    String colorSecundario;

    void setSiNullMaterial(String material) {
        if (this.material == null) {
            this.material = material;
        }
    }

    void setSiNullColor(String color) {
        if (this.color == null) {
            this.color = color;
        }
    }

    void setSiNullColorSecundario(String colorSecundario) {
        if (this.colorSecundario == null) {
            this.colorSecundario = colorSecundario;
        }
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

class PrendaFallada extends Prenda {
}