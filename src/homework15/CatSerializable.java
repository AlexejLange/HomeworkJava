package homework15;

import java.io.Serializable;

public class CatSerializable implements Serializable {
    private String name;

    public CatSerializable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" + "name= " + name + "}";
    }
}
