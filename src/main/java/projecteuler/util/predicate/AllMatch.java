package projecteuler.util.predicate;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 */
final public class AllMatch<T> extends CompositePredicate<T> {

    public AllMatch(Collection<Predicate<T>> predicates) {
        super(predicates);
    }

    public AllMatch(Predicate<T>... predicates) {
        this(Arrays.asList(predicates));
    }

    @Override
    public boolean test(T t) {

        return predicates
                .stream()
                .reduce(x -> true, Predicate::and)
                .test(t);

    }
}
