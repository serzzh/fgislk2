package com.company.fgislk.screen.region;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.Region;

@UiController("Region.edit")
@UiDescriptor("region-edit.xml")
@EditedEntityContainer("regionDc")
public class RegionEdit extends StandardEditor<Region> {
}