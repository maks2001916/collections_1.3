import java.util.Map;
import java.util.Objects;

public class Collection {
    private Map<String, Integer> collektions;

    public Collection(Map<String, Integer> collekts) {
        this.collektions = collekts;
    }

    public void addCollektion(String key, Integer meaning) throws WrongCollectionException {
        if (collektions.get(key).equals(meaning)) {
            throw new WrongCollectionException("такое значение уже содержится в коллекции");
        } else if (!collektions.get(key).equals(meaning)) {
            collektions.put(key, meaning);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collection that = (Collection) o;
        return Objects.equals(collektions, that.collektions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collektions);
    }

    @Override
    public String toString() {
        return "Collection{" +
                "collekts=" + collektions +
                '}';
    }
}
