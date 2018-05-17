import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[]args){
        try {
            System.out.println(readInFile("C:/Users/jakob/Desktop/readthis.txt"));
        }
        catch(IOException exc){
            exc.getMessage();
        }
    }


    public static String readInFile(String fileName) throws IOException {  //maybe via GUI? (windows prompt)
        String fileContent = "a";

        if(fileName != null) {
            FileReader fileReadr = new FileReader(fileName);
            if(fileReadr != null) {
                BufferedReader buffTempReadr = new BufferedReader(fileReadr);
            }
            else{ //BufferedReaderException// handling

                throw new IOException("FileReader was not successfully created and is missing!");
            }

        }
        else{ //FileReaderException handling
            throw new IOException("Tried reading in non-existing/unusable file!");
        }







        return fileContent;
    }
}






