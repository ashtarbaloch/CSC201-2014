import java.util.Scanner;

public class ScoreCalculator {

    Scanner in=new Scanner(System.in);
	public float inputValidScore()
	{
		return in.nextFloat();
	}
	public float[] inputAllScores()
	{
		float[] scores=new float[7];
		for(int i=0;i<7;i++)
		{
			System.out.print("Judge #");
			System.out.print(i+1);
			System.out.print(" score ");
			scores[i]=inputValidScore();
		}		
		return scores;
	}
	public float inputValidDegreeOfDifficulty()
	{
		System.out.print("Degree of difficulty ");
		return in.nextFloat();
	}
	public float calculateScore(float[] scores,float diff)
	{
		float min=100,max=-1;
		int min_i=-1,max_i=-1;
		int i;
		for(i=0;i<7;i++)
		{
			if(scores[i]<min)
			{
				min=scores[i];
				min_i=i;
			}
			if(scores[i]>max)
			{
				max=scores[i];
				max_i=i;
			}
		}
		float sum=0;
		for(i=0;i<7;i++)
		{
			if(i==min_i||i==max_i)continue;
			sum+=scores[i];
		}
		sum*=diff;
		sum*=0.6;
		return sum;
	}
	public static void main(String args[]) 
	{
		ScoreCalculator sc=new ScoreCalculator();
		float diff=sc.inputValidDegreeOfDifficulty();
		float[] scores=sc.inputAllScores();
		float final_score=sc.calculateScore(scores, diff);
		System.out.print("The final score is ");
		System.out.println(final_score);
	}
}
