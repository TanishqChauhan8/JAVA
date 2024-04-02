class SaddlePointFinder {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
		
        findSaddlePoints(matrix);
    }

    public static void findSaddlePoints(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
		int a[]=new int [rows];
        for (int i = 0; i < rows; i++) {
				int min=matrix[i][0];
            for (int j = 1; j < cols; j++) {
            
				if(matrix[i][j]<min)
					min=matrix[i][j+1];
               }
				a[i]=min;
			}
			
        int b[]=new int[cols];
		
        for(int j=0;j<cols;j++)
		{
			int max=matrix[0][j];
			for(int i=1;i<rows;i++)
			{
				if(matrix[i][j]>max)
				max=matrix[i][j];
			}
			b[j]=max;
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				System.out.println(a[i]);
			}
		}
		
	}
}
