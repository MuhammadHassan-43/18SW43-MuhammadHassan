class Test
{
String str = "a";  //Output=a;
void A()
{
try
{
str +="b"; //Here by calling constructor A It gives the value b to the str so Output=ab;
B();
}
catch (Exception e)
{
str += "c"; //The catch exception of constructor C is found in A according to Stack Rule so exception give value c to str so Output=abdec;
}
}
void B() throws Exception
{
try
{ str += "d"; // In constructor A, constructor B is called which give the value d to str means Output=abd;
C();
}
catch(Exception e)
{
throw new Exception();
}
finally
{
str += "e"; //In constructor B, constructor C is called  but there is no catch so fially will be executed first who give value e to str so Output=abde;
}
str += "f";
}
void C() throws Exception
{
throw new Exception();
}
void display()
{
System.out.println(str);
}
public static void main(String[] args)
{
Test object = new Test();
object.A();
object.display();
}
} 