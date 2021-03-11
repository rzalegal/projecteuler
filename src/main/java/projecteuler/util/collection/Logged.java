package projecteuler.util.collection;

import lombok.RequiredArgsConstructor;
import projecteuler.util.log.ConsoleLog;
import projecteuler.util.log.Log;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
@RequiredArgsConstructor
final public class Logged<T> implements StreamOf<T> {

    private final StreamOf<T> toBeLogged;
    private final Function<T, String> logStringFunction;

    private final Log log;

    public Logged(StreamOf<T> toBeLogged, Function<T, String> logStringFunction) {
        this.toBeLogged = toBeLogged;
        this.logStringFunction = logStringFunction;
        this.log = new ConsoleLog();
    }

    @Override
    public Stream<T> stream() {

        return toBeLogged
                .stream()
                .peek(elem -> log.write(logStringFunction.apply(elem)));

    }
}
