package homework14;

public class ArrayExceptions {
    public static void main(String[] args) {
        String[][] correctStrings = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "8", "7"},
                {"10", "9", "14", "11"}, {"15", "12", "13", "16"}};
        String[][] sizeErrorStrings = new String[][]{{"1", "2", "4"}, {"5", "6", "8", "7"},
                {"10", "9", "14", "11"}, {"15", "12", "13", "16"}};
        String[][] dataErrorStrings = new String[][]{{"1", "2", "3l", "4"}, {"5", "6", "8", "7"},
                {"10", "9", "14", "11"}, {"15", "12", "13", "16"}};
        try {
            System.out.println(sumOfArrayElements(correctStrings));
            System.out.println(sumOfArrayElements(dataErrorStrings));
            System.out.println(sumOfArrayElements(sizeErrorStrings));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sumOfArrayElements (String[][] numbersArray)
            throws MyArraySizeException, MyArrayDataException {
        if (numbersArray.length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < numbersArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(numbersArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
