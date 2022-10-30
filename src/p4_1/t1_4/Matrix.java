package p4_1.t1_4;

import java.util.ArrayList;

public class Matrix {

    private int stolbs;
    private int stroks;
    private ArrayList<ArrayList<Double>> arrMatrix;
    private Double[][] matrix;

    public Matrix(int stolbs, int stroks /*, String[] stoka*/) {

        this.stolbs = stolbs;
        this.stroks = stroks;

        this.matrix = new Double[stroks][stolbs];

        for (int i = 0; i < stroks; i++) {
            for (int j = 0; j < stolbs; j++) {
                matrix[i][j] = ((double) ((int) (Math.random() * 100 * 100)) / 100.0);
            }
        }
    }

    public void display() {
        System.out.println();
        for (int i = 0; i < this.stroks; i++) {
            for (int j = 0; j < this.stolbs; j++) {
                System.out.printf(/*"[" +*/ String.format("%1$10.2f", matrix[i][j]) /*+ "] "*/);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void addMatrix(Matrix m) {
        for (int i = 0; i < this.stroks; i++) {
            for (int j = 0; j < this.stolbs; j++) {
                this.matrix[i][j] += m.matrix[i][j];
            }
        }
    }

    public void doubleNaMatrix(double k) {
        for (int i = 0; i < this.stroks; i++) {
            for (int j = 0; j < this.stolbs; j++) {
                this.matrix[i][j] *= k;
            }
        }
    }

    public Matrix multMatrix(Matrix m) {

        int z = this.stolbs;

        Matrix res = null;
        if (this.stolbs == m.stroks && this.stolbs > this.stroks) {
            res = new Matrix(this.stroks, m.stolbs);
            int c1 = 0, c2 = 0;
            double sum = 0;
            while (c1 < this.stroks) {
                while (c2 < this.stroks) {
                    for (int i = c1, j = c2; i < this.stroks && j < m.stolbs; j++) {
                        sum = 0;
                        for (int k = 0; k < z; k++) {
                            sum += this.matrix[i][k] * m.matrix[k][j];
                        }
                        res.matrix[c1][c2] = sum;
                        c2++;
                    }
                }
                c1++;
                c2 = 0;
            }
        return res;
        }
        else {
            System.out.print("\nUnable to multiply\n");
            return new Matrix(0, 0);
        }

    }

}
