public class School {
    int rollno;
    String name;
    int stardard;
    static String Principal;//principal is same for all students

    static {//when you load a class it loads
        Principal = "Brij Mohan";//assinging the principal
    }
    School(){//default values for variables if user didn't pass the values to constructor
        rollno = 0;
        name = null;
        stardard = 0;
    }
    School(String name,int stardard,int rollno){//when you create a object
        this.name = name;//assinging the variables that out of this constructor by this keyword
        this.stardard = stardard;
        this.rollno = rollno;
    }
    void printing(){//method for printing variables
        System.out.println("Name:" + name);
        System.out.println("Roll No:" + rollno);
        System.out.println("Standard:" + stardard);
        System.out.println("Principal:" + Principal);
        System.out.println("-------------------");
    }
}
