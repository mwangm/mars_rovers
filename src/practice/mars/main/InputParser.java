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

    public static String[] verifyRoverInfoInput(String roverInfoString) {
//        Pattern pattern = PattYern.compile("(\\d\\s){2}\\[N,S,W,E]}");
         return roverInfoString.split(" ");
    }

    public static String VerifyCommandInfo(String commandLine) {
        return commandLine;
    }

    public static boolean VerifyPlateauInfoInput(String plateauInfo) {
        return false;  //To change body of created methods use File | Settings | File Templates.
    }
}
