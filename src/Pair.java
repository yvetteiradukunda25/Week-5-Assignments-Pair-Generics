import java.util.Objects;

public class Pair<K, V>{
    K key;
    V value;
    public Pair(K key, V value){

        //validation: key can not be null.

        if(key == null){
            throw new NullPointerException("key can't be null");
        }

        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // static factory method:
    // Static create() method allows easy and clean creation of Pair objects
    public static <K, V> Pair<K, V> create(K key, V value){
        return new Pair<>(key, value);
    }

    //Returning a string in the format "(Key: [key], Value: [value])"
    @Override
    public String toString() {
        return "(" +
                "key: " + key +
                ", value: " + value +
                ')';
    }

    //this is an implementation for  equals() and hashCode()
    // to compare pairs by both key and value

    @Override
    //equals()
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
    }
    // hashcode()
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
