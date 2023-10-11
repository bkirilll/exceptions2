import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.*;

public class ArrayModelTest {
    ArrayModel arrayModel = new ArrayModel();

    @Test
    public void sizeInputTest() {
        String input = "4";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        assertThat(ArrayModel.sizeInput()).isEqualTo(4);
    }

    @Test
    public void arraySaveTest() {
        String input = "1\n2\n3\n4\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        int[] array = {1, 2, 3, 4};
        assertThat(ArrayModel.arraySave(4)).isEqualTo(array);
        String input1 = "1\nh\n3\n4\n";
        InputStream inputStream1 = new ByteArrayInputStream(input1.getBytes());
        System.setIn(inputStream1);
        int[] array1 = {1, 0, 3, 4};
        assertThat(ArrayModel.arraySave(4)).isEqualTo(array1);
    }

    @Test
    public void averageNumOfArrayTest() {
        int[] array = {1, 5, 6, 9, 4, 5};
        assertThat(ArrayModel.averageNumOFArray(array)).isEqualTo(5);
    }
    @Test
    public void comparisonAvgTest() {
        assertThat(ArrayModel.comparisonAvg(5.0, 8.0)).isEqualTo("5.0 < 8.0");
        assertThat(ArrayModel.comparisonAvg(5.0, 5.0)).isEqualTo("5.0 = 5.0");
    }

    @Test
    public void integrationArrayModelTest() {
        String inputSize = "4";
        InputStream inputStream1 = new ByteArrayInputStream(inputSize.getBytes());
        System.setIn(inputStream1);
        int size = ArrayModel.sizeInput();
        String inputArray = "4\n3\n5\n9";
        InputStream inputStream2 = new ByteArrayInputStream(inputArray.getBytes());
        System.setIn(inputStream2);
        double avg1 = ArrayModel.averageNumOFArray(ArrayModel.arraySave(size));

        String inputSize2 = "5";
        InputStream inputStream3 = new ByteArrayInputStream(inputSize2.getBytes());
        System.setIn(inputStream3);
        int size1 = ArrayModel.sizeInput();
        String inputArray2 = "8\n3\n5\n9\n4";
        InputStream inputStream4 = new ByteArrayInputStream(inputArray2.getBytes());
        System.setIn(inputStream4);
        double avg2 = ArrayModel.averageNumOFArray(ArrayModel.arraySave(size1));
        assertThat(ArrayModel.comparisonAvg(avg1, avg2)).isEqualTo("5.25 < 5.8");

    }

}
