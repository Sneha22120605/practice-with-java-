import java.util.Arrays;

class exercise33{
    public static void main(String[] args){
        int my_array1[] = { 1789, 4567, 9876, 2004, 2005, 2012, 2022, 1819, 10000, 10000 };
        String my_array2[] = { "Java, Python, MYSQL, C Programming, C++, PHP, Python , Javascripy"};
        System.out.println("Original numeric array :"  + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));
        System.out.println("Original string array :" + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array :" + Arrays.toString(my_array2));
    }
}