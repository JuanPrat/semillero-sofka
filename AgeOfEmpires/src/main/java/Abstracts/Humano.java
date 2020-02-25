package Abstracts;

public abstract class Humano {
    protected String nombre;
    protected int edad;
    protected int vida;
    protected int ataque;
    protected int defensa;
    protected int inteligencia;

    public Humano(String nombre, int edad, int vida, int ataque, int defensa, int inteligencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.inteligencia = inteligencia;
    }

     abstract void Multiplicarse();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
}
