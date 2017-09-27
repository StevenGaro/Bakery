package io.github.aarvedahl;

import java.util.List;

public interface IView {

    void welcome(List<String> list);

    int getInput();

    void amountSoldBeverages();

    void showProfit(int profitFromPastry, double profitFromBeverage);

    void showFee(double fee);

    void showTotal();

    void notEnoughTime();
}
