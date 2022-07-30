
public class Main {
    public static void main(String[] args) {
        // 8 Primitive Data Types

        byte age = 30;
        // This can store [-128,127] and takes 1byte of memory
        short count = 30000;
         // This can store [-32k,32k] and takes 2 bytes of memory
        int views = 1000000; 
        // This can store [-2B,2B] and takes 4 bytes of memory
        long viewCount = 3123456789L; 
        // This takes 8 bytes and we can store even larger number
        float price = 1.0F;
         // This can store number with decimal point and takes 4 bytes of memory
        double price2 = 12.34233; 
        // This can store number with more decimal point and takes 8 bytes of memory
        char letter = 'L';
        // This can store a single character and takes 2 bytes of memory
        boolean isTrue = true;
        // This stores true or false and takes 1 bytes
        System.out.println(age);
        System.out.println(count);
        System.out.println(views);
        System.out.println(viewCount);
        System.out.println(price);
        System.out.println(price2);
        System.out.println(letter);
        System.out.println(isTrue);
    }
}
