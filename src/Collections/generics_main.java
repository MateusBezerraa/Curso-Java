package Collections;

public class generics_main {
    public static void main(String[] args) {
        
        // usando a classe generica para printar um int
        Generics<Integer> intGenerico = new Generics<>(13);
        intGenerico.printa();

        // usando a classe generica para printar um double
        Generics<Double> doubleGenerico = new Generics<>(87.09);
        doubleGenerico.printa();
    }
}
