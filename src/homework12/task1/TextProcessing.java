package homework12.task1;

import java.util.*;

public class TextProcessing {
    public static void main(String[] args) {

        String text = "Graffiti is a controversial subject. " +
                "In most countries, marking or painting property without permission is " +
                "considered by property owners and civic authorities as defacement and vandalism," +
                " which is a punishable crime, citing the use of graffiti by street gangs to mark " +
                "territory or to serve as an indicator of gang related activities.";
        Set<String> wordsSet = new TreeSet<>(Arrays.asList(getWordsArray(text)));
        System.out.println(wordsSet);

        Map<String, Integer> wordsMap = new TreeMap<>();
        /*for (String word : getWordsArray(text)) {

            if (wordsMap.containsKey(word)) {
                wordsMap.replace(word,);
            }
        }*/
        System.out.println(wordsMap);
    }

    public static String[] getWordsArray(String text) {
        return text.replaceAll("[^ A-Za-zА-Яа-я]", "").toLowerCase().split(" ");
    }

}
