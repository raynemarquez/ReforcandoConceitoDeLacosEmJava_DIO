public class Exercicio2 {
    public static void main(String[] args) {
        for (int i =1; i <=14;i++){
            if (i%2==0) {
                if (i==12) break;
                System.out.println(i);
            }
        }
        int count=1;
        while(count<=14){
            if (count%2==0) {
                if (count==12) break;
                System.out.println(count);
            }
            count++;
        }
    }
}
