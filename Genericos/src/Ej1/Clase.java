package Ej1;

public class Clase<T> {

private T objeto;

public Clase(T objeto){
    
    this.objeto = objeto;
    
}

public void motrarTipo(){
    
    System.out.println("T es un " + objeto.getClass().getName());
    
}

    
}
