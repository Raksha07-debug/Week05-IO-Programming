package ReadACsvFileTest;

import com.practice.csvhandling.ReadACsvFile;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReadCsvTest {
    @Test
    public void readAndPrint(){
        String filePath="C:\\Week05\\Day01-IO-Programming\\IO-Programming\\src\\main\\resources\\input.csv";
        String ans="ID-101  Name-Raksha Age-21  Marks-97\nID-102  Name-Savi  Age-20  Marks-80\nID-103  Name-sd  Age-24  Marks-24\nID-104  Name-Naincy  Age-18  Marks-56\n";

        assertEquals(ReadACsvFile.ReadCSV(filePath),ans);
    }

}