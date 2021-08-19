import java.io.*
public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt);
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(Sytem.in));
            inputLine = is.readLine();
            if (inputLine.lenght() == 0) return null;
        } catch(IOException e){
        System.out.println("IOException" + e);
        }
        return inputLine
    }
}
