public class Main {
    public static void main(String[] args){
        String message = "Hello World";
        //String is a refernece type
        String combineStr = "Hello World" + "2022";
        //You can combine 2 String with plus operator
        
        System.out.println("Message: "+ message);
        System.out.println(combineStr);

        //Methods
        boolean endsWith = message.endsWith("d");
        //this checks the string ends with a d(user given) or not return a boolean value
        int msgLength = message.length();
        //Returns length of the string
        int index = message.indexOf("l");
        //return index of "l" in a string starts with 0
        System.out.println(endsWith);
        System.out.println(msgLength);
        System.out.println(index);
        System.out.println(message.replace("l", "p"));
    }
}
