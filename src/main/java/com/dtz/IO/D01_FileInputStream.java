package com.dtz.IO;

import java.io.*;

public class D01_FileInputStream {
    public static void main(String[] args) throws IOException {
//        fileInputStream();
//        fileReader();
//        lineNumberReader();
//        printStream();
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println(97);
        pw.write(97);
        pw.close();
    }

    public static void printStream() {
        PrintStream ps = System.out;
        ps.println("1" + 97);
        ps.write(97);
        ps.close();
    }

    public static void lineNumberReader() throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("a.txt"));
        lnr.setLineNumber(23);
        String line;
        while ((line = lnr.readLine()) != null) {
            System.out.println(lnr.getLineNumber() + line);
        }
        lnr.close();
    }

    public static void fileReader() throws IOException {
        try (FileReader fr = new FileReader("src/main/resources/applicationContext.xml");
             FileWriter fw = new FileWriter("b.txt");) {
            int b;
            while ((b = fr.read()) != -1) {
                fw.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void fileInputStream() {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/applicationContext.xml");
            FileOutputStream fos = new FileOutputStream("a.txt");
            byte[] arr = new byte[1024];
            int b = 0;
            while ((b = fis.read(arr)) != -1) {
                fos.write(arr, 0, b);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
