import java.util.Scanner;
public class DivisiblePairs {
    
        // TODO: Read n and k
        // TODO: Read array elements
        // TODO: Count pairs (i, j) such that i < j and (arr[i] + arr[j]) % k == 0
        // TODO: Print the count
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count=0;
            int arr[] = new int[n];

            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                        if(arr[i]<arr[j])
                        {
                                if((arr[i]+arr[j])%k==0)
                                {
                                        count++;
                                }
                        }
                }
            }System.out.println(count);
        }
}