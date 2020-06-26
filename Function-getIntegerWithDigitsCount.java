/*
INPUT:
991115
OUTPUT:
293115
*/
private static long getIntegerWithDigitsCount(int N) {
    String str=Integer.toString(N);
    String s="";
    int len=str.length();
    for(int i=0;i<len;i++)
    {
        int count=0,j;
        for(j=i;j<len;j++)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                count++;
            }
            else
            {
                break;
            }
        }
        s+=count;
        s+=str.charAt(i);
        i=j-1;
    }
    return Long.parseLong(s);

}
