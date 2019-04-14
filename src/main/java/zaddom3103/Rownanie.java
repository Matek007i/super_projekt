package zaddom3103;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rownanie {
    private int a;
    private int b;
    private int c;

    public int calculate(){
        return a*a + b*b + (int) Math.pow(c, 4);
    }

    public boolean isHigher(int a ){
        return calculate() > a;
    }
}
