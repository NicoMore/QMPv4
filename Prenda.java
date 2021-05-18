import java.util.ArrayList;
import java.util.Scanner;

abstract class Prenda {
    String tipo;
    String material;
    String trama;
    String color;
    String colorSecundario;

    void elegirMaterial() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Indique material:");

            this.material = scan.nextLine();

            System.out.println("Desea indicar una trama?");
            if (scan.nextLine().startsWith("S")) {
                System.out.println("Indique trama:");
                this.trama = scan.nextLine();
            } 
            else 
                this.trama = "Lisa";

            scan.close();
        }
        catch (IllegalArgumentException tipoErroneo) {
            System.out.println("Se introdujo un valor de material invalido.");
        }
    }

    void elegirColor() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Indique color:");

            this.color = scan.nextLine();
            scan.close();
        }
        catch (IllegalArgumentException tipoErroneo) {
            System.out.println("Se introdujo un valor de color invalido.");
        } 
    }

    void elegirColorSecundario() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Desea agregar un color secundario?");

        boolean deseaColorSecundario = scan.nextBoolean();
        if (deseaColorSecundario) {
            try {
                System.out.println("Indique color secundario:");

                this.colorSecundario = scan.nextLine();
                scan.close();
            }
            catch (IllegalArgumentException tipoErroneo) {
                System.out.println("Se introdujo un valor de color invalido.");
            }
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