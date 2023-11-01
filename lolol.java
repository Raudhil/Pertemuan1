public class lolol{
    public static void main(String[] args) {
        
        int [] a = new int [3];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        for(int j = 0; j < a.length; j++){
            a[j] = j + 4;
        }

        System.out.println(" ");
        
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}