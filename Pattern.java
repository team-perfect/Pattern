
import java.util.Scanner;

public class Pattern {
  

   
    public static void main(String[] args) {
        int lines,space,curLine,no;
        no=1;
        System.out.println("enter the number of lines for pattern");
        Scanner sc=new Scanner(System.in);
        lines=sc.nextInt();
       
        for(curLine=1 ; curLine<=lines  ; curLine++ )
        {  
            for(space=(lines-curLine); space>=0 ;space--)
            {
                
               if(curLine==1)
               {
                for(int i=0;i<space;i++)
                {
                    System.out.print(" ");
                }
                  
                System.out.print(no);
                  
                break;
                }
                else
                {
                 for(int i=0;i<space;i++)
                 {
                
                     System.out.print(" ");
                 }
                 for( ;no<curLine*curLine;no++){
                     
                       System.out.print(  no + " ");
                    
               
                 }
                   
                } 
                
               
            }
            System.out.println("");
            
        }
    }
    
}
