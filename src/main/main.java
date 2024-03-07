package main;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
public class main {
     public static void main (String args[]) {
    	 Scanner sc = new Scanner(System.in);
    	 Random rand = new Random();
    	 int[] a = new int[1001];
    	 int n = Integer.parseInt(JOptionPane.showInputDialog("Nhap n: ")), d = 0, ti=0;
    	 String tmp = new String();
    	 /*for (int i=0;i<n;i++) {
    		 a[i] = Integer.parseInt(JOptionPane.showInputDialog("Nhap phan tu thu " + i + ": "));
    	 }*/
    	 String strarr = JOptionPane.showInputDialog("Nhap day: "); 
    	 strarr = strarr + ' ';
    	 while (ti<strarr.length()) {
    		 if (strarr.charAt(ti)==' ') {
    			 a[d]=Integer.valueOf(tmp);
    			 d++;
    			 tmp="";
    		 }
    		 else tmp=tmp+strarr.charAt(ti);
    		 ti++;
    	 }
    	 for (int i=0;i<n;i++) {
    		 int j=rand.nextInt(n);
    		 int temp=a[i];
    		 a[i]=a[j];
    		 a[j]=temp;
    	 }
    	 String str = new String();
    	 for (int i=0;i<n;i++) {
    		 str = str + String.valueOf(a[i]) + " ";
    	 }
    	 JOptionPane.showMessageDialog(null, str);
    	 System.exit(0);
     }
     
}
