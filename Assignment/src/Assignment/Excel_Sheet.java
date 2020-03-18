package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excel_Sheet {

    public Excel_Sheet(){

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sulta\\Desktop\\Semester 2\\Programming\\d18126659\\Assignment\\MLData.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        for (int i = 0; i < records.size(); i++) {
            System.out.println(records.get(i));
        }

    }
}
