package io.github.evacchi;

import javax.enterprise.inject.Produces;

public class Phase1 {
    @Produces
    public Phase1Result compile(){
        return new Phase1Result("hello world");
    }
}
