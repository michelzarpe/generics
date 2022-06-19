import java.util.List;

public class Orange extends Fruit {

    private long id;
    private String name;

    public Orange(String cor) {
        super(cor);
    }

    public Orange(String cor, long id, String name) {
        super(cor);
        this.id = id;
        this.name = name;
    }

    @Override
    public Fruit get(Fruit obj) {
        return super.get(obj);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
