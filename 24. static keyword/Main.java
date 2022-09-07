public class Main {
    public static void main(String[] args){
        //The static variable can be used to refer to the common property of all objects (which is not unique for each object)
        //Example the company name of employees, college name of students, etc.
        //The static variable gets memory only once in the class area at the time of class loading.

        //Here created a class of school and school has Students and his rollno,standard and name(Unique) but the principal of all stundents is same for all
        School Lakshay = new School("Lakshay Kamat",12,18);
        School Aamir = new School();//empty object

        Lakshay.printing(); // Useing printing method to print the all variables
        Aamir.printing();
    }
}
