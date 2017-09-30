package io.github.aarvedahl;

import java.util.List;

public interface IView {

    void welcome(List<String> list);

    int getInput();

    void amountSoldBeverages();

    void showProfit(int pastryProfit, double beverageProfit);

    void showExpenses(double expenses);

    void showTotal();

    void notEnoughTime();
}
