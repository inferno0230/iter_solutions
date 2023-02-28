public class A2HCLQ2 {
    public static void main(String[]args){
        double radius = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        System.out.println((Math.PI*radius*radius)+(2*Math.PI*radius*height));
    }
}
