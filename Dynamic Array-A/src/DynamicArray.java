
public class DynamicArray {
	private int[] data;
		public DynamicArray() 
		{
			data = new int[2];
			data[0] = (1);
			data[1] = (1);
		}
		
		public int getelement (int position)
		{
			if(position >=data.length)
			{
				return 0;
			}
			else			
			{
				return data[position];	
			}
		}
		
		public void putelement (int position, int value)
		{
			if (position >= data.length)
			{
				int newsize = 2 * data.length;
				if (position >= newsize)
				{
					newsize = 2 * position;
				}
				int[] newdata = new int [newsize];
				System.arraycopy(data, 0, newdata, 0, data.length);
				data=newdata;
				System.out.println("size of the dynamic array increases to" +newsize );
			}
			int num1 = data[position -1];
			int num2 = data[position -2];
			value = num1 + num2;
			data[position] = value;
		}

}
