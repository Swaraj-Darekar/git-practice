public class Pattern6
{
public static void main(String args[])
{
for(int i=1;i<=4;i++)
{
for(int k=1;k>4;k++)
{
System.out.print(" ");
}
for(int j=4;j>=i;j--)
{
System.out.print((char)(i-70));

}
System.out.println();
}



}
}