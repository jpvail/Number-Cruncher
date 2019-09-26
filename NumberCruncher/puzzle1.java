package puzzle1; 

public class puzzle1{

    public static int magicduos(int[] array){
        int counter = 0; 
        for (int i =0; i < array.length - 1; i++){
                for(int k = i+1; k < array.length; k++){
                    int product = array[i]*array[k];
                    if(product < 1000){
                        if(product < 100 && product >= 10){
                            String full = Integer.toString(product);
                            if(full.length() == 2){
                                char one = full.charAt(0);
                                char two = full.charAt(1);
                                int r1 = Character.getNumericValue(one);
                                int r2 = Character.getNumericValue(two);
                                if(r2 > r1){
                                    counter++; 
                                }
                            }
                        }
                        String full2 = Integer.toString(product);
                        if (full2.length() == 3){
                            char three = full2.charAt(0);
                            char four = full2.charAt(1);
                            char five = full2.charAt(2); 
                            int r3 = Character.getNumericValue(three);
                            int r4 = Character.getNumericValue(four);
                            int r5 = Character.getNumericValue(five); 
                            if(r4 > r3 && r5 > r4){
                                counter++; 
                            }
                        }
                    }
                }
        }
        return counter; 
    }
}