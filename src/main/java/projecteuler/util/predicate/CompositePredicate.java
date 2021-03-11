package projecteuler.util.predicate;

import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
@RequiredArgsConstructor
abstract public class CompositePredicate<T> implements Predicate<T> {

    protected final Collection<Predicate<T>> predicates;

}
