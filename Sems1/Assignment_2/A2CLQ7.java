public class A2CLQ7 {
    public static void main(String[]args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        if(x<0||y<0||z<0){
            System.out.println("Negative numbers are not allowed");
        } else {
            if (y*z>=x || x*y>=z || x*z>=y){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
