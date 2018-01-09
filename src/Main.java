import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char[] tmp=str.toCharArray();
        int[] a=new int[26];
        int[] A=new int[26];
        int count=0;
        for(int i=0;i<tmp.length;i++)
        {
            if(tmp[i]>='a'&&tmp[i]<='z')
                a[tmp[i]-'a']++;
            if(tmp[i]>='A'&&tmp[i]<='Z')
                A[tmp[i]-'A']++;
            if(tmp[i]==' ')
                count++;
        }
        System.out.println(count+1);
        for(int i=0;i<26;i++)
        {
            if(a[i]!=0)
                System.out.printf("%c:%d\n",'a'+i,a[i]);
        }
        for(int i=0;i<26;i++)
        {
            if(A[i]!=0)
                System.out.printf("%c:%d\n",'A'+i,A[i]);
        }
    }
}
