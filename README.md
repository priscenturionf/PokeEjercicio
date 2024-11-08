# Pokémon Game: Clases Abstractas e Interfaces

Este proyecto simula un sistema de ataque para Pokémon en un videojuego, usando clases abstractas e interfaces. Se implementan ataques comunes y ataques específicos para los tipos de Pokémon, respetando las características de cada uno.

## Descripción del Proyecto

Un fanático de Pokémon desea modelar los ataques de varias criaturas en su videojuego. Para esto, ha creado una estructura basada en:
- **Una clase abstracta `Pokemon`** que contiene los atributos básicos y métodos comunes de ataque.
- **Interfaces para los tipos de Pokémon**, cada una con métodos específicos de ataque según el tipo: Eléctrico, Planta, Fuego y Agua.

## Estructura de Clases

### Clase Abstracta `Pokemon`

La clase abstracta `Pokemon` tiene los siguientes atributos:
- `num_pokedex`: Número en la Pokédex.
- `nombrePokemon`: Nombre del Pokémon.
- `pesoPokemon`: Peso del Pokémon.
- `sexo`: Sexo del Pokémon.
- `temporadaQueAparece`: Temporada en la que el Pokémon aparece.
- `tipo`: Tipo de Pokémon (agua, fuego, planta, eléctrico, etc.).

#### Métodos Comunes
Todos los Pokémon pueden realizar los siguientes ataques comunes:
- `atacarPlacaje()`
- `atacarArañazo()`
- `atacarMordisco()`

### Interfaces de Tipos de Pokémon

Cada interfaz contiene los métodos específicos de ataque para un tipo de Pokémon:

- **`IElectrico`**
  - `atacarImpactrueno()`
  - `atacarPunioTrueno()`

- **`IPlanta`**
  - `atacarParalizar()`
  - `atacarDrenaje()`

- **`IFuego`**
  - `atacarPunioFuego()`
  - `atacarAscuas()`
  - `atacarLanzallamas()`

- **`IAgua`**
  - `atacarHidrobomba()`
  - `atacarPistolaAgua()`
  - `atacarBurbuja()`

## Clases de Pokémon

A partir de estas interfaces, se crean clases específicas para cada uno de los Pokémon starters de la primera temporada y para Pikachu:

- **Charmander** (tipo Fuego)
- **Bulbasaur** (tipo Planta)
- **Squirtle** (tipo Agua)
- **Pikachu** (tipo Eléctrico)

### Implementación de los Métodos de Ataque

Cada clase de Pokémon sobrescribe los métodos correspondientes para adaptarlos a su tipo, mostrando un mensaje en pantalla que indica el Pokémon y el ataque que realiza. Por ejemplo:
- `"Soy Charmander y estoy atacando con Ascuas"`
- `"Soy Pikachu y estoy atacando con placaje"`

## Ejemplo de Uso

A continuación, se muestran ejemplos de instancias de cada Pokémon y cómo llamar a sus métodos de ataque:

```java
// Ejemplo de instancias de los Pokémon
Charmander charmander = new Charmander();
Bulbasaur bulbasaur = new Bulbasaur();
Squirtle squirtle = new Squirtle();
Pikachu pikachu = new Pikachu();

// Llamada a métodos de ataque
charmander.atacarAscuas();
bulbasaur.atacarLatigoCepa();
squirtle.atacarHidrobomba();
pikachu.atacarImpactrueno();

