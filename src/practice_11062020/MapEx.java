package practice_11062020;

import java.util.LinkedList;

public class MapEx {

    static LinkedList[] LinkedData = new LinkedList[10];

    static Student findStudentByID(int id) throws Exception {
        /*
         * 1. הפיכת מספר תעודת זהות למספר אחרי HASH 2. האם בכלל יש אובייקטים באותו
         * אינדקס 3. אם לא קיים- נחזיר NULL \EXCEPTION
         */
        int hashedNum = hashInt(id);
        if (LinkedData[hashedNum].size() < 0) {
            throw new Exception("no data in index");
        }

        for (int i = 0; i < LinkedData[hashedNum].size(); i++) {
            Student temp = (Student) LinkedData[hashedNum].get(i);
            if (temp.id == id) {
                return temp;
            }
        }
        throw new UnknownError("student not found on index");

    }

    static int hashInt(int id) {
        return id % 10;
    }

    public static void main(String[] args) {
        // String[] data = new String[10];
        // data[hashInt(199803)] = "Blhf";
        // System.out.println();
        for (int i = 0; i < LinkedData.length; i++) {
            LinkedData[i] = new LinkedList<Student>();
        }

        Student st2 = new Student("Lazy no.1", 152653);
        Student st1 = new Student("Blhf", 199803);

        LinkedData[hashInt(st1.id)].addFirst(st1);
        LinkedData[hashInt(st2.id)].addFirst(st2);

        try {
            findStudentByID(152653);

        } catch (UnknownError e) {
            System.out.println(e);
            // טיפול במקרה של סטודנט לא קיים בכלל אך יש מידע במערך
        } catch (Exception e) {
            System.out.println(e);
        }

        // Student[] data = new Student[10];
        /*
         * מקבלים מספר שיהיה המפתח 1 מצפינים את המפתח 1 מה שחוזר מההצפנה, אמור להיות
         * האינדקס במערך 1
         */
        // data[hashInt(st1.id)] = st1;

        // data[hashInt(st1.id)] = st1;
        System.out.println();
    }
}