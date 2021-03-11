package projecteuler.task;

import projecteuler.util.calc.Range;
import projecteuler.util.calc.SqrtWhole;
import projecteuler.util.calc.Whole;
import projecteuler.util.collection.Filtered;
import projecteuler.util.collection.FirstOf;
import projecteuler.util.collection.Logged;
import projecteuler.util.predicate.IsDivisorOf;
import projecteuler.util.predicate.IsPrime;

/**
 * @author Vladislav Simanov
 * 11.03.2021
 * <p>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
final public class Task3 {

    public static void main(String[] args) {

        final long target = 600851475143L;

        FirstOf<Long> largestPrimeFactor =

                new FirstOf<>(
                        new Logged<>(
                                new Filtered<>(
                                        new Range(new Whole(2L), new SqrtWhole(target)).reversed(),
                                        new IsDivisorOf(target),
                                        new IsPrime()
                                ),
                                i -> "checking " + i
                        )
                );

        System.out.println(largestPrimeFactor.result().get());

    }

}
