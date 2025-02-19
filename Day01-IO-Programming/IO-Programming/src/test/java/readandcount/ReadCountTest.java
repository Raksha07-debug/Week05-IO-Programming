package readandcount;

import com.practice.readandcount.ReadAndCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadAndCountCSVTest {
    @Test
    void countRowCSV(){
        String filePath = "C:\\Week05\\Day01-IO-Programming\\IO-Programming\\src\\main\\resources\\readcount.csv";

        int row=1;
        assertEquals(ReadAndCount.countRow(filePath),row);

    }

}