import java.util.Scanner;
class Q3{
    static void simulateTrafficSignal(int cycles){
        int state=0;
        for(int i=0;i<cycles;i++){
            switch(state){
                case 0:
                    System.out.println("Red - Stop");
                    break;
                case 1:
                    System.out.println("Green - Go");
                    break;
                case 2:
                    System.out.println("Yellow - Prepare to stop");
                    break;
            }
            state=(state+1)%3;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cycles=sc.nextInt();
        simulateTrafficSignal(cycles);
    }
}
