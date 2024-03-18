import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExStrings {
	public static void main(String[] args) {




	}

	public static void Ex(){
		int[] arr= {111111,0,2222222,4,55533555,44,244,222323333};
		System.out.println(mostAccuringNum(arr));
	}
	public static int mostAccuringNum(int []arr) {
		String newNum=" ";

		for (int i = 0; i < arr.length; i++) {
			newNum+=arr[i];
		}
		int count=0;
		int countMostAccuring=0;
		int mostAccuringNum=0;
		for (int i = 0; i < newNum.length(); i++) {
			count=0;
			for (int j = 0; j < newNum.length(); j++) {
				if (newNum.charAt(i)==newNum.charAt(j)) {
					count++;
				}
			}
			if(count>countMostAccuring) {
				countMostAccuring=count;
				mostAccuringNum=Character.getNumericValue(newNum.charAt(i)) ;
			}
		}
		return mostAccuringNum;
	}
	public static void Ex0(){
		String input = "xxxabbbcdddcxxxyyz";
		String output = removeDuplicates(input);
		System.out.println(output);
	}
	public static String removeDuplicates(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (i == 0 || currentChar != input.charAt(i - 1)) {
				if (i == input.length() - 1 || currentChar != input.charAt(i + 1)) {
					result += currentChar;
				}
			}
		}
		return result;
	}
	public static Scanner s = new Scanner(System.in);
	public static void Ex1(){
		System.out.print("Enter first name: ");
		String firstName = s.next();
		System.out.print("Enter last name: ");
		String lastName = s.next();
		System.out.println(returnName(firstName, lastName));
	}
	public static String returnName(String firstName, String lastName){
		return firstName + " " +lastName;
	}
	public static void Ex2(){
		String str1 = "Yakov";
		String str2 ="Dan";
		longestString(str1, str2);
	}
	public static void longestString(String str1, String str2){
		if (str1.length() > str2.length()){
			System.out.println(str1);
		}else {
			System.out.println(str2);
		}
	}
	public static void Ex3(){
	String str = "Yakov";
	int number = 5;
		System.out.println("Is the string exactly the length of the number? " + ifLengthStringNumber(str, number));
	}
	public static boolean ifLengthStringNumber(String str, int number){
		return str.length() == number;
	}
	public static void Ex4(){
		String str1 = "Yakov";
		String str2 = "Yakov2";
		int result = stringsSameOrStartWithSameLetter(str1, str2);
		System.out.println(result);
	}
	public static int stringsSameOrStartWithSameLetter(String str1, String str2){
		if (str1.equals(str2)){
			return 1;
		} else if (str1.charAt(0) == str2.charAt(0)) {
			return 2;
		}else {
			return 3;
		}
	}
	public static void Ex5() {
		String str = "YakovYvY";
		char ch = 'Y';
		int result = characterAppearsInTextString(str, ch);
		System.out.println(result);
	}
	public static int characterAppearsInTextString(String str, char ch){
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch){
				counter++;
			}
		}
		return counter;
	}
	public static void Ex6(){
		System.out.print("Enter first string: ");
		String str1 = s.next();
		System.out.print("Enter second string: ");
		String str2 = s.next();
		System.out.println("The strings is equals? --> " + equalsStrings(str1, str2));
	}
	public static boolean equalsStrings(String str1, String str2){
		int counter = 0;
		for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == str2.charAt(i)){
					counter++;
			}
		}
		if (counter == str1.length()){
			return true;
		}else {
			return false;
		}
	}
	public static String[] createStringArr(String[] str){
		for (int i = 0; i < str.length; i++) {
			System.out.println("Enter String " + (i+1) +" :");
			str[i] = s.next();
		}return str;
	}
	public static void Ex7(){
		System.out.print("How many strings you want enter? ");
		int number = s.nextInt();

		String[] str = new String[number];
		System.out.println("Enter " + number + " strings: ");
		String[] newStr = createStringArr(str);

		String str2 = theLongestStrings(newStr);
		System.out.print("The longest strings is ---> " + str2);
	}
	public static String theLongestStrings(String[] str){
		String newStr = str[0];
		for (int i = 1; i < str.length; i++) {
			if (newStr.length() < str[i].length()){
				newStr= str[i];
			}
		}
		return newStr;
	}
	public static void Ex8(){
		String phone1 = "0501234567";
		String phone2 = "972504730464";
		String phone3 = "0423433455;";
		String phone4 = "05266705-94";
		System.out.println("phone 1: " + normalIsraeliPhoneNumber(phone1));
		System.out.println("phone 2: " +normalIsraeliPhoneNumber(phone2));
		System.out.println("phone 3: " +normalIsraeliPhoneNumber(phone3));
		System.out.println("phone 4: " +normalIsraeliPhoneNumber(phone4));
	}
	public static final int lengthForNormalNumberPhone = 10;
	public static String normalIsraeliPhoneNumber(String phone){
		String result ="";
		if (phone.length() >= lengthForNormalNumberPhone){
			if (phone.startsWith("05")){
				if (phone.contains("-")){
					phone = phone.replace("-", "");
				}
				result +=phone.substring(0, 3) + "-" + phone.substring(3);
			} else if (phone.startsWith("972")) {
				result+="0" + phone.substring(3,5) + "-" + phone.substring(5);
			} else {
				result = " ";
			}
		}
		return result;
	}
	public static void Ex9(){
		System.out.println("How many strings you want enter? ");
		int size = s.nextInt();
		String[] str = new String[size];
		createStringArr(str);
		String result = returnFirstStringContainsChar(str);
		System.out.println(result);

	}
	public static String returnFirstStringContainsChar(String[] str){
		String newStr = " ";
		boolean res = false;
		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("$")) {
				newStr = str[i];
				res = true;
				break;
			}
		}if (!res){
			System.out.println("There is no string containing the character. ");
		}
		return newStr;
	}
	public static void Ex10(){
		String[] str = new String[5];
		createStringArr(str);
		System.out.println("Enter another String: ");
		String toFind = s.next();
		String[] newStr = arrStringsComparedToFind(str,toFind);
		printStringsArr(newStr);

	}
	public static String[] arrStringsComparedToFind(String[] str, String toFind){
		int counter = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(toFind)){
				counter++;
			}
		}
		String[] newStr = new String[counter];
		int index = 0;
		for (int i = 0; i < newStr.length; i++) {
			newStr[index] = toFind;
			index++;
		}
		return newStr;
	}
	public static void printStringsArr(String[] str){
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + ",");
		}
	}
	public static void Ex11(){
		System.out.println("Enter strings: ");
		String str = s.next();
		String reversString = reversString(str);
		System.out.println(reversString);
	}
	public static String reversString(String str){
		String reverseWord = "";
		for (int j = str.length()-1; j >=0 ; j--) {
				reverseWord += str.charAt(j);
		}
		return reverseWord;
	}
	public static void Ex12(){
		System.out.print("Enter hard Password: ");
		String password = s.next();
		if (hardPasswordStrings(password)){
			System.out.print("The password is: " + password);
		}else {
			System.out.print("The password is lower");
		}
	}
	public static boolean hardPasswordStrings(String password){
		boolean res = false;
		if (stringLengthGreaterThenEightAndLowerThenTen(password)
				&& stringHaveOneDigitAndMore(password) && stringHaveOneSpecialChar(password)) {
			res = true;
		}
		return res;
	}
	public static boolean stringLengthGreaterThenEightAndLowerThenTen(String str){
		return str.length()>=8 && str.length()<=10;
	}
	public static boolean stringHaveOneDigitAndMore(String str){
		String ch = "0123456789";
		for (int i = 0; i <str.length(); i++) {
				if (ch.contains(str.charAt(i)+"")){
					return true;
				}
		}
		return false;
	}
	public static boolean stringHaveOneSpecialChar(String str){
		String specialChars = "%$,_";
		for (int i = 0; i < str.length(); i++) {
			if (specialChars.contains(str.charAt(i)+"")) {
				return true;
			}
		}
		return false;
	}
	public static void Ex13(){
		String str = "I want is, I got it";
		char[] chars = {'I','A','T','C','N'};
		System.out.println(characterAppearsManyTimesString(str,chars));
	}
	public static char characterAppearsManyTimesString(String str, char[] chars){
		str = str.toUpperCase();
		int countDup;
		int maxCount = 0;
		char currentChar =' ';
		char maxChar = ' ';
		for (int i = 0; i < chars.length; i++) {
			countDup = 0;
			currentChar = chars[i];
			for (int j = 0; j < str.length(); j++) {
				if (Character.toUpperCase(chars[i]) == str.charAt(j)){
					countDup++;
				}
			}
			if (maxCount< countDup){
				maxCount = countDup;
				maxChar = currentChar;
			}
		}
		return maxChar;
	}
	public static void Ex14  (){
		System.out.println("Enter String: ");
		String str = s.nextLine();
		if (isPalindromeString(str)){
			System.out.println("Is palindrome String :) " );
		}else {
			System.out.println("Its Not palindrome :( ");
		}
	}
	public static boolean isPalindromeString(String str){
		boolean res = true;
		str = str.toUpperCase();
		str =str.replace(" ", "");
		String reversStr = reversString(str);
		for (int i = 0; i < str.length(); i++) {
			if (!(reversStr.charAt(i) == str.charAt(i))){
				res = false;
				break;
			}
		}
		return  res;
	}
	public static void Ex15() {
		String str1 = "Hello from Java";
		String str2 = "I want It, I got It";
		String result1 = newStrWithFirstChar(str1);
		String result2 = newStrWithFirstChar(str2);
		System.out.println(result1);
		System.out.println(result2);

	}
	public static String newStrWithFirstChar(String str) {
		String newStr = " ";
		String[] arrStr = str.split(" ");
		for (int i = 0; i < arrStr.length; i++) {
			if (!newStr.contains(arrStr[i].charAt(0)+"")){
				newStr += arrStr[i].charAt(0) + "";
			}
		}
		return newStr;
	}
	public static void Ex18(){
		String[] strArr = new String[100];
		String[] newStr = stringArr(strArr);
		printStringsArr(newStr);
	}
	public static String[] stringArr (String[] strArr){
		for (int i = 0; i < strArr.length; i++) {
			int starsCount = r.nextInt(25);
			String stars = "";
		for (int j = 0; j < starsCount; j++) {
			stars += "*";
		}
		strArr[i] = stars;
		}

		return strArr;
	}
	public static void Ex19(){
	String[] strArr = {"apple","orange", "banana","kiwi", "pear"};
	String[] result = sortByLength(strArr);
	printStringsArr(result);
	}

	public static String[] sortByLength(String[] strArr){
		for (int i = 0; i < strArr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[j].length() < strArr[minIndex].length()) {
					minIndex = j;
				}
			}
			String temp = strArr[minIndex];
 			strArr[minIndex] = strArr[i];
			strArr[i] = temp;

		}
		return strArr;
	}
	public static void check(){
		String str1 = "Hello from Java";
		String[] strArr = str1.split(" ");
		System.out.println(Arrays.toString(strArr));
	}

	public static void Strings(){
		/*
		str = "Why";
		newStr = You";
		result = str.concat(" ").concat(newStr).concat("!"); מחבר את המשפטים Why you!
--------------------------------------------------------------------------------------------------------------------
        str = "Good morning";
        charArr[] = str.toCharArray(); נקבל [G,o,o,d, ,m,o,r,n,i,n,g];
        str = "Good morning"; כלומר הוא לא משתנה
--------------------------------------------------------------------------------------------------------------------
		str = "    go od ";
		newStr= str.trim();/"go od" מוריד את הרווחים מימין ומשמאל
--------------------------------------------------------------------------------------------------------------------
		str = "Hello from Java;
		strArr[] = str.split(" "); ["Hello","from","Java"]; מחלק את המחרוזת לחלקים לפי רווחים או כל תו אחר
--------------------------------------------------------------------------------------------------------------------
		str = "hello my name is yakov ;
		newStr = str.replace("hello", "hi"); // הפלט hi my name is shai
--------------------------------------------------------------------------------------------------------------------
		str = "052-6650754 052-34345345";
		newStr = str.replaceFirst("052-", "972"); 9726650754 052-34345345 במקרה זה הוא יחליף רק את המספר הראשון שהוא נתקל בו
        newStr2 = str.replaceFirst("052-", "972"); במקרה זה הוא יחליף גם את המספר הראשון וגם את השני
--------------------------------------------------------------------------------------------------------------------
        str = "YakoV";
        newStr = str.toLowerCase(); יחליף ל yakov לאותיות קטנות
        newStr2 = newStr.toUpperCase(); יחליף ל YAKOV לאותיות גדולות
--------------------------------------------------------------------------------------------------------------------
        str = "0123456789";
        newStr = str.substring(5,7);   יתן לי רק את המיקום(האינדקס) ה5 עד ה6 במקרה זה את המספרים 5,6
        newStr2 = str.substring(5); 56789 יביא את מה שנמצא מהמיקום(האינדקס) ה5 עד הסוף לדוגמא
--------------------------------------------------------------------------------------------------------------------
         str = s.nextLine(); // yaniv yakov ido;
         string newStr = "yakov";
         int index = str.indexOf(newStr);  זא שהוא מחפש באיזה אינדקס במחרוזת הראשונה נמצא המחרוזת השני פה בדוגמא זה מהאינדקס ה6
--------------------------------------------------------------------------------------------------------------------
         str = "ABCD";
         newStr = "sdsdABCD";
         newStr.contains(str); / true  זה בודק אם המחרוזת השניה מכילה את המחרוזת הראשונה
--------------------------------------------------------------------------------------------------------------------
         str = "052-6650754;
         str.startWith("052"); / true כי זה בודק אם זה מתחיל במחרוזת מסוימת
--------------------------------------------------------------------------------------------------------------------
         str  = "Bro";
         newStr = "bRo";
         newStr.equals(str); false Bro != bRo;
         newStr.equalsIsIgnoreCase(str); true //מתעלם מאותיות גדולות קטנות ובודק אם זה אותו מילה
--------------------------------------------------------------------------------------------------------------------
        str = "";
        str.isEmpty(); true בודק אם המחרוזת ריקה
--------------------------------------------------------------------------------------------------------------------
        int source = 12345;
        String str = String.valueOf(source); //הופך את המספר למחרוזת של "12345"ואז אפשר לעבוד על זה בתור מחרוזת
--------------------------------------------------------------------------------------------------------------------
        str = "ABCD";
        String[] strArr = str.split(""); /[A,B,C,D]; מחלקת את המחרוזת למערך לפי התת מחרוזת שמועברת אלייה(מוחקת את התת ומחלקת למערך)
        String[] newStrArr = str.split("D");[A,B,C];
        --------------------------------------------------------------------------------------------------------------------
        int aInt = 1;
		String aString = Integer.toString(aInt);//ממספר למחרוזת
		int num = Integer.parseInt(aString);//ממחרוזת למספר
		 */

	}
	public static Random r = new Random();

}
