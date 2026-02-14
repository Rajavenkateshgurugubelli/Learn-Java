package testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Module 09: Testing
 * Topic: Mocking with Mockito
 * 
 * Objectives:
 * 1. Create a mock object.
 * 2. Define behavior (stubbing) using when().thenReturn().
 * 3. Verify interactions using verify().
 */
public class Mocking {

    @Test
    void testServiceWithMock() {
        // 1. Create Mock
        Database mockDB = mock(Database.class);

        // 2. Define Behavior (Stubbing)
        // When getData(10) is called, return "Mock Data"
        when(mockDB.getData(10)).thenReturn("Mock Data");

        // 3. Use the Mock
        Service service = new Service(mockDB);
        String result = service.processData(10);

        // 4. Verify
        assertEquals("PROCESSED: MOCK DATA", result);
        verify(mockDB).getData(10); // Verify getData was called with 10
    }
}

// Dependencies
interface Database {
    String getData(int id);
}

class Service {
    private Database db;

    public Service(Database db) {
        this.db = db;
    }

    public String processData(int id) {
        String data = db.getData(id);
        return "PROCESSED: " + data.toUpperCase();
    }
}
