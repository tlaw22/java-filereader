import java.io.*;

public class App {
    public static void main(String[] args) {

        File file = new File("myfile.txt");
        try (FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        ){
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problem reading the file " + file.getName());
        }
    }
}
