import org.junit.jupiter.api.Test;
import seminars.fourth.book.BookService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class BookServiceTest {

    BookService bookServiceMock = mock(BookService.class);

    @Test
    public void findBookByIdTest() {
        assertThat(bookServiceMock.findBookById("1")).isEqualTo("23");
    }
}
