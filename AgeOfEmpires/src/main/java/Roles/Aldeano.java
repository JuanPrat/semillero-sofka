package Roles;

import Abstracts.Humano;

public abstract class Aldeano extends Humano implements Interfaces.Aldeano   {

    public Aldeano(String nombre, int edad, int vida, int ataque, int defensa, int inteligencia) {
        super(nombre, edad, vida, ataque, defensa, inteligencia);
    }

    @Override
    public void talar() {

    }

    @Override
    public void cultivar() {

    }

    @Override
    public void construir() {

    }

    @Override
    public void destruir() {

    }

    @Override
    public void minar() {

    }

    @Override
    public void pescar() {

    }

    @Override
    public void cazar() {

    }

    @Override
    public void atacar(){

    }
}