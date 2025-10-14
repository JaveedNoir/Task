package evoAnnotationTask;

public class NumberComparator <T extends Number>{
    public Number findMax (T num1, T num2){
        if(num1.doubleValue() > num2.doubleValue()){
            return num1;
        } else if (num1.doubleValue() < num2.doubleValue()) {
            return num2;
        }else {
            return 0;
        }
    }

    public Number findMin (T num1, T num2){
        if(num1.doubleValue() < num2.doubleValue()){
            return num1;
        }else if (num1.doubleValue() > num2.doubleValue()) {
            return num2;
        }
        return 0;
    }
}
