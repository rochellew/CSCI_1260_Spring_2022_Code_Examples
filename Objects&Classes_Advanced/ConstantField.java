/**
 * This class demonstrates a constant field value
 */
public class ConstantField {

    // constant field value MUST be initialized at declaration
    // OR in your constructor(s)
    private final int CONSTANT_INT;

    public ConstantField(){
        CONSTANT_INT = 1;
    }

    public ConstantField(int fieldValue){
        CONSTANT_INT = fieldValue;
    }
}
