import java.util.ArrayList;
import java.util.Scanner;

enum Categoria { Superior, Inferior, Calzado, Accesorio; }

class BuilderPrenda {
    static ArrayList<String> tiposSuperiores = new ArrayList<>();
    static ArrayList<String> tiposInferiores = new ArrayList<>();
    static ArrayList<String> tiposCalzados = new ArrayList<>();
    static ArrayList<String> tiposAccesorios = new ArrayList<>();

    static Prenda borrador;

    static ArrayList<String> getTiposSuperiores() {
        return tiposSuperiores;
    }

    static ArrayList<String> getTiposInferiores() {
        return tiposInferiores;
    }

    static ArrayList<String> getTiposCalzados() {
        return tiposCalzados;
    }

    static ArrayList<String> getTiposAccesorios() {
        return tiposAccesorios;
    }

    public static Prenda cargarPrenda() {
        Prenda prenda = indicarTipo();
        if (!continuar(prenda)) 
            return borrador;
        prenda.elegirMaterial();
        if (!continuar(prenda)) 
            return borrador;
        prenda.elegirColor();
        if (!continuar(prenda)) 
            return borrador;
        prenda.elegirColorSecundario();

        return prenda;
    }

    Prenda continuarBorrador() {
        Prenda prenda = borrador;
        
        // Identificaria que le falta al borrador para completarlo

        return prenda;
    }

    static Prenda indicarTipo() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indique el tipo de prenda que desea crear:");
        String tipoElegido = scan.nextLine();
        scan.close();

        return identificarTipo(tipoElegido);
    }

    static Prenda identificarTipo(String unTipo) { // Se podria hacer una funcion getter mas sencilla
        try {
            if (getTiposSuperiores().contains(unTipo))
                return new PrendaSuperior(unTipo);
            else if (getTiposInferiores().contains(unTipo))
                return new PrendaInferior(unTipo);
            else if (getTiposCalzados().contains(unTipo))
                return new Calzado(unTipo);
            else if (getTiposAccesorios().contains(unTipo))
                return new Accesorio(unTipo);
        }   
        catch (Exception noSeEncontroTipo) {
            System.out.print("No se indico un tipo correcto");
            // Hacer Prenda fallada
        }
    }

    static boolean continuar(Prenda unaPrenda) {
        System.out.println("Desea continuar?");

        Scanner scan = new Scanner(System.in);

        if (scan.nextLine().startsWith("S")) {
            scan.close(); 
            return true;
        }
        else {
            borrador = unaPrenda;
            scan.close();
            return false;
        }

    }
}

