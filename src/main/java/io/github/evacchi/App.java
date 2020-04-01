package io.github.evacchi;

import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Hello world!
 */
public class App {

    @Inject
    Phase2Result myClass;

    void run() {
        System.out.println(myClass.producedValue.s);
    }

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        App application = container.select(App.class).get();
        application.run();
        weld.shutdown();
    }
}
