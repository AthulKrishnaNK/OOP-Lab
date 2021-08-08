public class Program8
{
    public static void main(String[] args)
    {
        int sum=0;
        int[] nums={10,15,28,44,50};
        for(int i: nums)
        {
            sum+=i;
        }
        System.out.println("Sum of all numbers : "+ sum);
        System.out.println("Average of all numbers : "+ (sum/5));

    }
}
