import java.util.*;

class matrixSnake{
    public static void main(String[] args){
        System.out.println("Programme started from main function ...");
        int[][] array = {
            {1,   2,   3, 4},
            {12, 13,  14, 5},
            {11, 16,  15, 6},
            {10,  9,   8, 7}
        };
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Press A to call topLeftToRight()    function : ");
        System.out.println("Press B to call topLeftToBottom()   function : ");
        System.out.println("Press C to call topRightToLeft()    function : ");
        System.out.println("Press D to call topRightToBottom()  function : ");
        System.out.println("Press E to call bottomLeftToTop()   function : ");
        System.out.println("Press F to call bottomLeftToRight() function : ");
        System.out.println("Press G to call bottomRightToTop()  function : ");
        System.out.println("Press H to call bottomRightToLeft() function : ");
        System.out.println("--- Press Q to quit or exit the programme ---: ");
        String userInput = myObj.nextLine();  
        ArrayList<Integer> answer = new ArrayList<Integer>();
        switch (userInput) {
            case "A":
            case "a":
                answer=topLeftToRight(array);
                break;
            case "B":
            case "b":
                answer=topLeftToBottom(array);
                break;
            case "C":
            case "c":
                answer=topRightToLeft(array);
                break;
            case "D":
            case "d":
                answer=topRightToBottom(array);
                break;
            case "E":
            case "e":
                answer=bottomLeftToTop(array);
                break;
            case "F":
            case "f":
                answer=bottomLeftToRight(array);
                break;
            case "G":
            case "g":
                answer=bottomRightToTop(array);
                break;
            case "H":
            case "h":
                answer=bottomRightToLeft(array);
                break;
            case "Q":
            case "q":
            System.out.println("Programme terminated !");
            System.exit(0);
        }

        for(int i=0;i<answer.size();i++){
            System.out.print(answer.get(i) + " ");
        }
    } 


    public static ArrayList<Integer> topLeftToRight(int[][] array){
        System.out.println("Performing topLeftToRight() function");
        ArrayList<Integer> answer = new ArrayList<Integer>();
        if(array.length==0){
          return answer; 
         }
        if(array.length==1){
          for(int i=0;i<array[0].length;i++){
            answer.add(array[0][i]);
          }return answer;
        }
        int topRow = 0;
        int bottomRow = array.length-1;
        int leftColumn = 0;
        int rightColumn = array[0].length-1;
        while(topRow<=bottomRow && leftColumn<=rightColumn ){
          for(int i=leftColumn;i<=rightColumn;i++){
            answer.add(array[topRow][i]);
          }topRow++;
          for(int i=topRow;i<=bottomRow;i++){
             answer.add(array[i][rightColumn]);
          }rightColumn--;
          if(topRow<=bottomRow){
            for(int i=rightColumn; i>=leftColumn ; i--){
              answer.add(array[bottomRow][i]);
            }bottomRow--;
          }
          if(leftColumn<=rightColumn){
            for(int i=bottomRow ; i>=topRow ; i--){
              answer.add(array[i][leftColumn]);
            }leftColumn++;
          }
        }
        return answer;
    }   

    public static ArrayList<Integer> topLeftToBottom(int[][] array){
        System.out.println("Performing topLeftToBottom() function");

        ArrayList<Integer> answer = new ArrayList<Integer>();

        if(array.length==0){
            return answer; 
        }
        if(array.length==1){
            for(int i=0;i<array[0].length;i++){
                answer.add(array[0][i]);
            }
            return answer;
        }

        int topRow = 0;
        int bottomRow = array.length-1;
        int leftColumn = 0;
        int rightColumn = array[0].length-1;

        while(topRow<=bottomRow && leftColumn<=rightColumn){

            for(int i=topRow;i<=bottomRow;i++){
                answer.add(array[i][leftColumn]);
            }leftColumn++;

            for(int i=leftColumn;i<=rightColumn;i++){
                answer.add(array[bottomRow][i]);
            }bottomRow--;

            for(int i=bottomRow;i>=topRow;i--){
                answer.add(array[i][rightColumn]);
            }rightColumn--;

            for(int i=rightColumn;i>=leftColumn;i--){
                answer.add(array[topRow][i]);
            }topRow++;
        }
        return answer;
    }

