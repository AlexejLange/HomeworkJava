package homework12.task1;

/**
 * Java Pro. Homework #12
 * @author Alexej Lange
 * @version 30 Jul 2022
 */

import java.util.*;

public class TextProcessing {
    public static void main(String[] args) {

        String text = "Прародителем текста-рыбы является известный 'Lorem Ipsum' —латинский текст," +
                " ноги которого растут до нашей эры. Сервисов по созданию случайного " +
                "текста на основе Lorem Ipsum великое множество, однако все они имеют один существенный" +
                " недостаток: их 'рыба текст' подходит лишь для англоязычных ресурсов и проектов. Мы же," +
                " фактически, предлагаем Lorem Ipsum на русском языке —вы можете использовать полученный" +
                " здесь контент абсолютно бесплатно и в любых целях, не запрещённых законодательством.";

        System.out.println(getUniqueWordList(getWordsArray(text)));
        System.out.println(getWordListAndQuantity(getWordsArray(text)));
    }

    public static String[] getWordsArray(String text) {
        return text.replaceAll("[^ A-Za-zА-Яа-я]", "").toLowerCase().split(" ");
    }

    public static Set<String> getUniqueWordList (String[] wordsArray) {
        return new TreeSet<>(Arrays.asList(wordsArray));
    }

    public static Map<String, Integer> getWordListAndQuantity (String[] wordsArray) {
        Map<String, Integer> wordsMap = new TreeMap<>();
        for (String word : wordsArray) {
            Integer counter = wordsMap.getOrDefault(word, 0);
            wordsMap.put(word, counter + 1);
        }
        return wordsMap;
    }
}
