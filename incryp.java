package codes;

import java.util.Random;

public class incryp{
private String msg;
private String code;
private int rn;

    public int getRn() {
        return rn;
    }

    public void setRn() {
        this.rn =0;
        Random r=new Random();
        rn=1000+r.nextInt(9999);


    }

    public incryp() {


        this.msg ="";
        this.code="";
    }
    public String getMsg() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        char ch;
        int l = msg.length();

        for (int i = 0; i < l; i++) {
            ch = msg.charAt(i);
            int p= cry(ch,rn);
            int d= digit(p);
            code=code+String.valueOf(d)+String.valueOf(p);
        }
        System.out.println(code);
    }
    static int cry(char i,int rn) {
        int r=sum(rn);
        int p=(int)(i);

        p=r*p;
        return p;

    }
    static int digit(int n) {
        int d=0;
        while (n > 0) {
            n = n / 10;
            d++;
        }
        return d;
    }
    static int sum(int n) {
        int d=0,s=0;
        while (n > 0)
        {
            d=n%10;
            s=s+d;
            n = n / 10;
        }
        return s;
    }


    static void decry(String code,int rn)
    {
        int l=code.length();String msg="";
       int dr=sum(rn);
        for(int i=0;i<l;i++)
        {  char ch=code.charAt(i);
            String dig="";
            dig=dig+ch;
            int d=Integer.parseInt(dig);
            String pr=code.substring(i+1,i+d+1);
            int p=Integer.parseInt(pr);
            p=p/dr;
            char c=(char)p;
            msg=msg+c;
            i=i+d;
        }
        System.out.println("With your key and encrypted code we decrypt the msg as =' "+msg+"'");
    }
}
