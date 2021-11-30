package by.epam.http.repository.specification.impl;

import by.epam.http.entity.Cone;
import by.epam.http.repository.specification.ConeSpecification;

public class ConeIdRangeSpecification implements ConeSpecification {
    private final int toId;
    private final int fromId;

    public ConeIdRangeSpecification(int toId, int fromId) {
        this.toId = toId;
        this.fromId = fromId;
    }

    @Override
    public boolean specify(Cone cone) {
        return fromId <= cone.getConeId() && toId > cone.getConeId();
    }
}
