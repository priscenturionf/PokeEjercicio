
package Logica;


public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    
     
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle y estoy atacando con Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Squirtle y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle y estoy atacando con Mordisco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Soy Squirtle y este es mi ataque Hidro Bomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y este es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y este es mi ataque Pistola de Agua");
    }
    
}
