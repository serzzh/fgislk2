package com.company.fgislk.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "FOREST_AREA")
@Entity
public class ForestArea {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "CODE", nullable = false)
    @NotNull
    private String code;

    @NotNull
    @JoinColumn(name = "REGION_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Region region;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @NotNull
    @JoinColumn(name = "TYPE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private ForestAreaTypes type;

    @NotNull
    @Column(name = "LEVEL_", nullable = false)
    private Integer level;

    @JoinColumn(name = "UPPER_AREA_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ForestArea upperArea;

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ForestArea getUpperArea() {
        return upperArea;
    }

    public void setUpperArea(ForestArea upperArea) {
        this.upperArea = upperArea;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getLevel() {
        return level;
    }

    public ForestAreaTypes getType() {
        return type;
    }

    public void setType(ForestAreaTypes type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}