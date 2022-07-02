package Collections;

public class Generics <T>{
    
    T anyData;

    public Generics(T anyData)
    {
        this.anyData = anyData;
    }

    public void printa()
    {
        System.out.println(anyData);
    }
}
