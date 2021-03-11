package projecteuler.util.predicate;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
final public class AnyMatch<T> extends CompositePredicate<T> {

    public AnyMatch(Collection<Predicate<T>> predicates) {
        super(predicates);
    }

    public AnyMatch(Predicate<T>... predicates) {
        this(Arrays.asList(predicates));
    }

    @Override
    public boolean test(T t) {

        return predicates
                .stream()
                .reduce(x -> false, Predicate::or)
                .test(t);

    }
}
