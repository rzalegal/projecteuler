package projecteuler.util.calc;

import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import projecteuler.util.collection.StreamOf;

import java.util.Iterator;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
@RequiredArgsConstructor
public
class Range implements StreamOf<Long>, Iterable<Long> {

    private final Long from;
    private final Long to;

    private final LongPredicate whileTrue;
    private final LongUnaryOperator next;

    public Range(Long from, Long to) {
        this(from, to, i -> i < to, i -> i + 1);
    }


    public Range(Whole from, Whole to) {
        this(from.value(), to.value());
    }


    @Override
    public Stream<Long> stream() {

        return LongStream
                .iterate(from, whileTrue, next)
                .boxed();

    }

    @NotNull
    @Override
    public Iterator<Long> iterator() {
        return stream().iterator();
    }

    public Range reversed() {

        return new Range(to, from, i -> i > from, i -> i - 1);

    }

}
