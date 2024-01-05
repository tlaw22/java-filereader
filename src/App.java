import java.io.*;

public class App {
    public static void main(String[] args) {

        File file = new File("myfile.txt");
        BufferedReader reader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);

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
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
                
            } catch (IOException e) {
                System.out.println("Unable to close file" + file.getName());
                e.printStackTrace();
            }
        }
    }
}
