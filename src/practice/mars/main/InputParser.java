package practice.mars.main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputParser {
    public static List<String> readFile(String filePath) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
            List<String> messageInfo = new ArrayList<String>();
            String oneLineInfo = null;
            while ((oneLineInfo = br.readLine()) != null) {
                messageInfo.add(oneLineInfo);
            }

            return messageInfo;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.print("file don't exit!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String removeRedundantSpace(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    public static String removeAllSpace(String input) {
        return input.replaceAll("\\s+", "");
    }
}
