package net.voicebot.inittask.readers;

import net.voicebot.inittask.employee.Employee;

import java.util.List;

public interface Reader {
    List<Employee> read(String pathToFile);
}
