package bmi_calculator;
import java.util.Scanner;

public class BMI_Calculator {
  
    public static final double BMIUnderweight = 18.5;
    public static final double BMINormal = 24.9;
    public static final double BMIOver = 29.9;
    public static final double BMIObese = 30;
    
    public static void main(String[] args) 
    {
        int max = 100;
		
		String [] name = new String[100];
		int [] weight = new int[100];
		int [] height = new int[100];
		double [] BMI = new double[100];
                char input;
                int counter = 0;
    
                       
		

	int underWeight = 0;
	int normalWeight = 0;
	int overWeight = 0;
	int obese = 0;
	
		Scanner k = new Scanner(System.in);
		
		int i = 0;
		while (i < max)
		{
			System.out.println("Enter name");
			name [i] = k.next();
			
			System.out.println("Enter weight in pounds");
			weight [i] = k.nextInt();
			
			System.out.println("Enter height in inches");
			height [i] = k.nextInt();
                        
                        BMI[i] = weight[i] * 703/(height[i] * height[i]);
                        
			System.out.println("Enter Y for more inputs, N for no more inputs");
			input = k.next().charAt(0);
                        
                        
                        if(input == 'y')
                        {
                            i++;
                            counter++;
                            
                        }
                        else
                        {  
                            break;
                        }
                }
                i = 0;
                while(i <= counter)
                {
                    if (BMI [i] <= BMIUnderweight)
                    {
                        underWeight++;
                    }
                    else if (BMI [i] <=BMINormal)
                    {
                        normalWeight++;
                    }
                    else if (BMI [i] <=BMIOver)
                    {
                        overWeight++;        
                    }
                    else
                    {
                        obese++;
                    }
                    i++;
                }
                System.out.println("BMI Calculation and Analysis Report");
                
                i = 0;
                while(i <= counter)
                {
                    System.out.println( name[i]+" " + weight[i] + " "+height[i]+ " " +BMI[i] );
                    i++;
                    
                }
                System.out.println("Number of under weight people = " +underWeight);
                System.out.println("Number of normal weight people = " +normalWeight);
                System.out.println("Number of over weight people = " +overWeight);
                System.out.println("Number of obese people = " +obese);
                
    }
}

   
