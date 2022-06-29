package homework6;

public class SimpleBox<T extends Number> {
    private T object;

    public SimpleBox(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public String getType() {
        return object.getClass().getSimpleName();
    }
}
