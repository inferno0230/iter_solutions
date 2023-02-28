/* 
Assume a string variable ruler1 contains “1” initially i.e. String ruler1=”1” Write a java
program to print the following output using string concatenation. (You can take extra string
variables)
1
121
1213121
121312141213121
 */
public class A1Q10 {
	public static void main(String[] args) {
		String r1 = "1";
		System.out.println(r1);
        String r2 = r1+"2"+r1;
		System.out.println(r2);
		String r3 = r2+"3"+r2;
		System.out.println(r3);
		String r4 = r3+"4"+r3;
		System.out.println(r4);
	}
}