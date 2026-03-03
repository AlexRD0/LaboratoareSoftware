package lab1;

public class Main {
    public static void main(){
        String s="";
        for(char i='a';i<='z';i++)
            s = s+i;
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        String[] array = s.split("(?=[aeiou])");
        for(int i=0;i<5;i++)
            System.out.println(array[i]);
    }
}
