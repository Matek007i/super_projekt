package dzien0704.LaczenieStringow;


//konkatynacja
public class StringConcat {
    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder();
        for( int i = 0; i <100; i++){
            stringBuilder.append(i +" ");
        }
        String s = stringBuilder.toString();
        System.out.println(s);
    }


}
