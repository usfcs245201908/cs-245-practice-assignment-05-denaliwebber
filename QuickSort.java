public class QuickSort implements SortingAlgorithm
{

	public void sort(int [] a)
	{
		qs(a, 0, a.length-1);
	}

	private void qs(int [] a, int left, int right)
	{
		if (left<right)
		{
			int p = partition(a, left, right);
			qs(a, left, p-1);
			qs(a, p+1, right);
		}

	}

	private void swap(int [] a, int x, int y)
	{
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	private int partition(int [] a, int left, int right)
	{
		int pivot = a[right];
		int i = (left-1);
		for (int j=left; j<right; j++)
		{
			if (a[j]<pivot)
			{
				i++;
				swap(a, i, j);
			}
		}

		swap(a, i+1, right);

		return i+1;
	}

}