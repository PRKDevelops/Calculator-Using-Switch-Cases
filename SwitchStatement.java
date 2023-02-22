import java.util.*;
public class SwitchStatement {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A :-");
	int A = sc.nextInt();
	System.out.println("Enter B :-");
	int B = sc.nextInt();
	System.out.println("Enter Operator :-");
	char Operator = sc.next().charAt(0);
	switch (Operator){ //Switch Cases
	case '+' : System.out.println(A+B);
	break;
	case '-' : System.out.println(A-B);
	break;
	case '*' : System.out.println(A*B);
	break;
	case '/' : System.out.println(A/B);
	break;
	case '%' : System.out.println(A%B);
	break;
	default : System.out.println("Wrong Operator");
	}
}
}
