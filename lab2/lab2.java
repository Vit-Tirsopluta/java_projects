package lab2;
public class lab2{

    public static void main(String[] args){

        System.out.println("\n-------task 1---------\n");
        
        char first_task[] = {'U','N','F','U',' ','I','K','N','I','T',' ','K','N','-','2','2',' ','C','S'};
        System.out.println(first_task);

        System.out.println("\n-------task 2---------\n");
        String sb_string = new String(first_task);
        String sb1 = new String(sb_string.substring(0, 17));
        System.out.println(sb1);
        
        System.out.println("\n-------task 3---------\n");
    
        String sb2 = "";
        for (int i = sb1.length() - 1; i >= 0; i--) {
            sb2 = sb2 + sb1.charAt(i);
        }
        System.out.println(sb2);

        System.out.println("\n-------task 4---------\n");

        String sb3 = sb1.toLowerCase();
        System.out.println(sb1);
        System.out.println(sb3);
        System.out.println(sb3.compareTo(sb1));
        System.out.println(sb3.equalsIgnoreCase(sb1));

        System.out.println("\n-------task 5---------\n");

        String sb4 = sb1.substring(5,10);
        System.out.println(sb4);

        System.out.println("\n-------task 6---------\n");

        String sb5 = sb1 + " " + sb3;
        System.out.println(sb5);

        System.out.println("\n-------task 7---------\n");

        System.out.println(sb1.indexOf('U'));
        System.out.println(sb1.lastIndexOf('U'));

        System.out.println("\n-------task 8---------\n");

        StringBuffer MyInfo = new StringBuffer("Morozko Vitalii Yiuriyouvich 30/09/2007");
        System.out.println(MyInfo);

        System.out.println("\n-------task 9---------\n");

        MyInfo = MyInfo.delete(29, 35);
        System.out.println(MyInfo);

        System.out.println("\n-------task 10---------\n");

        MyInfo = MyInfo.append(" Lviv");
        System.out.println(MyInfo);
        
        System.out.println("\n-------task 11---------\n");

        MyInfo = MyInfo.insert(33, " Man");
        System.out.println(MyInfo);

        System.out.println("\n-------task 12---------\n");

        int length = MyInfo.length();
        System.out.println(length);

        String MyInfoString = MyInfo.toString();
        byte[] bytes = MyInfoString.getBytes();
        System.out.println(bytes.length);

        System.out.println("\n-------task 13---------\n");

        MyInfo.setLength(28);
        System.out.println(MyInfo);

        System.out.println("\n-------task 14---------\n");
    
        String MyInfoSubString = MyInfoString.substring(0, 7);
        MyInfo = new StringBuffer(MyInfoSubString);
        MyInfo = MyInfo.reverse();
        System.out.println(MyInfo);
    }
}