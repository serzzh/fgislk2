package com.company.fgislk.screen.locations;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.Locations;

@UiController("Locations.browse")
@UiDescriptor("locations-browse.xml")
@LookupComponent("locationsesTable")
public class LocationsBrowse extends StandardLookup<Locations> {
}