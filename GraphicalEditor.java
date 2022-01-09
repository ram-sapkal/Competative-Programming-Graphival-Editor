package com.company;

import java.util.*;
public class GraphicalEditor {
    public static String arr[][],temp,temp1;
    public static int i,j,k,x1,y1,x2,y2,m,n;
    public static char input;

    public static void  fillColor(String nc,String oc){
        for (i = 0; i < arr.length; i++) {
            for ( j = 0; j < arr[i].length; j++) {
                if(arr[i][j].equals(oc)){
                    arr[i][j]=nc;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        input = sc.next().charAt(0);
        temp= sc.nextLine();
        while (input !='X') {
                switch (input) {
                    case 'I' :
                               m = Character.getNumericValue(temp.charAt(1));
                               n = Character.getNumericValue(temp.charAt(3));
                               arr = new String[n][m];
                               for (String [] row : arr){
                                   Arrays.fill(row,"0");
                               }
                               break;
                    case 'L' :i = Character.getNumericValue(temp.charAt(1));
                              j = Character.getNumericValue(temp.charAt(3));
                             temp1 = temp.charAt(5)+"";
                             arr[j-1][i-1]=temp1;
                             break;
                    case 'C':for (String[] row : arr){
                                 Arrays.fill(row,"0");
                             }
                             break;
                    case 'V':i = Character.getNumericValue(temp.charAt(1));
                             y1 = Character.getNumericValue(temp.charAt(3));
                             y2 = Character.getNumericValue(temp.charAt(5));
                             temp1 = temp.charAt(7)+"";
                             for(int l=y1-1;l<y2;l++)
                             {
                                 arr[l][i-1]=temp1;
                             }
                             break;
                    case 'H': x1 = Character.getNumericValue(temp.charAt(1));
                              x2 = Character.getNumericValue(temp.charAt(3));
                              k=Character.getNumericValue(temp.charAt(5));
                              temp1 = temp.charAt(7)+"";
                              for(int l=x1-1;l<x2;l++)
                              {
                                 arr[k-1][l]=temp1;
                              }
                              break;
                    case 'K':x1 = Character.getNumericValue(temp.charAt(1));
                             y1 = Character.getNumericValue(temp.charAt(3));
                             x2 = Character.getNumericValue(temp.charAt(5));
                             y2 = Character.getNumericValue(temp.charAt(7));
                             temp1 = temp.charAt(9)+"";
                             for(int m=x1-1;m<x2;m++){
                                for(int n=y1-1;n<y2;n++){
                                    arr[m][n]=temp1;
                                }
                             }
                             break;
                    case 'F':x1 = Character.getNumericValue(temp.charAt(1));
                             y1 = Character.getNumericValue(temp.charAt(3));
                             temp1 = temp.charAt(5)+"";
                             String Old_color=arr[y1][x1];
                             fillColor(temp1,Old_color);
                             break;
                    case 'S':
                             System.out.println(temp);
                             for (i = 0; i < arr.length; i++) {
                                 for (int j = 0; j < arr[i].length; j++) {
                                        System.out.print(arr[i][j]);
                                 }
                            System.out.println();
                            }
                            break;
                }
            input = sc.next().charAt(0);
            temp= sc.nextLine();
            }
    }
}
