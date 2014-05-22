import java.util.*;
public class TemperatureCalculator {
    Scanner in=new Scanner(System.in);
	
	public String[] month={"January","February","March","April","May",
			"June","July","August","September","October",
			"November","December"};
	public void inputTempForMonth(int i_month,int[][] temperature)
	{
		System.out.print(month[i_month]);
		System.out.print(" has a High of ");
		temperature[i_month][0]=in.nextInt();
		System.out.print(" and Low of ");
		temperature[i_month][1]=in.nextInt();
	}
	public int[][] inputTempForYear()
	{
		int[][] temp_year = new int[12][2];
		int i;
		for(i=0;i<12;i++)
		{
			inputTempForMonth(i,temp_year);			
		}
		return temp_year;
	}
	public float calculateAverageHigh(int[][] temperature)
	{
		int i;
		float avg=0;
		for(i=0;i<12;i++)
		{
			avg+=temperature[i][0];
		}
		avg/=12;
		return avg;
	}
	public float calculateAverageLow(int[][] temperature)
	{
		int i;
		float avg=0;
		for(i=0;i<12;i++)
		{
			avg+=temperature[i][1];
		}
		avg/=12;
		return avg;		
	} 
	public int findHighestTemp(int[][] temperature)
	{
		int i;
		int max=-1;
		int i_max=-1;
		for(i=0;i<12;i++)
		{
			if(temperature[i][0]>max)
			{
				max=temperature[i][0];
				i_max=i;
			}
		}
		return i_max;			
	} 
	public int findLowestTemp(int[][] temperature)
	{
		int i;
		int min=1000000;
		int i_min=-1;
		for(i=0;i<12;i++)
		{
			if(temperature[i][1]<min)
			{
				min=temperature[i][1];
				i_min=i;
			}
		}
		return i_min;			
	} 
	public static void main(String args[]) 
	{
		TemperatureCalculator tc=new TemperatureCalculator();
		int[][] temp_year=tc.inputTempForYear();
		float avg_high=tc.calculateAverageHigh(temp_year);
		float avg_low=tc.calculateAverageLow(temp_year);
		int i_high=tc.findHighestTemp(temp_year);
		int i_low=tc.findLowestTemp(temp_year);
		System.out.print("The average high temperature is ");
		System.out.println(avg_high);
		System.out.print("The average low temperature is ");
		System.out.println(avg_low);
		System.out.print("The highest temperature is ");
		System.out.print(temp_year[i_high][0]);
		System.out.print(" at ");
		System.out.println(tc.month[i_high]);
		System.out.print("The lowest temperature is ");
		System.out.print(temp_year[i_low][1]);
		System.out.print(" at ");
		System.out.println(tc.month[i_low]);
	}
}
