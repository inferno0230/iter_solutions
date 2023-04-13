package Sems2.Assignment_1.Home_Assignment;

public class A1QH4 {
    public static void main(String[]args){
        double a[][] = {{1,1,1},{1,1,1},{1,1,1},{1,1,1}};
        double b[][] = {{1,1,1},{1,1,1},{1,1,1},{1,1,1}};

        int rows = a.length;
        int cols = a[0].length;
        
        if (rows != b.length || cols != b[0].length) {
            System.out.println("Matrices must have the same dimensions");
        } else {
            double c[][] = addMatrix(a, b);
            for(double x[]:c){
                for(double y:x){
                    System.out.print((float)y+"\t");
                }
                System.out.println();
            }

        }

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        
        
        double[][] sum = new double[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        
        return sum;
    }
    
}
