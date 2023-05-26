package Sems2.Assignment_3;

class Box<T> {
    private T contents;
    
    public Box(T contents) {
        this.contents = contents;
    }
    
    public T getContents() {
        return contents;
    }
    
    public void setContents(T contents) {
        this.contents = contents;
    }
}

public class A3Q6 {
    public static void main(String[] args) {
        // Create a boxed String object
        Box<String> stringBox = new Box<>("Hello");
        
        // Create two variables that refer to the stringBox
        Box<String> box1 = stringBox;
        Box<String> box2 = stringBox;
        
        // Change the contents of box1
        box1.setContents("World");
        
        // Verify the effect on box2
        System.out.println(box2.getContents());  // Output: World
        
        // Create a boxed Integer object
        Box<Integer> integerBox = new Box<>(10);
        
        // Create two variables that refer to the integerBox
        Box<Integer> box3 = integerBox;
        Box<Integer> box4 = integerBox;
        
        // Change the contents of box3
        box3.setContents(20);
        
        // Verify the effect on box4
        System.out.println(box4.getContents());  // Output: 20
        
        // Create a boxed Object object
        Box<Object> objectBox = new Box<>(new Object());
        
        // Determine what happens if you put a string in the objectBox
        objectBox.setContents("Hello");
        String content1 = (String) objectBox.getContents();  // Type casting required
        
        // Determine what happens if you put an integer in the objectBox
        objectBox.setContents(42);
        Integer content2 = (Integer) objectBox.getContents();  // Type casting required
        
        System.out.println(content1);  // Output: Hello
        System.out.println(content2);  // Output: 42
    }
}

