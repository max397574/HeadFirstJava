public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        int numOffGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);
        int[] locations = { randomNum, randomNum+1, randomNum+2 };

        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive = true) {
            String userGuess = helper.getUserInput("Enter a number ");

            String result = theDotCom.checkYourself(userGuess);
            numOffGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOffGuesses + " guesses.");
                break;
            }
        }
    }
} 
