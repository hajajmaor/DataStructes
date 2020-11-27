package practice_13112020;

public class FindMax {
    public static void main(String[] args) {
        int [] arr={156,1561,5649,15261,8484,156,484,645,48}; //1
        /*
        סשה:
        ממיינים את המערך מהקטן לגדול
        מוציאים את המספר האחרון (אינדקס אחרון

        ליאור:
        מגדירים משתנה עזר
        לולאה שרצה על כל המערך
        המספר באינדקס יותר גדול מהמשתנה עזר
        אז מחליפים
         */

        // O(n)
        int max=arr[0]; //2
        int min=arr[0]; //3


 // 6 = int i=1
        for (int i =1;i<arr.length;i++) {
            // השוואת מקסימום
            if (arr[i] > max) //1
                max = arr[i]; //2
            else
            // השוואת מינימום
                if (arr[i] < min) //3
                    min = arr[i]; //4
        }




        System.out.println(max); //4
        System.out.println(min); //5
    }
    //sub-total : (6*n)+6
    // total : 6N ~O(n)


}
