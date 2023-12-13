import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math;
import java.io.File;
import java.io.IOException;

// public class Sem_3_Practice {
// public static void main(String[] args) {
// int num = 8;
// ArrayList <Integer> ar = new ArrayList<>();
// while (num>0) {
// ar.add(num % 2);
// num = num / 2;
// }
// for (int i = ar.size()-1; i>=0; i--){
// System.out.print(ar.get(i));
// // System.out.print(ar.get(i).getClass());
// }
// }
// }

// public class Sem_3_Practice {
// public static void main(String[] args) {
// int num = 10010;
// int j = 0;
// int result = 0;
// while (num > 0) {
// int b = num % 10;
// result = result + b * (int) Math.pow(2, j);
// num = num / 10;
// j++;
// }
// System.out.println(result);
// }
// }

// public class Sem_3_Practice {
// public static void main(String[] args) {
// int start = 2;
// int end = 100;
// ArrayList<Integer> lst = new ArrayList<>();
// for(int i = start; i <= end; i++){
// int nf = 0;
// for(int j = 1; j <= Math.sqrt(i); j++){
// if (i % j == 0){
// nf++;
// }
// }
// if (nf == 1){
// lst.add(i);
// nf = 0;
// }
// }
// System.out.println(lst.get(0) * lst.get(lst.size()-1));
// }
// }

// public class Sem_3_Practice {
// public static void main(String[] args) {
// int original_num = 153;
// int num = original_num;
// int p = String.valueOf(num).length();
// int result = 0;
// for (int i = 0; i < p; i++){
// int x = num % 10;
// result = result + (int) Math.pow(x, p);
// num = num / 10;
// }
// if (result == original_num){
// System.out.println("yes");
// } else{
// System.out.println("not");
// }
// }
// }

// class Sem_3_Practice {
// public static void main(String[] args) {
// ArrayList<Integer> myList = new ArrayList<Integer>();
// int mult=0;
// int gcd=1;
// int lcm=1;
// Scanner myObj = new Scanner(System.in);
// System.out.println("Enter the lower limit: ");
// int lower = myObj.nextInt();
// System.out.println("Enter the upper limit: ");
// int upper = myObj.nextInt();
// Arm a = new Arm();
// myList=a.findArm(lower,upper);
// int mid1=myList.get(myList.size()/2 - 1);
// int mid2=myList.get(myList.size()/2);
// if(myList.size()<2){
// System.out.println("The range doesn't have enough numbers to find the value
// in the middle of array list");
// }
// else{
// System.out.println("The mid values in this series are: "+mid1+"\t"+mid2);
// }
// GCD_LCM ob = new GCD_LCM();
// gcd = ob.findGCD(mid1, mid2);
// lcm = ob.findLCM(mid1, mid2,ob.findGCD(mid1,mid2));
// System.out.println("The GCD is: "+gcd+" and LCM is: "+lcm);
// }
// }

// class Arm {
// ArrayList<Integer> al = new ArrayList<Integer>();

// ArrayList<Integer> findArm(int l, int u) {
// int sum = 0;
// for (int num = l; num <= u; num++) {
// if (isArm(num)) {
// al.add(num);
// }
// }
// System.out.println("ArrayList is : " + al);
// return al;
// }
// boolean isArm(int n) {
// int sum = 0;
// int backupnum1 = n;
// int backupnum2 = n;
// int numDigit = 0;
// while (backupnum1 > 0) {
// numDigit++;
// backupnum1 = backupnum1 / 10;
// }
// while (n > 0) {
// sum = sum + (int) Math.pow(n % 10, numDigit);
// n = n / 10;
// }
// if (sum == backupnum2) {
// return true;
// } else {
// return false;
// }
// }
// }

// class GCD_LCM {
// int findGCD(int a, int b) {
// int gcd = 1;
// int small = a > b ? b : a;
// for (int i = 1; i <= small; i++) {
// if (a % i == 0 && b % i == 0) {
// gcd = i;
// }
// }
// return gcd;
// }

