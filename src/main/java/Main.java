import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
    String fileName = "data.csv";
    List<Employee> list = parseCSV(columnMapping, fileName);

    public List parseCSV(String[] columnMapping, String fileName) {

        try(CSVReader reader = new CSVReader(new FileReader(fileName));) {
// Массив считанных строк
            String[] nextLine;
// Читаем CSV построчно
            while ((nextLine = reader.readNext()) != null) {
// Работаем с прочитанными данными.
                System.out.println(Arrays.toString(nextLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }

    }
}