    public static ArrayList<Integer> topRightToLeft(int[][] array){
        System.out.println("Performing topRightToLeft() function");

        ArrayList<Integer> answer = new ArrayList<Integer>();
        if(array.length==0){
           return answer; 
        }
        if(array.length==1){
            for(int i=0;i<array[0].length;i++){
                answer.add(array[0][i]);
            }
            return answer;
         }
        int topRow = 0;
        int bottomRow = array.length-1;
        int leftColumn = 0;
        int rightColumn = array[0].length-1;

        while(topRow<=bottomRow && leftColumn<=rightColumn ){

            for(int i=rightColumn;i>=topRow;i--){
                answer.add(array[topRow][i]);
            }topRow++;

            for(int i=topRow;i<=bottomRow;i++){
                answer.add(array[i][leftColumn]);
            }leftColumn++;

            for(int i =leftColumn;i<=rightColumn;i++ ){
                answer.add(array[bottomRow][i]);
            }bottomRow--;

            for(int i=bottomRow;i>=topRow;i--){
                answer.add(array[i][rightColumn]);
            }rightColumn--;

        }

        return answer;

    }

    public static ArrayList<Integer> topRightToBottom(int[][] array){
        System.out.println("Performing topRightToBottom() function");

        ArrayList<Integer> answer = new ArrayList<Integer>();
        if(array.length==0){
            return answer; 
        }
        if(array.length==1){
            for(int i=0;i<array[0].length;i++){
                answer.add(array[0][i]);
            }
            return answer;
        }
        int topRow = 0;
        int bottomRow = array.length-1;
        int leftColumn = 0;
        int rightColumn = array[0].length-1;


        while(topRow<=bottomRow && leftColumn<=rightColumn){

            for(int i=topRow;i<=bottomRow;i++){
                answer.add(array[i][rightColumn]);
            }rightColumn--;

            for(int i=rightColumn;i>=leftColumn;i--){
                answer.add(array[bottomRow][i]);
            }bottomRow--;

            for(int i=bottomRow;i>=topRow;i--){
                answer.add(array[i][leftColumn]);
            }leftColumn++;

            for(int i=leftColumn;i<=rightColumn;i++){
                answer.add(array[topRow][i]);
            }topRow++;



        }
        return answer;
    }


    public static ArrayList<Integer> bottomLeftToTop(int[][] array){
        System.out.println("Performing bottomLeftToTop() function");
        ArrayList<Integer> answer = new ArrayList<Integer>();
        if(array.length==0){
            return answer; 
        }
        if(array.length==1){
            for(int i=0;i<array[0].length;i++){
                answer.add(array[0][i]);
            }
            return answer;
        }
        int topRow = 0;
        int bottomRow = array.length-1;
        int leftColumn = 0;
        int rightColumn = array[0].length-1;
        while(topRow<=bottomRow && leftColumn<=rightColumn){
            for(int i=bottomRow;i>=topRow;i--){
                answer.add(array[i][leftColumn]);
            }leftColumn++;
            for(int i=leftColumn;i<=rightColumn;i++){
                answer.add(array[topRow][i]);
            }topRow++;
            for(int i=topRow;i<=bottomRow;i++){
                answer.add(array[i][rightColumn]);
            }rightColumn--;
            for(int i=rightColumn;i>=leftColumn;i--){
                answer.add(array[bottomRow][i]);
        }bottomRow--;
        }
        return answer;
    }


