
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student st = new Student(); 
         st.name = "Arpit";
         st.address = "Rohini, Delhi";
         st.rollNumber = 19;
         System.out.println(st.name + st.address + st.rollNumber + " " + st.standard);

         // Heap mai String pool krke chizz hoti hai joh string pool mai ek br aajata hai usse wapis se store nhi krte sidha yahhi se reference dete hai
         String x = "RAM";
         String a = new String(x); // ye ek object create krta hai usme value daalta hai aur variable mai uska reference store hota hai
         String b = new String(x);
         String c = "RAM";
         String d = "RAM";

         System.out.println(a == b);
         System.out.println(c == d);

         System.out.println("this is c " + c);
         System.out.println("this is d " + d);
         c = "XYZ"; 
         System.out.println("this is c " + c);
         System.out.println("this is d " + d);

         String temp = "aRPIT";
         String temp1 = "ARPIT";
         int n = temp.length();
         char ch = temp.charAt(n - 1);
         System.out.println(temp.equals(temp1));
         System.out.println(temp.equalsIgnoreCase(temp1));
         System.out.println(temp.equalsFoldCase(temp1));

         String str1 = "remote";
         String str2 = "remate";

         int i = str2.compareTo(str1);
         System.out.println(i);
         System.out.println(str1.compareToIgnoreCase(str2));

         String name = "Arpit mandhan  ";
         System.out.println(name.substring(6, 12));
         System.out.println(name.toLowerCase());
         System.out.println(name.toUpperCase());
         System.out.println(name.trim());
         System.out.println(name.replace('n', 'A'));
         System.out.println(name.contains("A"));
         System.out.println(name.startsWith("AM"));
         System.out.println(name.endsWith("AM"));
         System.out.println(name.substring(2,7));
         System.out.println(name.subSequence(2,7));

    } 

}
