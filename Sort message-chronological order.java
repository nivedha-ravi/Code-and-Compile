/*
Example Input/Output 1:
Input: 4
A 07:32:21 u can upload first
A 07:32:30 then you can tag
A 07:33:10 please ping me once it is done.
B 07:32:41 okay
Output:
A:u can upload first
A:then you can tag
B:okay
A:please ping me once it is done.
Explanation:
The first message u can upload first was sent at 07:32:21.
The second message then you can tag was sent at 07:32:30.
The third message please ping me once it is done was sent at 07:33:10.
The fourth message okay was sent at 07:32:41.
After sorting the 4 messages in chronological order, the order of the messages become 1, 2, 4 and 3.
Hence the output is
A:u can upload first
A:then you can tag
B:okay
A:please ping me once it is done.
Example Input/Output 2:
Input: 5
A 12:15:29 hey are you there?
B 12:59:55 bye see you later
A 12:45:13 have you done the work?
B 12:30:16 yes
B 12:45:59 yes i have completed
Output:
A:hey are you there?
B:yes
A:have you done the work?
B:yes i have completed
B:bye see you later
Example Input/Output 3:
Input: 6
A 15:17:03 SURE
B 15:16:46 Can we go for a movie?
B 15:15:54 are you free this weekend?
A 15:15:24 Hi, B!
A 15:16:17 I think so, why?
B 15:13:03 HELLO, A!
Output:
B:HELLO, A!
A:Hi, B!
B:are you free this weekend?
A:I think so, why?
B:Can we go for a movie?
A:SURE
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        String b[]=new String[n];
        String c[]=new String[n];
        String d;
        for(int i=0;i<n;i++){
            d="";
            String str[]=sc.nextLine().split(" ");
            a[i]=str[0];
            b[i]=str[1];
            for(int j=2;j<str.length;j++){
                d+=str[j]+" ";
            }
            c[i]=d;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(b[i].compareTo(b[j])>0){
                    String t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                    String t1=a[i];
                    a[i]=a[j];
                    a[j]=t1;
                    String t2=c[i];
                    c[i]=c[j];
                    c[j]=t2;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+":"+c[i]);
        }
	}
}
