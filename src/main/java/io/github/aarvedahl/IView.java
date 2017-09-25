package io.github.aarvedahl;

import java.util.List;

public interface IView {

    void welcome(List<String> list);

    int getInput();

    void showProfit(int profit);

    void showFee(double fee);

    void showTotal();

    void notEnoughTime();
}
