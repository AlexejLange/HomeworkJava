package homework14;

public class ArrayExceptions {
    public static void main(String[] args) {
        String[][] strings = new String[][]{{ "2", "3", "4"}, {"5", "6", "8", "7"},
                {"10", "9", "14", "11"}, {"15", "12", "13", "16"}};
        try {
            System.out.println(sumOfArrayElements(strings));
        } catch (MyArraySizeException e) {
            System.out.println(e);
        }
    }

    public static int sumOfArrayElements (String[][] numbersArray) throws MyArraySizeException {
        if (numbersArray.length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < numbersArray[i].length; j++) {
                sum += Integer.parseInt(numbersArray[i][j]);
            }
        }
        return sum;
    }
}
