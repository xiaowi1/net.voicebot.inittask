package net.voicebot.inittask.readers;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JsonReaderTest {

    JsonTestReader jsonReader = new JsonTestReader();
    public final ExpectedException exception = ExpectedException.none();

    @Test()
    public void fileNotFound(){
        exception.expect(NullPointerException.class);
        jsonReader.read("test.json");
    }

    @Test()
    public void readerRunTest(){
        jsonReader.read("employeesTest.json");
    }
}

