package ru.sberbank.jd.lesson02;
/**
 * Класс для определения наибольшего общего делителя двух целых чисел.
 */
public class NodImpl implements Nod {
    public static void main(String[] args) {
        NodImpl test = new NodImpl();
        System.out.println(test.calculate(60,-30));
    }

    @Override
    public int calculate(int first, int second) {

        int maxDivisor;
        /* Проверки на нулевые значения */
        if(first == 0){
            if(second == 0){
                throw new ArithmeticException("На ноль делить нельзя!");
            }else{
                maxDivisor = second;
            }
        }else if(second == 0){
            maxDivisor = first;
        }else{
            /* Алгоритм вычисления НОД */
            int firstNum = Math.abs(first);
            int secondNum = Math.abs(second);
            while(firstNum !=0 && secondNum !=0){
                if(firstNum > secondNum){
                    firstNum %= secondNum;
                }else{
                    secondNum %= firstNum;
                }
            }
            maxDivisor = firstNum + secondNum;

        }

        
        return maxDivisor;
    }
}
