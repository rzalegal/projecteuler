package projecteuler.util.collection;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
@RequiredArgsConstructor
final public class FirstOf<T> {

    private final StreamOf<T> stream;

    public Optional<T> result() {
        return stream
                .stream()
                .findFirst();
    }

}
