package basicprogram;

public class PrintNumberWithoutForLoop {
		public static void PrintNum(int num)
		   {
		     if(num<=10)
		       {
		         System.out.println(num+ " ");
		         PrintNum(num+1);
		       }
		   }
		  public static void main(String args[])
		    {
		    int n=1;
		    PrintNum(n);  
		    }
	}
