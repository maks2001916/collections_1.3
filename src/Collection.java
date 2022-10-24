import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Collection {
    private Map<String, Integer> collekts;

    public Collection(Map<String, Integer> collekts) {
        this.collekts = collekts;
    }

    public void addCollekts(String key, Integer meaning) {
        if (!collekts.containsKey(key)) {
            collekts.put(key, meaning);
        } else if (collekts.get(key).equals(meaning)) {
            throw new RuntimeException();
        } else if (!collekts.get(key).equals(meaning)) {
            collekts.put(key, meaning);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collection that = (Collection) o;
        return Objects.equals(collekts, that.collekts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collekts);
    }

    @Override
    public String toString() {
        return "Collection{" +
                "collekts=" + collekts +
                '}';
    }
}
