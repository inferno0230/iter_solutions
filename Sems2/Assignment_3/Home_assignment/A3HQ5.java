package Sems2.Assignment_3.Home_assignment;
/* In the Towers of Hanoi puzzle, we are given a platform with three pegs, a, b, and c, sticking 
out of it. On peg  a is a stack of n disks, each larger than the next, so that the smallest is on 
the  top  and  the  largest  is  on  the  bottom.  The  puzzle  is  to  move  all  the  disks  from  peg  a  to 
peg  c,  moving  one  disk  at  a  time,  so  that  we  never  place  a  larger  disk  on  top  of  a  smaller 
one.  See  Figure  1  for  an  example  of  the  case  n  =  4.  Write  a  recursive  program  using  Java 
for solving the Towers of Hanoi puzzle for arbitrary n. (Hint: Consider first the sub problem 
of  moving  all  but  the  nth  disk  from  peg  a  to another peg using the third as “temporary 
storage.”)  */

import java.util.Scanner;

public class A3HQ5 {
    static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();
        input.close();
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
