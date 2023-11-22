import java.util.Scanner;

public class roman_integer {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your roman number: ");
        String roman_number=sc.next();
        roman_number=roman_number.toUpperCase();
        int answer=0,number=0,previous=0;
        for(int i=0;i<roman_number.length();i++){
            switch(roman_number.charAt(i)){
                case 'I':
                number=1;
                break;
                case 'V':
                number=5;
                break;
                case 'X':
                number=10;
                break;
                case 'C':
                number=100;
                break;
                case 'D':
                number=500;
                break;
                case 'M':
                number=1000;
                break;
            }
            if(previous>=number){
                answer+=number;
            }

            else{
                answer=(answer-previous)+(number-previous);
            }
            previous=number; 
        }
        System.out.println(answer);
        sc.close();
    }
}
