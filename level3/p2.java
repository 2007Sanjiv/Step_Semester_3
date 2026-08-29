import java.util.Scanner;
class Q2{
    static void atmPinRetry(String correctPin,String[] attempts){
        int count=0;
        boolean success=false;
        while(count<attempts.length&&count<3&&!success){
            if(attempts[count].equals(correctPin)){
                success=true;
                System.out.println("PIN accepted");
                break;
            }
            count++;
        }
        if(!success){
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String correctPin=sc.next();
        int n=sc.nextInt();
        String[] attempts=new String[n];
        for(int i=0;i<n;i++){
            attempts[i]=sc.next();
        }
        atmPinRetry(correctPin,attempts);
    }
}
