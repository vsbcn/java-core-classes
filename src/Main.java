import com.ironhack.emplyee.Employee;
import com.ironhack.intern.Intern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Intern [] newIntern = new Intern[10];

        for (int i = 0; i < 10; i++) {
            //Uncomment to get setInternSalary error as condition regarding amount.
            //newIntern[i] = new Intern("Intern","Marketing",20001.0);
            newIntern[i] = new Intern("Intern","Marketing",20000);
        }

        FileWriter fileWriter = new FileWriter("employees.txt");

        for (int i = 0; i < newIntern.length; i++) {
            fileWriter.write(">> Next Intern: " + "\n");
            fileWriter.write("Intern's name = " + newIntern[i].getName()  + "\n");
            fileWriter.write("Intern's position = " + newIntern[i].getPosition() + "\n");
            fileWriter.write("Intern's salary = " + newIntern[i].getSalary()  + "\n");
            fileWriter.write("* * * * * *");
            fileWriter.write("\n");
        }
        fileWriter.close();

    }
}
