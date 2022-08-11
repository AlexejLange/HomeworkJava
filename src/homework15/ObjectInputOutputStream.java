package homework15;

import java.io.*;
import java.util.Arrays;

public class ObjectInputOutputStream {
    public static void main(String[] args) {
        byte[] byteCat = null;
        try (ByteArrayOutputStream barrOut = new ByteArrayOutputStream();
             ObjectOutputStream objOut = new ObjectOutputStream(barrOut)) {
            CatSerializable catOut = new CatSerializable("Tom");
            objOut.writeObject(catOut);
            byteCat = barrOut.toByteArray();
            System.out.println("Cat before serializable: " + catOut);
            System.out.println("Cat serializabled: " + Arrays.toString(byteCat));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(byteCat))) {
            CatSerializable catIn = (CatSerializable) objIn.readObject();
            System.out.println("Cat deserializabled: " + catIn);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
