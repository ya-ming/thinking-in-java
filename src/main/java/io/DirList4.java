package io;

import net.mindview.util.TextFile;

import javax.xml.soap.Text;
import java.io.File;
import java.util.Arrays;

public class DirList4 {
    public static void main(String[] args) {
        String filePath = "D:\\java\\thinking-in-java\\src\\main\\java\\io\\";
        File path = new File(filePath);
        String[] list;
        list = path.list();

        String keyWord = "";
        if (args.length == 1) {
            keyWord = args[0];
        }

        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);

            String dataInFile = TextFile.read(filePath + dirItem);
            if (dataInFile.indexOf(keyWord) != -1) {
                System.out.println("Found " + keyWord + " in " + dirItem);
            }
        }

    }
}
