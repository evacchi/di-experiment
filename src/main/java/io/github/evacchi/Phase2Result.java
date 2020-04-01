package io.github.evacchi;

import javax.inject.Inject;

public class Phase2Result {

    public final Phase1Result producedValue;

    public Phase2Result(Phase1Result producedValue, SomeRandomData someRandomData) {
        this.producedValue = producedValue;
    }
}
