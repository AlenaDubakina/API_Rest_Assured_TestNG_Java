package ru.qaway.bookstore.tests.delete;

import org.testng.annotations.Test;
import ru.qaway.bookstore.tests.BookStoreTestBase;

public class DeleteBookNegativeBook extends BookStoreTestBase {
    @Test
    public void testDeleteNotExistedBook() {
        testClient.delete(111111)
                .checkStatusCode(404);
    }
}