package arrays_problems;

public class ElementSearch {

	public static void main(String[] args) {
		boolean isExist=false;
		int arr[]= {10,20,50,5,6,80};
		int num=10;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				isExist=true;
				break;
			}
		}
		if(isExist)
			System.out.println(num+ " yes the number is exist in the array");
		else
			System.out.println("No the number is not exist in the array");

	}

}
