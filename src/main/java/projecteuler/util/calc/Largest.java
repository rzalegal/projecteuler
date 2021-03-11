package projecteuler.util.calc;

import lombok.RequiredArgsConstructor;
import projecteuler.util.collection.StreamOf;

import java.util.Comparator;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
@RequiredArgsConstructor
public class Largest<T> {

    private final StreamOf<T> stream;
    private final Comparator<T> comparator;

    public T result() {

        return stream
                .stream()
                .max(comparator)
                .orElseThrow();

    }

}
