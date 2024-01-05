import java.io.*;

public class App {
    public static void main(String[] args) {

        File file = new File("myfile.txt");
        BufferedReader reader = null;
        try {
            FileReader fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);

            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Problem reading the file " + file.getName());
        } finally {
             try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Unable to close file" + file.getName());
                e.printStackTrace();
            } catch (NullPointerException ex) {
                System.out.println("The file was not opened correctly" + ex);
            }
        }
    }
}
