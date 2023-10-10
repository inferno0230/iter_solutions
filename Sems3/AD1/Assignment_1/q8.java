/* Output MinMax Array from a input array.*/
public class q8 { 
    public static void main(String[] args) {
        
        int[] a={1,2,3,4,5};
        int[] temp=minmax(a);
        for (int i = 0; i < a.length; i++) {
             System.out.println(temp[i]);
        }
    }
 
    public static int[] minmax(int [] a){
        boolean flag=true;
        int start=0,end=a.length-1;
        int[] temp=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if(flag==true){
                temp[i]=a[start];
                start++;
            }
            else{
                temp[i]=a[end];
                end--;
            }
            flag=!flag; 
        } 
        return temp; 
    } 
}