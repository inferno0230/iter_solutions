import java.util.Scanner;

public class P1Q10 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int array[] = null;
        int choice = 0;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Create an array of N integers: ");
            System.out.println("2. Display the array elements: ");
            System.out.println("3. Insert an element at specific position: ");
            System.out.println("4. Delete an element at a given position: ");
            System.out.println("5. Exit: ");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch(choice){
                default:
                    System.out.println("Invalid input, Try again");

                case 1:
                    System.out.println("Enter the size of array: ");
                    int size = input.nextInt();
                    array = new int[size];
                    System.out.println("Array created");
                    break;

                case 2:
                    DisplayArray(array);
                    break;
                
                case 3:
                    System.out.println("Enter the position where you want to insert element: ");
                    int insert_pos = input.nextInt();
                    System.out.println("Enter the number which you want to insert: ");
                    int insert_num = input.nextInt();
                    insertElement(array,insert_pos,insert_num);
                    break;
                case 4:
                    System.out.println("Enter the position where you want to delete element: ");
                    int delete_pos = input.nextInt();
                    deleteElement(array,delete_pos);
                    break;

                case 5:
                    System.out.println("Exiting program.....");
            }


        } while(choice!=5);
        input.close();
    }

    public static void DisplayArray(int a[]){
        if(a==null){
            System.out.println("Array has not been created yet");
        } else {
            for (int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }

    public static void insertElement(int array[],int position,int num ){
        if((position-1>array.length || position-1 < 0 ) && array!=null){
            System.out.println("Invalid position");
        } else {
            if (array==null){
                System.out.println("Array has not been created yet");
            } else if (array[position-1]==0) {
                array[position-1]=num;
                System.out.println(num+" has been assigned at "+position+" in array");
            } else {
                System.out.println(position+" already has value in it.");
            }
        }
        
    }

    public static void deleteElement(int array[],int position){
        if((position-1>array.length || position-1 < 0 ) && array!=null){
            System.out.println("Invalid position");
        } else {
            if (array==null){
                System.out.println("Array has not been created yet");
            } else if (array[position-1]==0){
                System.out.println(position+" is already empty");
            } else if(array[position-1]!=0){
                int temp = array[position-1];
                array[position-1]=0;
                System.out.println(temp+" has been deleted"+position+" in array");
            }
        }
    }

}
