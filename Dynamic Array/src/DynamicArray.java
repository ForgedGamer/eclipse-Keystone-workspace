
public class DynamicArray {
	private int[] data;
		public DynamicArray() 
		{
			data = new int[1];
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
			data[position] = value;
		}

}
