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
    } 
}