    public static ArrayList<Integer> bottomLeftToRight(int[][] array){
        System.out.println("Performing bottomLeftToRight() function");   
        ArrayList<Integer> answer = new ArrayList<Integer>();
        if(array.length==0){
            return answer; 
        }
        if(array.length==1){
            for(int i=0;i<array[0].length;i++){
                answer.add(array[0][i]);
            }
            return answer;
        }
        int topRow = 0;
        int bottomRow = array.length-1;
        int leftColumn = 0;
        int rightColumn = array[0].length-1;
        while(topRow<=bottomRow && leftColumn<=rightColumn){
            for(int i=leftColumn;i<=rightColumn;i++){
                answer.add(array[bottomRow][i]);
            }bottomRow--;
            for(int i=bottomRow;i>=topRow;i--){
                answer.add(array[i][rightColumn]);
            }rightColumn--;
            for(int i=rightColumn;i>=leftColumn;i--){
                answer.add(array[topRow][i]);
            }topRow++;
            for(int i=topRow;i<=bottomRow;i++){
                answer.add(array[i][leftColumn]);
            }leftColumn++;
        }
        return answer;
    }

    public static ArrayList<Integer> bottomRightToTop(int[][] array){
        System.out.println("Performing bottomRightToTop() function");     
        ArrayList<Integer> answer = new ArrayList<Integer>();
        if(array.length==0){
            return answer; 
        }
        if(array.length==1){
            for(int i=0;i<array[0].length;i++){
                answer.add(array[0][i]);
            }
            return answer;
        }
        int topRow = 0;
        int bottomRow = array.length-1;
        int leftColumn = 0;
        int rightColumn = array[0].length-1;          
        while(topRow<=bottomRow && leftColumn<=rightColumn){
            for(int i=bottomRow;i>=topRow;i--){
                answer.add(array[i][rightColumn]);
            }rightColumn--;
            for(int i=rightColumn;i>=leftColumn;i--){
                answer.add(array[topRow][i]);
            }topRow++;
            for(int i=topRow;i<=bottomRow;i++){
                answer.add(array[i][leftColumn]);
            }leftColumn++;
            for(int i=leftColumn;i<=rightColumn;i++){
                answer.add(array[bottomRow][i]);
            }bottomRow--;    
        }
        return answer;
    }

    public static ArrayList<Integer> bottomRightToLeft(int[][] array){
        System.out.println("Performing bottomRightToLeft() function");  
        ArrayList<Integer> answer = new ArrayList<Integer>();
        if(array.length==0){
            return answer; 
        }
        if(array.length==1){
            for(int i=0;i<array[0].length;i++){
                answer.add(array[0][i]);
            }
            return answer;
        }
        int topRow = 0;
        int bottomRow = array.length-1;
        int leftColumn = 0;
        int rightColumn = array[0].length-1;
        while(topRow<=bottomRow && leftColumn<=rightColumn){
            for(int i=rightColumn;i>=leftColumn;i--){
                answer.add(array[bottomRow][i]);                
            }bottomRow--;
            for(int i=bottomRow;i>=topRow;i--){
                answer.add(array[i][leftColumn]);
            }leftColumn++;     
            for(int i=leftColumn;i<=rightColumn;i++){
                answer.add(array[topRow][i]);
            }topRow++;
            for(int i=topRow;i<=bottomRow;i++){
                answer.add(array[i][rightColumn]);
            }rightColumn--;            
        }
        return answer;
    }
}


    // from top left to right   topLeftToRight();      DONE   yes
    // from top left to bottom  topLeftToBottom();     DONE   yes
    // from top right to left   topRightToLeft();      DONE   yes 
    // from top right to bottom  topRightToBottom()    DONE   yes 
    // from bottom left to top  bottomLeftToTop()      DONE   yes 
    // from bottom left to right  bottomLeftToRight()  DONE   yes
    // from bottom right to top  bottomRightToTop()    DONE   yes
    // from bottom right to left  bottomRightToLeft()  DONE   yes