
package Logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y estoy atacando con Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Charmander y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y estoy atacando con Mordisco");
    }

    @Override
    public void punioFuego() {
        System.out.println("Soy Charmander y este es mi ataque Puño Fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Soy Charmander y este es mi ataque Lanza Llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y este es mi ataque Ascuas");
    }
    
}
