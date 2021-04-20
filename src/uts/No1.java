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
public class No1 {
    public static void insertionsort(int[]A){
        for(int i=1;i<A.length;i++){
            int key=A[i];
            int j=i-1;
            while((j >=0)&&(A[j]>key)){
                
                A[j+1]=A[j];
                j--;
          
            }
             A[j+1]=key;
        }
       
    }
    public static void tampil(int data[]){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
    int[]A={3,10,4,2,8,13};
    No1.tampil(A);
    No1.insertionsort(A);
    No1.tampil(A);
        
    int cari=8;
    int awal=0;
    int akhir=A.length-1;
    int ketemu=0;
    int point=0;
    
        System.out.println("Isi data adalah: ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
       
        System.out.println("Masukan angka yang ingin di cari: ");
       
        while((awal<=akhir)&&(ketemu==0)){
            point=(awal+akhir)/2;
            System.out.println("Indeks pointer "+point);
            if(cari==A[point]){
                ketemu=1;
                System.out.println("Data "+ cari+ " telah di temukan pada index ke "+ point + " baris ke " + (point+1));
            }
            else if(cari<A[point]){
                System.out.println("Cari di kiri ");
                akhir=point-1;
            }
            else{
                awal=point+1;
                System.out.println("Cari di kanan ");
            }
        }
        if(ketemu==1){
            System.out.println("Data di temukan ");
            
        }
        else{
            System.out.println("Data tidak di temukan ");
        }
    
    
}
}
