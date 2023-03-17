package Oop.Abstraction.Interface.Assignment.AssignmentGenerics;

public class AdditionTest implements Summer<Integer>{


    @Override
    public Integer addInt(Integer num1, Integer num2) {
        return num1+num2;
    }
}
