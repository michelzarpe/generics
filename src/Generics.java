import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics {

    public static void processElements_UnknownWildcard(List<?> elements){
        for(Object o : elements){
            System.out.println(o);
        }
    }

    public static void processElements_Wildcard(List<? extends Fruit> elements){
        for(Fruit a : elements){
            System.out.println(a.getCor());
        }
    }

    public static void main(String[] args) {
        /* COM GENERICS */
        List<Apple> boxApple = new ArrayList<>();
        Apple apple = boxApple.get(0);

        /* SEM GENERICS */
        List _box = new ArrayList();

        /*
        Se o objeto retornado de boxApple.get(0) não puder
        ser convertido para Apple, só saberemos disso em tempo
        de execução
        */
        Apple _apple = (Apple) _box.get(0);

//-----------------------------------------------------------------------
        List<Orange> boxOrange = new ArrayList<>();
        Orange orange = boxOrange.get(0);
        Fruit fruit = orange;

        List<Fruit> boxFruits = new ArrayList<>();

        boxFruits.addAll(boxOrange);
        boxFruits.add(apple);


        /*
        Erro em tempo de compilação pois
        uma lista de Orange não pode ser atribuido a um
        objeto do tipo Apple. Isso porque ao fazer “boxApple.get(0)”
        estamos retornando um Orange e não um Apple.
        */
        // Apple apple1 = boxOrange.get(0);
//-----------------------------------------------------------------------

        for (Iterator<Orange> obj = boxOrange.iterator(); obj.hasNext();){
            Orange auxOrange = obj.next();
            System.out.printf(">>> "+ obj.hasNext());
        }

        System.out.printf("Executando");

//--------------------------------------------------------------------------

/*
    Enfim, com Wildcards solucionamos este problema. Veja como:

    Existem 3 tipos de Wildcards em Generics:

    Unknown Wildcard, ou seja, Wildcard desconhecido.
    Extends Wildcard
    Super wildcard
*/

        /* Podemos atribuir um list de qualquer tipo a nosso
            método, pois ele tem um tipo desconhecido/genérico */
        List<String> listA = new ArrayList<String>();

        //Unknown Wildcard, ou seja, Wildcard desconhecido.
        processElements_UnknownWildcard(listA);

        /* Podemos agorar passar nossas frutas diversas ao método processElements */
        List<Apple> listApple = new ArrayList<Apple>();
        processElements_Wildcard(listApple);

        List<Orange> listOrange = new ArrayList<Orange>();
        processElements_Wildcard(listOrange);

        List<Orange> listStrawberry = new ArrayList<Orange>();
        processElements_Wildcard(listStrawberry);

        //Super wildcard
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());

        List<Box<Fruit>> f = new ArrayList<>();
        List<Box<Orange>> o = new ArrayList<>();
        Box<Orange> orangeBox = new Box<Orange>();
        Box<Fruit> fruitBox = new Box<Fruit>();

    }
}
