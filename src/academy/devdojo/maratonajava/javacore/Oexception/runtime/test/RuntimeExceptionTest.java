package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        // Checked -> Exceptions que ocorrem em tempo de compilacao
        // Unchecked -> Não checadas, exceptions que ocorrem em tempo de execucao.

        int[] nums = {1,2};

        System.out.println(nums[2]);
    }
}
