package maths.pure.algebra.linear.matrix;

// Maritsalar ustida amallar bajarish uchun
public final class Matrix {

    // Berilgan matritsani transponerlanganini topadi
    public static double[][] transposeMatrix(double[][] matrix){
        double[][] matrix2=new double[matrix[0].length][matrix.length];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                matrix2[j][i]=matrix[i][j];
            }
        }
        return matrix2;
    }


// Berilgan 2 ta matritsani ko'paytirib natija qaytaradi
    public static double[][] multiplyMatrix(double[][] first,double[][] second){
        double[][] result=new double[first.length][second[0].length];

        for (int row = 0; row <result.length ; row++) {

            for (int col = 0; col <result[row].length ; col++) {
                result[row][col]=multiplyMatrixCell(first,second,row,col);
            }

        }
        return result;
    }

    // "multiply" funksiyasiga yordamchi funksiya
    private static double multiplyMatrixCell(double[][] first,double[][] second, int row, int col){
        double cell=0;
        for (int i = 0; i <second.length ; i++) {

            cell+=first[row][i]*second[i][col];

        }
        return cell;
    }


}
