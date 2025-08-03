package Problem_Solving;

public class OrangesAppleGCD {

    public static int getGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int orange = 2;
        int apple = 4;
        int contestant = getGCD(orange, apple);
        System.out.println(contestant);
    }
}
