import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sequencegenarator{
public static List<Integer> generateSequence(int n){

List<Integer>sequence= new ArrayList<>();
int value = 1;
int increment = 1;

for (int i=0; i<n; i++){
sequence.add(value);
value+=increment;
increment++;
}
 return sequence;
}

public static void main (String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter n value");
int n= scanner.nextInt();

List<Integer> result = generateSequence(n);
System.out.println(result);


}
}