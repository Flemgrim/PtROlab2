public class Matrix {
    private int size;
    int [][] data;
    public Matrix(int size){
        this.size = size;
        for (int i = 0; i <= size; i++)
            for (int j = 0; j <= size; j++)
                data[i][j] = (int)Math.random() * 5;
    }
}
