//# Enunciado
//
//Se desea desarrollar un programa para gestionar los instrumentos musicales de un grupo.
//
//Existen tres tipos de instrumentos:
//
//- Instrumentos de viento.
//- Instrumentos de cuerda.
//- Instrumentos de percusión.
//
//Todos los instrumentos comparten las siguientes características:
//
//- Un nombre.
//- Un precio.
//
//Además, todos pueden tocarse, aunque cada tipo de instrumento lo hace de una manera diferente.
//
//---
//
//# Desarrollo del ejercicio
//
//## 1. Clase abstracta Instrument
//
//Se crea una clase abstracta llamada **Instrument**.
//
//Esta clase representa la información común de todos los instrumentos y contiene:
//
//- Nombre.
//- Precio.
//
//También declara un método llamado **play()**, que es abstracto. Esto significa que no tiene implementación y obliga a todas las clases hijas a definir su propio comportamiento.
//
//---


package HerenciaYPolimorfismo;

public abstract class Instrument {
    protected String name;
    protected double price;

    static {
        System.out.println("La clase Instrument ha sido cargada.");

    }
    // Bloque de inicialización
    {
        System.out.println("se ha creado un instrumento.");
    }
    //constructor
    public Instrument(String name, double price){
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public abstract void play();
    public static void showClassInfo() {
        System.out.println("Método estático de la clase Instrument.");
    }
}




