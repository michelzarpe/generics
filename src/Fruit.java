import java.util.Locale;

public class Fruit implements Commons<Fruit> {

    private String cor;

    public Fruit(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public Fruit get(Fruit obj) {
        return obj;
    }

    public String getUpperCaseCollor(){
        return this.cor.toUpperCase(Locale.ROOT);
    }
}