// int findLCM(int x, int y, int z) {
// int lcm = (x * y) / z;
// return lcm;
// }
// }

// class Sem_3_Practice {
// public static void main(String[] args) {
// int a = 1, b = 2;
// char c1 = 'd', c2 = 'a';
// double d = 12.4, e = 90.7;
// double x = 25.9;
// a = c2;
// b = (int) d;
// c1 = (char) a;
// c2 = (char) e;
// d = b;
// e = d;
// System.out.println(d + "\t" + a + "\t" + c1 + "\t" + e + "\t" + c2 + "\t" +
// b);
// }
// }

// class Sem_3_Practice {
//     public static void main(String[] args) {
//         int x = 2, y = 3, c = 0, d = 1;
//         for (int a = x; a < y * 2; a++) {
//             for (c = 1; c < a; c++) {
//                 System.out.println(c);
//                 d = d + 2;
//             }
//         }
//         System.out.println(c + " " + d);
//     }
// }

// class Sem_3_Practice {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 5;
//         int num = 20;
//         int x = 0;
//         while (num >= 1 && b >= 1) {
//             b--;
//             num = num / 2;
//             x = x + (int) Math.pow(2, (b - a));
//         }
//         System.out.println(x + " " + b);
//     }
// }

// class Sem_3_Practice {
//     public static void main(String[] args) {
//             int a=1, b=5;
//             for(int i=a; i<=b; i++){
//                 for (int c=1; c<=i-1; c++){
//                     System.out.print((b-c)+ " ");
//             }
//             System.out.println();
//             }
//         }
// }

// class Sem_3_Practice {
//     public static void main(String[] args) {
//         int a = 1, b = 25, c = 0, res = 0;
//         for (int i = a; i <= b; i++) {
//             int r1 = i;
//             int r2 = i;
//             while (r1 >= 1) {
//                 c++;
//                 r1 = r1 / 10;
//             }
//             while (c >= 0) {
//                 int d = r2 % 10;
//                 c--;
//                 res = res + d * (int) Math.pow(10, c);
//                 r2 = r2 / 10;
//             }
//             c = 0;
//             System.out.print(res + " ");
//             res = 0;
//         }
//     }
// }

// class Sem_3_Practice {
//     public static void main(String[] args) {
//         ArrayList<String> al = new ArrayList<String>();
//         ArrayList<String> al2 = new ArrayList<String>();
//         al.add("Delhi");
//         al.add("Chennai");
//         al.add("Hyderabad");
//         al.add("Ahmedabad");
//         al.add("Bengaluru");
//         System.out.println(al);
//         for (String s : al) {
//             String r = "";
//             for (int i = s.length() - 1; i >= 0; i--) {
//                 r = r + s.charAt(i);
//             }
//             al2.add(r);
//         }
//         System.out.println(al2);
//     }
// }

// class Sem_3_Practice {
//     public static void main(String[] args) {
//         ArrayList<Integer> al = new ArrayList<Integer>();
//         GCD g = new GCD();
//         al.add(6);
//         al.add(12);
//         al.add(2);
//         al.add(20);
//         al.add(42);
//         int i = 0, minGCD = 1, gcd = 1, n1 = 1, n2 = 1;
//         while (i < al.size() - 1) {
//             if (i == 0) {
//                 n1 = al.get(i);
//                 n2 = al.get(i + 1);
//             } else {
//                 n1 = gcd;
//                 n2 = al.get(i + 1);
//             }
//             gcd = g.findGCD(n1, n2);
//             i++;
//         }
//         System.out.println("GCD is " + gcd);
//     }
// }

// class GCD {
//     int findGCD(int a, int b) {
//         int gcd = 1;
//         int small = a > b ? b : a;
//         for (int i = 1; i <= small; i++) {
//             if (a % i == 0 && b % i == 0) {
//                 gcd = i;
//             }
//         }
//         return gcd;
//     }
// }

