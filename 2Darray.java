 //Converting Two dimensional array into One dimensional in java 
import java.util.Scanner;
 class TwoDArray{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter rows"); 
       int rows=sc.nextInt();
     
       System.out.println("Enter colums"); 
       int columns=sc.nextInt();
     int[][] numbers=new int[rows][columns];
    //input
     for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
// System.out.println("Enter element at ["+i+"]"+"["+j+"]")           ;
            numbers[i][j]=sc.nextInt();
        }
 
     }
     //output
    
      //Converting 2d array into 1d array
    int index=0; 
    int[] a;
    int size;
    size=rows*columns;
    a=new int[size];
     for(int i=0;i<rows;i++){
      for(int j=0;j<columns;j++){   
    
     a[index]=numbers[i][j];
       index++;
      }
      
   }
   //2D
   System.out.println("2D Array:");
   for(int i=0;i<rows;i++){
    for(int j=0;j<columns;j++){
        System.out.print(numbers[i][j]+" ");
     
    }
    System.out.println();
  }
  //1D
  System.out.println("1D Array");
   for(int j=0;j<size;j++){
      System.out.print(a[j]+" ");
   
  }
    }
    

}
