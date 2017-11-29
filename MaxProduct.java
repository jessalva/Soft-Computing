/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxproduct;

import java.util.Scanner;

/**
 *
 * @author jessal
 */
public class MaxProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double mat1[][]=new double[n][n];
        double mat2[][]=new double[n][n];
        double mat3[][]=new double[n][n];
        for(int mat1_i=0;mat1_i<n;mat1_i++)
        {
            for(int mat1_j=0;mat1_j<n;mat1_j++)
            {
                mat1[mat1_i][mat1_j]=sc.nextDouble();
            }
         }
        for(int mat2_i=0;mat2_i<n;mat2_i++)
        {
            for(int mat2_j=0;mat2_j<n;mat2_j++)
            {
                mat2[mat2_i][mat2_j]=sc.nextDouble();
            }
         }
        double max;
        for(int mat_i=0;mat_i<n;mat_i++)
        {
            for(int mat_j=0;mat_j<n;mat_j++)
            {
                max=mat1[mat_i][0]*mat2[0][mat_j];
                for(int mat_k=0;mat_k<n;mat_k++)
                {
                    if(max>mat2[mat_k][mat_j]*mat1[mat_i][mat_k])
                    {
                        continue;
                    }
                    if(mat2[mat_k][mat_j]*mat1[mat_i][mat_k]>max)
                    {
                        max=mat2[mat_k][mat_j]*mat1[mat_i][mat_k];
                    }
                }
                mat3[mat_i][mat_j]=max;
            }
         }
        for(int mat2_i=0;mat2_i<n;mat2_i++)
        {
            for(int mat2_j=0;mat2_j<n;mat2_j++)
            {
                System.out.print(mat3[mat2_i][mat2_j]+"    ");
            }
            System.out.println("");
         }
    }
    }
