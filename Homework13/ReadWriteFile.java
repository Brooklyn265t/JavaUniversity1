package Mirea.Homework13;

import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args) {
        try (
                Reader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
            ) { 
            // Первичная запись
            String text = bufferedReader.readLine();
            FileWriter writer = new FileWriter("src\\main\\java\\ru\\mirea\\lab9\\ReadAndWriteFile.txt", false);
            writer.write(text);
            writer.flush();
            writer.close();
            
            //счиитать данные из файла
            FileWriter ReadWriter = new FileWriter("src\\main\\java\\ru\\mirea\\lab9\\ReadAndWriteFile.txt", true);
            String line;
            BufferedReader buffer=new BufferedReader(new FileReader("src\\main\\java\\ru\\mirea\\lab9\\ReadAndWriteFile.txt"));
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
            ReadWriter.close();
            
            // Замена информации в файле на информацию, введенную с клавиатуры
            FileWriter replaceWriter = new FileWriter("src\\main\\java\\ru\\mirea\\lab9\\ReadAndWriteFile.txt", false);
            String newText = bufferedReader.readLine();
            replaceWriter.write(newText);
            replaceWriter.close();
            
            // Добавление в конец исходного файла текста, введенного с клавиатуры
            FileWriter appendWriter = new FileWriter("src\\main\\java\\ru\\mirea\\lab9\\ReadAndWriteFile.txt", true);
            String appendedText = bufferedReader.readLine();
            appendWriter.write(appendedText);
            appendWriter.close();
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}