public class Array3 {
    public static void main(String[] args) {
        int [] [] firstMatrix = {{1,2,3},{4,5,6},{1,1,1}};
        int [] [] secondMatrix = {{2,2,2},{3,3,3},{1,1,1}};
        int [] [] result = new int[3][3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("Result Matrix: ");
        printMatrix(result);
        public static void printMatrix(int[][] matrix){
                for(int[] row: matrix){
                    for(int column:row){
                        System.out.println(column +" ");
                    }
                    System.out.println();
                }
        }
    }
    
}
