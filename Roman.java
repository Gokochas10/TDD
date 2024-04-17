

public abstract class Roman {
    
    public static String getRoman(int number){
        String roman = "";
        int[] decimal = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanNumber = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        for (int i = 0; i < decimal.length; i++) {
            while (number >= decimal[i]) {
                number -= decimal[i];
                roman += romanNumber[i];
            }
        }
        return roman;
    }
}