// class Sem_3_Practice {
//     public static void main(String[] args) {
//         HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//         String s = "The weather is nice.";
//         s = s.replace(" ", "");
//         for (int i = 0; i <= s.length() - 1; i++) {
//             if (hm.containsKey(s.charAt(i))) {
//                 hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
//             } else {
//                 hm.put(s.charAt(i), 1);
//             }
//         }
//         for (char c : hm.keySet()) {
//             System.out.println("The number of occurrence of the character " + c + " is = " + hm.get(c));
//         }
//     }
// }

// class Sem_3_Practice{
//     public static void main(String[] args){
//         ArrayList<Integer> ar = new ArrayList<>();
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         ar.add(52);
//         ar.add(22);
//         ar.add(452);
//         ar.add(5256);
//         for(int i : ar){
//             int store = i;
//             int sum = 0;

//             while (i > 0) {
//                 sum = sum + i % 10;
//                 i = i/10;
//             }

//             hm.put(store, sum);
//             sum = 0;
//         }
//         System.out.println(ar);
//         System.out.println(hm);
//     }
// }

// public class Sem_3_Practice {
//     public static void main(String args[]) throws IOException {
//         File text = new File("output.txt");
//         Scanner scnr = new Scanner(text);
//         int count = 0;
//         // Reading each line of the file using Scanner class
//         while (scnr.hasNextLine()) {
//             count++;
//             String line = scnr.nextLine().trim();
//             String[] wordArray = line.split(" ");
//             int numWords = wordArray.length;
//             System.out.println("Total number of words in line " + count + " is: " + numWords);
//         }
//         scnr.close();
//     }
// }

// public class Sem_3_Practice {
//     public static void main(String args[]) throws IOException {
//         File text = new File("output.txt");
//         Scanner scnr = new Scanner(text);
//         int count = 0;
//         ArrayList<String> al = new ArrayList<String>();
//         al.add("a");
//         al.add("an");
//         al.add("the");
//         String newString = "";
//         while (scnr.hasNextLine()) {
//             count++;
//             String line = scnr.nextLine().trim();
//             String[] wordArray = line.split(" ");
//             for (String word : wordArray) {
//                 if (!al.contains(word)) {
//                     newString = newString + word + " ";
//                 }
//             }
//             System.out.println("Line " + count + " : " + line);
//             System.out.println("Line without articles: " + newString);
//             System.out.println();
//             newString = "";
//         }
//         scnr.close();
//     }
// }

// class Sem_3_Practice{
//     public static void main(String[] args){
//         int j, k, l;
//         for (int i =1 ; i<= 5; i++){
//             for (j=1; j<=i;j++){
//                 System.out.print(j+"@");
//             }
//             for (k=1; k<j;k++){
//                 System.out.print(j-1 +"&");
//             }
//             for (l=j-2; l>=1;l--){
//                 System.out.print(l+"#");
//             }
//             System.out.println();
//         }
//     }
// }

// class Sem_3_Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Pyramid p = new Pyramid();
//         System.out.println("Enter a number to form a pyramid: ");
//         int n = sc.nextInt();
//         System.out.println("Enter what kind of pyramid you want: type 1 for traditional or 2for reversed");
//         int i = sc.nextInt();
//         // System.out.println("Option entered is: "+i);
//         if (i == 1) {
//             p.tradPyramid(n);
//         } else if (i == 2) {
//             p.revPyramid(n);
//         } else {
//             System.out.println("Invalid input");
//         }
//         sc.close();
//     }
// }

// class Pyramid {
//     void tradPyramid(int x) {
//         System.out.println("Traditional pyramid is as follows: \n");
//         for (int i = 1; i <= x; i++) {
//             for (int j = 1; j <= x - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     void revPyramid(int y) {
//         System.out.println("Reverse pyramid is as follows: \n");
//         for (int i = 1; i <= y; i++) {
//             for (int j = 1; j <= i - 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



