package com.switchfully.eurder.domain.security;


import java.util.List;

public enum Role {
    CUSTOMER(Feature.CREATE_ORDER), ADMIN(Feature.CREATE_ITEM, Feature.GET_ALL_CUSTOMERS,Feature.GET_CUSTOMER_BY_ID, Feature.UPDATE_ITEM);

    private final List<Feature> features;

    Role(Feature... features) {
        this.features = List.of(features);
    }

    public boolean hasFeature(Feature feature) {
        return this.features.contains(feature);
    }
}
