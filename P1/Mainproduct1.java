class product
{
   int p_code;
   String p_name;
   int p_price;
   product(int code,String name,int price)
   {
      p_code=code;
      p_name=name;
      p_price=price;
   }
   void display()
   {
     System.out.println("The product Code:"+p_code);
     System.out.println("The product Name:"+p_name);
     System.out.println("The product Price:"+p_price);
   }
}
class Mainproduct1
{
   public static void main(String args[])
   {
      product obj1=new product(1,"Pen",10);
      product obj2=new product(2,"Pencil",5);
      product obj3=new product(3,"Book",30);
      System.out.println("The Product with Lowest Price:\n");
      if(obj1.p_price<obj2.p_price)
      {
         if(obj1.p_price<obj3.p_price)
         {
            obj3.display();
         }
         else
         {
            obj1.display();
         }
      }
      else if(obj3.p_price<obj2.p_price)
      {
          obj3.display();
      }
      else
      {
          obj2.display();
      }
    }
}
