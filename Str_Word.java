import java.util.Scanner;

class Program26
{
    public static void main(String arg[])
    {
        Scanner  sobj=new Scanner(System.in);

        System.out.println("Please Enter the String:");
       
        String str=sobj.nextLine();

        String Arr[]=str.split(" ");
        System.out.println("Number of words are:"+Arr.length); //length of string

        System.out.println("Words from the String are:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }

    }
}