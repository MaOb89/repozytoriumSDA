import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzSpec {
    FizzBuzz fizzBuzz;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public final void before() {
        fizzBuzz= new FizzBuzz();
    }

    @Test

}
