package projecteuler.util.predicate;

import lombok.RequiredArgsConstructor;

import java.util.function.Predicate;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
@RequiredArgsConstructor
final public class IsDivisorOf implements Predicate<Long> {

    private final Long potentiallyDivisibleValue;

    @Override
    public boolean test(Long aLong) {
        return potentiallyDivisibleValue % aLong == 0;
    }
}
