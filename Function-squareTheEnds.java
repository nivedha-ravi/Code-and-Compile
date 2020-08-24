/*
Example Input/Output 2:
Input:
5000
Output:
25000
Example Input/Output 3:
Input:
123
Output:
129
*/
public static int squareTheEnds(int N){
    String s=Integer.toString(N);
    String st="";
    int first=Character.getNumericValue(s.charAt(0));
    st+=(first*first);
    st+=s.substring(1,s.length()-1);
    int unit=Character.getNumericValue(s.charAt(s.length()-1));
    st+=(unit*unit);
    return Integer.parseInt(st);
}
