package movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie();
    }

    @Test
    public void should_return_0_when_just_created() {
        assertEquals(Integer.valueOf(0), movie.averageRate());
    }

    @Test
    public void should_return_1_when_1_was_rated() {
        movie.rate(1);
        assertEquals(Integer.valueOf(1), movie.averageRate());
    }

    @Test
    public void should_return_4_when_3_and_5_was_rated() {
        movie.rate(3);
        movie.rate(5);
        assertEquals(Integer.valueOf(4), movie.averageRate());
    }

}
