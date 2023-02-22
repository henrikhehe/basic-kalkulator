public class CalculatorClass {
    String val;
    boolean left=true;
    String operation = "";
    CalculatorClass(){
        val = "";
    }
    
    void addInteger(int x){
        val+=Integer.toString(x);

    }
    void addString(String x){
        val+=x;

    }
    boolean getBool(){
        return left;
    }
    void swapBool(){
        if(left){
            left=false;
        }
        else{
            left=true;
        }
    }
    void setOperation(String op){
        operation=op;
    } 
    String getOp(){
        return operation;
    }
    String getVal(){
        return val;
    }
    void setVal(String x){
        val=x;
    }
    void reset(){
        val="";
    }

    //multiply divide etc
}
