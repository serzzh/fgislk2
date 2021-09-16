package com.company.fgislk.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "ContractItem")
@Entity
public class ContractItem {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @NotNull
    @Column(name = "EXT_NUM", nullable = false)
    private Integer extNum;

    @Composition
    @OneToMany(mappedBy = "contractItem")
    private List<UsageDoc> usageDocs;

    @JoinColumn(name = "FOREST_AREA_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ForestArea forestArea;

    @JoinColumn(name = "WOOD_SORT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private WoodSort woodSort;

    @Column(name = "LIMIT_", nullable = false)
    @NotNull
    private Double limit;

    @NotNull
    @JoinColumn(name = "CONTRACT_HEAD_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private ContractHead contractHead;

    @NotNull
    @JoinColumn(name = "MEASURE_UNIT_ID", nullable = false)
    @OneToOne(optional = false)
    private MeasureUnits measureUnit;

    public void setExtNum(Integer extNum) {
        this.extNum = extNum;
    }

    public Integer getExtNum() {
        return extNum;
    }

    public void setMeasureUnit(MeasureUnits measureUnit) {
        this.measureUnit = measureUnit;
    }

    public MeasureUnits getMeasureUnit() {
        return measureUnit;
    }

    public List<UsageDoc> getUsageDocs() {
        return usageDocs;
    }

    public void setUsageDocs(List<UsageDoc> usageDocs) {
        this.usageDocs = usageDocs;
    }

    public ForestArea getForestArea() {
        return forestArea;
    }

    public void setForestArea(ForestArea forestArea) {
        this.forestArea = forestArea;
    }

    public void setContractHead(ContractHead contractHead) {
        this.contractHead = contractHead;
    }

    public ContractHead getContractHead() {
        return contractHead;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public WoodSort getWoodSort() {
        return woodSort;
    }

    public void setWoodSort(WoodSort woodSort) {
        this.woodSort = woodSort;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}