//Abstract class
abstract class Book {
    String title;
    //Abstract method
    abstract void setTitle(String s);
    
    //Concrete method
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    //Define abstract method
    public void setTitle(String s) {
        title = s;
    }
}

public class Activity5 {
    
    public static void main(String []args) {
        String title = "Heli hogu karana";
        //Create object for MyBook
        Book novel = new MyBook();
        //Set title
        novel.setTitle(title);
        
        //Print result
        System.out.println("The title is: " + novel.getTitle());
    }
}