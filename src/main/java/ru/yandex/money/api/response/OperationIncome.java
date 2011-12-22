package ru.yandex.money.api.response;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class OperationIncome implements Serializable {
    private static final long serialVersionUID = -8037413891091982716L;

    private Collection<OperationDetailResponse> list;

    private Long lastOperation;

    public OperationIncome(Collection<OperationDetailResponse> list, Long maxOperation) {
        this.lastOperation = maxOperation;
        this.list = list;
    }

    public Long getLastOperation() {
        return lastOperation;
    }

    public void setLastOperation(Long lastOperation) {
        this.lastOperation = lastOperation;
    }

    public Collection<OperationDetailResponse> getList() {
        return list;
    }

    public void setList(List<OperationDetailResponse> list) {
        this.list = list;
    }
}
