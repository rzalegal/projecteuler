package projecteuler.util.predicate;

import projecteuler.util.calc.Increment;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
final public class IsPrime implements Predicate<Long> {

    @Override
    public boolean test(Long n) {

        return Stream
                .iterate(2L, new LessThan(n), new Increment())
                .noneMatch(new IsDivisorOf(n));

    }

}
