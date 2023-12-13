// public class IA_02_String {
//    public static void main(String[] args) {
//        int marks = 80;
//        String result = (marks > 75) ? "First Class" : ((marks >= 45) ? "Pass" : "Fail");
//        System.out.println(result);
//    }
// }



// class IA_02_String {
//    public static void main(String[] args) {
//        int n = 5; // The number of rows in the pattern

//        for (int i = 1; i <= n; i++) {
//            // Print the leading spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            // Print the vertical bars and spaces
//            for (int k = 1; k <= i; k++) {
//                System.out.print("| ");
//            }
//            // Move to the next line
//            System.out.println();
//        }
//    }
// }




// class IA_02_String {
//    public static void main(String[] args) {
//        int n = 5;

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("| ");
//            }
//            System.out.println();
//        }
//    }
// }




// class IA_02_String {
//    public static void main(String[] args) {
//        int n = 4;
//        int currentNumber = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(currentNumber + " ");
//                currentNumber++;
//            }
//            System.out.println();
//        }
//    }
// }




// class IA_02_String {
//    public static void main(String[] args) {
//        String word = "SITARE";
//        for (int i = 0; i < word.length(); i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(word.charAt(j) + " ");
//            }
//            System.out.println();
//        }
//    }
// }




// class IA_02_String {
//    public static void main(String[] args) {
//        int n = 10; // Number of Fibonacci numbers to print
//        int a = 0, b = 1;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(a + " ");
//                int sum = a + b;
//                a = b;
//                b = sum;
//            }
//            System.out.println();
//        }
//    }
// }




// class IA_02_String {
//    public static void main(String[] args) {
//        ArrayList<String> wordList = new ArrayList<>();

//        wordList.add("we");
//        wordList.add("are");
//        wordList.add("sitare");

//        StringBuilder sentenceBuilder = new StringBuilder();
//        for (String word : wordList) {
//            sentenceBuilder.append(word).append(" ");
//        }
//        String sentence = sentenceBuilder.toString().trim();

//        int vowelCount = 0;
//        int consonantCount = 0;

//        for (int i = 0; i < sentence.length(); i++) {
//            char ch = Character.toLowerCase(sentence.charAt(i));

//            if (ch >= 'a' && ch <= 'z') {
//                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                    vowelCount++;
//                } else {
//                    consonantCount++;
//                }
//            }
//        }

//        System.out.println("Sentence: " + sentence);
//        System.out.println("Vowel count: " + vowelCount);
//        System.out.println("Consonant count: " + consonantCount);
//    }
// }






// class practice6 {
//    public static void main(String[] args) {
//        HashMap<String, Integer> hashMap = new HashMap<>();

//        hashMap.put("soap", 20);
//        hashMap.put("oil", 100);
//        hashMap.put("shampoo", 200);
//        hashMap.put("water", 15);
//        hashMap.put("sanitizer", 50);

//        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
//        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
//                return entry1.getValue().compareTo(entry2.getValue());
//            }
//        });
//        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
//        for (Map.Entry<String, Integer> entry : entryList) {
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }
//        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
//            System.out.println(entry.getKey() +":"+entry.getValue());
//        }
//    }
// }



// class IA_02_String {
//    public static void main(String[] args) {
//        String name = "NAME";
//        for(int i = 0; i < name.length(); i++){
//            for(int j = 0 ; j <i ; j++){
//                System.out.print(" ");
//            }
//            System.out.println(name.charAt(i));
//        }
//        for(int t = name.length() - 2; t >= 0; t--){
//            for(int m = 0; m <t; m++){
//                System.out.print(" ");
//            }
//            System.out.println(name.charAt(t));
//        }
//    }
// }




// class IA_02_String {
//    public static void main(String[] args) {
// // Create a HashMap object called capitalCities
//        HashMap<String, String> capitalCities = new HashMap<String, String>();
// // Add keys and values (Country, City)
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norway", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities);
//        System.out.println(capitalCities.get("England"));
//        capitalCities.remove("England");
// //        capitalCities.clear();
//        System.out.println(capitalCities);
//        System.out.println(capitalCities.get("England"));
//        System.out.println(capitalCities.size());


//        for (String i : capitalCities.keySet()) {
//            System.out.println(i);
//        }
// // Print values
//        for (String i : capitalCities.values()) {
//            System.out.println(i);
//        }
// // Print keys and values
//        for (String i : capitalCities.keySet()) {
//            System.out.println("key: " + i + " value: " + capitalCities.get(i));
//        }
//    }
// }



// class IA_02_String {
//    public static void main(String args[]) {
//        HashMap<Integer, String> hm = new HashMap<Integer, String>();
//        hm.put(100, "Amit");
//        hm.put(101, "Vijay");
//        hm.put(102, "Rahul");
//        System.out.println("Initial list of elements:");
//        for (int i : hm.keySet()) {
//            System.out.println(i + " " + hm.get(i));
//        }
//        System.out.println("Updated list of elements:");
//        hm.replace(102, "Gaurav");
//        for (int i : hm.keySet()) {
//            System.out.println(i + " " + hm.get(i));
//        }
//        System.out.println("Updated list of elements:");
//        hm.replace(101, "Vijay", "Ravi");
//        for (int i : hm.keySet()) {
//            System.out.println(i + " " + hm.get(i));
//        }
//        System.out.println("Updated list of elements:");
//        hm.replaceAll((k, v) -> "Ajay");
//        for (int i : hm.keySet()) {
//            System.out.println(i + " " + hm.get(i));
//        }
//    }
// }


//class HashMapExample2{
//    public static void main(String args[]){
//        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
//        map.put(1,"Mango"); //Put elements in Map
//        map.put(2,"Apple");
//        map.put(3,"Banana");
////        map.put(1,"Grapes"); //trying duplicate key
//        map.put(4,"Banana");
//
//        System.out.println("Iterating Hashmap...");
//        for(int i : map.keySet()){
//            System.out.println(i+" "+map.get(i));
//        }
//    }
//
//class StringExample{
//    public static void main(String args[]){
//        String s1="java";//creating string by Java string literal
//        char ch[]={'s','t','r','i','n','g','s'};
//        String s2=new String(ch);//converting char array to string
//        String s3=new String("example");//creating Java string by new keyword
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//    }}


//class FactorialHCFRecursion {
//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
//
//    public static int hcf(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return hcf(b, a % b);
//    }
//
//    public static void main(String[] args) {
//        int num1 = 48;
//        int num2 = 60;
//        int hcfResult = hcf(num1, num2);
//        int factorialResult = factorial(hcfResult);
//        System.out.println("Factorial of HCF of " + num1 + " and " + num2 + " is " + factorialResult);
//    }
//}

//class NestedForExample {
//    public static void main(String[] args) {
////loop of i
//        for(int i=1;i<=3;i++){
////loop of j
//            for(int j=1;j<=3;j++){
//                System.out.println(i+" "+j);
//            }//end of i
//        }//end of j
//    }
//}


//class PyramidExample {
//    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();//new line
//        }
//    }
//}

// class PyramidExample2 {
//     public static void main(String[] args) {
//         int term=6;
//         for(int i=1;i<=term;i++){
//             for(int j=term;j>=i;j--){
//                 System.out.print(j);
// //                System.out.print("* ");
//             }
//             System.out.println();//new line
//         }
//     }
// }
