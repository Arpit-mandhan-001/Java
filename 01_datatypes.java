
class Main {
    public static void main(String[] args) {
        // Primitive data type

        // Numeric Type
        // Integer type
        // 1. Int(32 bit signed integer, -2,147,483,648 to 2,147,483,647)
        int age = 20;
        System.out.println("My age is " + age);
        System.out.println("My age is " + age + age + "this is my final age");

        // 2. byte(1 byte, -128 to 127)
        byte age1 = 127;
        System.out.println("this is age1" + age1);

        // 3. short(16 bit signed integer, -32,768 to 32,767)
        short height = 2000;
        System.out.println(height);
        System.out.println("this is my height" + height);

        // 4. long(64 bit signed integer, ±9.22e18)
        long token = 1582749579;
        System.out.println("this is long token" + token);
        
        // floating type 
        // 1. float(32 bit floating integer, ~6–7 digits precision)
        float random_number = 1.34323f;
        System.out.println("this is random number" + random_number);

        // 2. Double(64 bit floating point, ~15–16 digits precision)
        double pi = 3.145768678789;
        double token1 = 1e9;
        System.out.println("the value of pi is " + pi);
        System.out.println("the token value is " + token1);

        // Non-Numeric type
        // boolean(true / false)
        boolean flag = true;
        System.out.println("this is flag" + flag);
        flag = false;
        System.out.println("this is flag value after changing" + flag);

        // char(16-bit Unicode character)
        char grade = '@';
        System.out.println("this is grade " + grade);

        // Non-primitive data type
        // String
        String str = "hello world this is my first program, this is going to be my first program please if there is any mistake tell me";
        System.out.println("this is String Data type" + str);

        // Array
        int[] array = {1,2,3,4,5,6,6,7,8,9,10};
        System.out.println(array[0] + "this" + array[1] + array[2] + array[3] + array[10] + array[5]); // this is act like string becuz of "this" and everything will be treated as string then concatinated as string
        System.out.println(array[0] + array[1] + array[2] + array[3] + array[10] + array[5]); // in this it is treated number and everything is added.

        
    } 
}
