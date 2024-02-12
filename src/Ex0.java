import java.util.Scanner;

public class Ex0 {
    public static void main(String [] args){

    }
    public static String nameString(String firstName, String lastName){
       String strResult = firstName + " " + lastName;
       return strResult;
    }
    public static void longerString (String str1, String str2){
       int longStr1 = str1.length();
       int longStr2 = str2.length();
       int maxString = 0;
       if (longStr1 > longStr2){
           System.out.println(str1);
       }else {
           System.out.println(str2);
       }
    }
    public static boolean comparingStringAndInt(String str1, int num){
        int size = str1.length();
        boolean result = false;
        if (size == num){
            result = true;
        }else {
            return false;
        }
        return result;
    }
    public static int CheckSimilarityOfStrings(String str1, String str2){
        int result = 0;
        char firstStr1 = str1.charAt(0);
        char firstStr2 = str2.charAt(0);
        if (str1.equals(str2)){
            result = 1;
        } else if (firstStr1 == firstStr2) {
            result =2;
        }else {
            result = 3;
        }return result;
    }
    public static int countCharInString(String str1, char ch1){
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ch1){
                count++;
            }

        }return count;
    }
    public static String returningLongestString(String[] str){
        String max = str[0];
        for (int i = 1; i < str.length; i++) {
            if(str[i].length() > max.length()){
                max = str[i];
            }
        }return max;
    }
    public static String normalizePhone(String phone){
        String result = "-";
        if (validatePhone(phone)){
            if (phone.contains("-")) {
                result = phone;
            }
        }else {
            if (phone.length() == 12) {
                phone = phone.replace("972" , "0");
            }
                String prefix = phone.substring(0, 3);
                String suffix = phone.substring(3, 10);
                result = prefix + "-" + suffix;

        }return result;

    }
    public static boolean validatePhone(String phone){
        boolean valid = false;
        if (phone.length() == 10){
            if (phone.startsWith("05")){
                valid = true;
            }
        }if (!valid){
            if (phone.length()== 11){
                if (phone.startsWith("05") && phone.charAt(3) == '-'){
                    valid = true;
                }
            }
            if (!valid){
                if (phone.length()==12){
                    if (phone.startsWith("972")){
                        valid=true;
                    }
                }
            }
        }return valid;
    }


    public static void Ex1(){
        System.out.print(nameString("Yakov","BENHEMO"));
    }
    public static void Ex2(){
        String str1 = "Yakov";
        String str2 = "BENHEMO";
        longerString(str1, str2);

    }
    public static void Ex3(){
        int num = 5;
        String name = "yakov";
        System.out.println(comparingStringAndInt(name, num));
    }
    public static void Ex4(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two String: ");
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        System.out.println(CheckSimilarityOfStrings(str1, str2));


    }
    public static void Ex5() {
        String str1 = "Yakov";
        char ch1 = 'Y';
        System.out.println(countCharInString(str1, ch1));
    }
    public static void Ex7(){
        String[] str = {"CH" , "SSSS"};
        System.out.println(returningLongestString(str));

    }
    public static void Ex8(){
        System.out.println(normalizePhone("97348484737"));

    }


}
