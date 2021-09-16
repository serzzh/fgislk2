package com.company.fgislk.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "ContractHead")
@Entity
public class ContractHead {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Composition
    @OneToMany(mappedBy = "contractHead")
    private List<ContractItem> contractItems;

    @InstanceName
    @Column(name = "CONTRACT_NUMBER", nullable = false)
    @NotNull
    private String contract_number;

    @Column(name = "CONTRACT_NAME", nullable = false)
    @NotNull
    private String contract_name;

    @NotNull
    @JoinColumn(name = "OIV_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private OIV oiv;

    @NotNull
    @JoinColumn(name = "BP_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private BusinessPartner businessPartner;

    @Column(name = "CONTRACT_DATE", nullable = false)
    @NotNull
    private LocalDate contract_date;

    public void setBusinessPartner(BusinessPartner businessPartner) {
        this.businessPartner = businessPartner;
    }

    public List<ContractItem> getContractItems() {
        return contractItems;
    }

    public void setContractItems(List<ContractItem> contractItems) {
        this.contractItems = contractItems;
    }

    public BusinessPartner getBusinessPartner() {
        return businessPartner;
    }

    public BusinessPartner getBp() {
        return businessPartner;
    }

    public void setBp(BusinessPartner businessPartner) {
        this.businessPartner = businessPartner;
    }

    public String getContract_number() {
        return contract_number;
    }

    public void setContract_number(String contract_number) {
        this.contract_number = contract_number;
    }

    public LocalDate getContract_date() {
        return contract_date;
    }

    public void setContract_date(LocalDate contract_date) {
        this.contract_date = contract_date;
    }


    public OIV getOiv() {
        return oiv;
    }

    public void setOiv(OIV oiv) {
        this.oiv = oiv;
    }

    public String getContract_name() {
        return contract_name;
    }

    public void setContract_name(String contract_name) {
        this.contract_name = contract_name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}