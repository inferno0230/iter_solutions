public class A2CLQ5 {
    public static void main(String[]args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        int max = Math.max(Math.max(x,y),Math.max(y,z));
        int min = Math.min(Math.min(x,y),Math.min(y,z));

        System.out.println(max);
        System.out.println(min);
    }
}
