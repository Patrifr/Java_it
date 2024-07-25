package SPRINT1.TASCA4.N2.EX1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class MatcherClass<T> extends FeatureMatcher <String, Integer>{

    public MatcherClass(Matcher<? super Integer> subMatcher) {
        super(subMatcher, "See if the String's length equals 8.",
                "Error. The String's length does not equals 8.");
    }

    @Override
    protected Integer featureValueOf(String s) {
        return s.length();
    }
}
