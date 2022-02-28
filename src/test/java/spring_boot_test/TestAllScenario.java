package spring_boot_test;

// import com.intuit.karate.Results;
// import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;

// import static org.junit.jupiter.api.Assertions.*;
// import org.junit.jupiter.api.Test;

class TestAllScenario {

    // @Test
    // void testAll() {
    // Results results = Runner.path("classpath:spring_boot_test")
    // // .outputCucumberJson(true)
    // .parallel(5);
    // assertEquals(0, results.getFailCount(), results.getErrorMessages());
    // }

    @Karate.Test
    Karate TestAll() {
        return Karate.run().relativeTo(getClass());
    }

}
