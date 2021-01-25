package Lesson6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class startHere {

//    Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
//    Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
//    Написать программу, которая проверяет присутствует ли указанное пользователем слово (или словосочетание, или предложение) в файле. (Работаем только с латиницей)
//    ** Написать метод, проверяющий, есть ли указанное слово в файлах папки

    public static void main(String[] args) {
        try {
            InputStream in;
            OutputStream out;
            FileInputStream fin = new FileInputStream("./src/Lesson6/file1.txt");
            System.out.println(fin.read());
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
