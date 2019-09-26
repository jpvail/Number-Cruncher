package puzzle1; 

public class puzzle1tester{

    public static void main(String[] args){
        int[] numbers = new int[1001];
        for(int i = 1; i <= 1000; i++){
            numbers[i] = i;
        }
        
        System.out.println(puzzle1.magicduos(numbers)); 
    }
}