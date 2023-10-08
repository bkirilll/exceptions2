import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;
import static org.assertj.core.api.Assertions.*;

public class MainHwTest {

    MainHW mainHW = new MainHW();

    @Test
    public void isEvenNumberTest() {
        assertThat(mainHW.isEvenNumber(4)).isEqualTo(true);
        assertThat(mainHW.isEvenNumber(5)).isEqualTo(false);
    }

    @Test
    public void isEnterInIntervalsTest() {
        assertThat(mainHW.isEnterInIntervals(70)).isEqualTo(true);
        assertThat(mainHW.isEnterInIntervals(100)).isEqualTo(false);
        assertThat(mainHW.isEnterInIntervals(25)).isEqualTo(false);
    }

}

