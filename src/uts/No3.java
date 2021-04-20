/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class No3 {
    public static void main(String[] args) {
        
        int i,j,m,n;
        int matriks[][]=new int[10][10];
        int transpose[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukan jumlah baris matriks A");
        m=sc.nextInt();
        System.out.println("Masukan jumlah kolom matriks A");
        n=sc.nextInt();
        System.out.println("Masukan element matriks A");
        
 
             
         for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                matriks[i][j]=sc.nextInt();
               
            }
            
           
         
            
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                transpose[j][i]=matriks[i][j];
                
            }
             
        }
        System.out.println("Hasil transpose matriks A");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(transpose[i][j]+ "\t");
            }
            System.out.println( );
        }
         int a,b,c,d;
        int ma[][]=new int[10][10];
        int t[][]=new int[10][10];
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan jumlah baris matriks B");
        m=sc.nextInt();
        System.out.println("Masukan jumlah kolom matriks B");
        n=sc.nextInt();
        System.out.println("Masukan element matriks B");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                matriks[i][j]=sc.nextInt();
               
            }
          
             
         
            
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                transpose[j][i]=matriks[i][j];
                
            }
             
        }
        System.out.println("Hasil transpose matriks B");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(transpose[i][j]+ "\t");
            }
            System.out.println( );
        }
    }
    
}
