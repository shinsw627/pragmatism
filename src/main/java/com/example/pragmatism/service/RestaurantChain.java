package com.example.pragmatism.service;

import java.util.List;

public class RestaurantChain implements Calculable{
    private List<Calculable> stores;

    @Override
    public long calculateRevenue() {
        long revenue = 0;
        for (Calculable store : stores) {
            revenue += store.calculateRevenue();
        }
        return revenue;
    }

    @Override
    public long calculateProfit() {
        long income = 0;
        for (Calculable store : stores) {
            income += store.calculateProfit();
        }
        return income;
    }
}
