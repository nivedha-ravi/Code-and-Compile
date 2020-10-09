/*
Example Input/Output 1:
Input:
5 5
p 6 q t =
] z 7 h *
t ) i e t
- - _ t *
t e t n s
Output: p6z7i
Explanation:
The navigated characters are highlighted below.
p 6 q t =
] z 7 h *
t ) i e t
- - _ t *
t e t n s
So p6z7i is printed as the output.
Example Input/Output 2:
Input:
6 7
q 9 8 w r T 7
1 U 0 6 I z R
p * W 7 g f x
m Q ) i 3 d I
j x 1 $ e 3 6
k 2 ) e ! 2 y
Output: q9U0W7i3e36y
*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt(),C=sc.nextInt();
		sc.nextLine();
		char[][] matrix=new char[R][C];
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        matrix[row][col]=sc.next().charAt(0);
		    }
		}
		int X=0,Y=0;
		while(X<R && Y<C){
		    System.out.print(matrix[X][Y]);
		    if(X<R-1 &&Character.isLetter(matrix[X+1][Y]))
		        X++;
		    else if(Y<C-1 && Character.isDigit(matrix[X][Y+1]))
		        Y++;
		    else
		        break;
		}
	}
}
