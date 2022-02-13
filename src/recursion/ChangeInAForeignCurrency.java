package recursion;

public class ChangeInAForeignCurrency {

    public static void main(String[] args) {
        int target = 94;
        int arr[] = {5, 10, 25, 100, 200};
        System.out.println(new ChangeInAForeignCurrency().canGetExactChange(target, arr));

        int target_2 = 75;
        int arr_2[] = {4, 17, 29};

        System.out.println(new ChangeInAForeignCurrency().canGetExactChange(target_2, arr_2));
    }

    boolean canGetExactChange(int targetMoney, int[] denominations) {
        int pivot = -1;
        int counter = 0;

        if (targetMoney > denominations[denominations.length - 1]) {
            pivot = denominations.length - 1;
        } else {
            while (targetMoney > denominations[counter++]) pivot++;
        }

        return canGetExactChange(targetMoney, denominations, pivot);
    }

    boolean canGetExactChange(int targetMoney, int[] denominations, int pivot) {
        if (targetMoney < 0 || (targetMoney > 0 && targetMoney < denominations[0])) {
            return false;
        }

        if (targetMoney == 0) {
            return true;
        }

        if (targetMoney - denominations[pivot] >= 0) {
            targetMoney = targetMoney - denominations[pivot];
        } else {
            if (pivot > 0) pivot--;
        }
        return canGetExactChange(targetMoney, denominations, pivot);
    }
}
