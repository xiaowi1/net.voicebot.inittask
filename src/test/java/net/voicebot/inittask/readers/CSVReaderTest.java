package net.voicebot.inittask.readers;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.io.FileNotFoundException;


public class CSVReaderTest {

    CSVReader csvReader = new CSVReader();
    public final ExpectedException exception = ExpectedException.none();

    @Test()
    public void fileNotFound(){
        exception.expect(FileNotFoundException.class);
        csvReader.read("randomPath");
    }


}
