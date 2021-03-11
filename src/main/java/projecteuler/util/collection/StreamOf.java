package projecteuler.util.collection;

import java.util.stream.Stream;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
public interface StreamOf<T> {

    Stream<T> stream();

}
