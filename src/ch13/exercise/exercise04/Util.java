package ch13.exercise.exercise04;

public class Util {
    //    public static <K, V> V getValue(Pair<K, V> pair, K k) {
    public static <P extends Pair<K, V>, K, V> V getValue(P pair, K key) {
        return pair.getKey() == key ? pair.getValue() : null;
    }

}
