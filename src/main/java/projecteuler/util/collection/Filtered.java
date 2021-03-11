package projecteuler.util.collection;

import projecteuler.util.predicate.AllMatch;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
final public class Filtered<T> implements StreamOf<T> {

    private final StreamOf<T> collection;
    private final Predicate<T> predicate;

    public Filtered(StreamOf<T> collection, Predicate<T>... predicates) {
        this.collection = collection;
        this.predicate = new AllMatch<>(predicates);
    }

    @Override
    public Stream<T> stream() {

        return collection
                .stream()
                .filter(predicate);

    }

}
