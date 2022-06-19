import java.util.List;

public class Apple extends Fruit {

    public Apple(String cor) {
        super(cor);
    }

    @Override
    public Fruit getFirst(List<Fruit> list) {
        return super.getFirst(list);
    }

    @Override
    public String getUpperCaseCollor() {
        return super.getUpperCaseCollor().concat("Apple");
    }
}
