package com.example.calculadora;

public class Calculadora {

    double numA;
    double numB;
    double resultado;

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }
    public double getNumA(){
        return numA;
    }

    public double getNumB(){
        return numB;
    }

    public double Sumar(){
        resultado= getNumA()+getNumB();
        return resultado;
    }

    public double Restar(){
        resultado=  getNumA()-getNumB();
        return resultado;
    }

    public double Multiplicar(){
        resultado= getNumA()*getNumB();
        return resultado;
    }
    public double Dividir(){
        resultado= getNumA()/getNumB();
        return resultado;
    }
}
