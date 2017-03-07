package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используй наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 Вызвать метод flush().
2.2 Дописать следующий текст «JavaRush © All rights reserved.«, используй метод getBytes().
2.3 Закрыть поток методом close().
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/Users/DDS_TS_2/Desktop/b.txt";
    private FileOutputStream original;
    public AmigoOutputStream(FileOutputStream outputStream) throws FileNotFoundException {
        super(fileName);
        this.original = outputStream;
        }
    public void flush() throws IOException{original.flush();}
    public void write(int b) throws IOException{original.write(b);}
    public void write(byte[] b) throws IOException{original.write(b);}
    public void write(byte[] b, int off, int len) throws IOException{original.write(b,off,len);}

    public void close() throws IOException {
        original.flush();
        String s = "JavaRush © All rights reserved.";
        original.write(s.getBytes());
        original.close();
        }
    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
