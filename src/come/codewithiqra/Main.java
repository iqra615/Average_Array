package come.codewithiqra;

public class Main {

    public static void main(String[] args) {
	double []array={3,4,5,6,7,8,9,344444,5,6,7,8,9,588,8,8,6,4,3,2,77,447};
	double total = 0;

	for (int i = 0; i<array.length; i++)
    {
        total = total+i;
    }
	double average = total/array.length;
        System.out.printf("The Average of:.%3f ", average);
    }
}
