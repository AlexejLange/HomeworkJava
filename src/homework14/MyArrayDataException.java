package homework14;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int column) {
        super(String.format("Data in the %dth row and %dth column cannot be converted.", row + 1, column + 1));
    }
}
