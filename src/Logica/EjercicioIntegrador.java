package Logica;

public class EjercicioIntegrador {

    public static void main(String[] args) {
      
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu();
        
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidroBomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        pika.atacarAraniazo();
        pika.atacarImpactrueno();
    }
    
}
