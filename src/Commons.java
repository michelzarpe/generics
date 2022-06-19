import java.util.List;

public interface Commons<T> {

    T get(T obj);

    default T getFirst(List<T> list) {
        return list.get(0);
    }
}
