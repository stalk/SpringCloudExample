package org.rinmakh.simple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;

public class Base64Test {

    public static void main(String[] args) throws Exception {
        String base64File = "";
        File file = new File("C:\\test\\test.pdf");
        FileInputStream imageInFile = new FileInputStream(file);

        // Reading a file from file system
        byte fileData[] = new byte[(int) file.length()];
        imageInFile.read(fileData);
        base64File = Base64.getEncoder().encodeToString(fileData);
        System.out.println(base64File);

        File file1 = new File("C:\\test\\test1.pdf");
        FileOutputStream outputStream = new FileOutputStream(file1);
        outputStream.write(Base64.getDecoder().decode(base64File));
        outputStream.flush();
        outputStream.close();
    }
}
