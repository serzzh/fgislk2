package com.company.fgislk.screen.region;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.Region;

@UiController("Region.browse")
@UiDescriptor("region-browse.xml")
@LookupComponent("regionsTable")
public class RegionBrowse extends StandardLookup<Region> {
}