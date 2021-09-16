package com.company.fgislk.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "USAGE_DOC")
@Entity
public class UsageDoc {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "DOC_NUM", nullable = false)
    @NotNull
    private Integer docNum;

    @JoinColumn(name = "WAREHOUSE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Locations warehouse;

    @JoinColumn(name = "CONTRACT_ITEM_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private ContractItem contractItem;

    @NotNull
    @Column(name = "QUANTITY", nullable = false)
    private Long quantity;

    @NotNull
    @JoinColumn(name = "MEASURE_UNIT_ID", nullable = false)
    @OneToOne(optional = false)
    private MeasureUnits measureUnit;

    public Integer getDocNum() {
        return docNum;
    }

    public void setDocNum(Integer docNum) {
        this.docNum = docNum;
    }

    public void setMeasureUnit(MeasureUnits measureUnit) {
        this.measureUnit = measureUnit;
    }

    public MeasureUnits getMeasureUnit() {
        return measureUnit;
    }

    public Locations getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Locations warehouse) {
        this.warehouse = warehouse;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public ContractItem getContractItem() {
        return contractItem;
    }

    public void setContractItem(ContractItem contractItem) {
        this.contractItem = contractItem;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}