package io.github.evacchi;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class Phase2 {

    @Inject
    SomeRandomData someRandomData;

    @Produces
    public Phase2Result compile(Phase1Result phase1Result) {
        return new Phase2Result(phase1Result, someRandomData);
    }
}
