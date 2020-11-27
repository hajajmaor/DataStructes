package practice_13112020;
public class practice {

    public static void main(String[] args) {
        int [] arr= { 2, 3, 4, 10, 40,50,60,80,90,700,1500,32100 };
//        int len =arr.length;

//        System.out.println(arr[7]);
    /*    int i=0;
        while (i<arr.length){
            if (arr[i] == 30) {
                System.out.println("the num 30 is in the place "+ i);
            }
            i++;
        }*/

        // n = גודל המערך
        // O(n)
        for (int i =0; i <arr.length; i++){
            if (arr[i] == 30) {
                System.out.println("the num 30 is in the place "+ i);
            }
        }

       /*
       for(int num :arr){
            if(num==30)
                System.out.println("");
        }
        */


    }
}
