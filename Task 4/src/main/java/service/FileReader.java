package service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<String> readFile(String filepath) {
        List<String> content = new ArrayList<String>();
        try{
            InputStream is = new FileInputStream(filepath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = reader.readLine()) != null) {
                content.add(line);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return content;
    }
}
