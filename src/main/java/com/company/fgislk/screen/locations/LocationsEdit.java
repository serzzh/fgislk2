package com.company.fgislk.screen.locations;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.Locations;

@UiController("Locations.edit")
@UiDescriptor("locations-edit.xml")
@EditedEntityContainer("locationsDc")
public class LocationsEdit extends StandardEditor<Locations> {
}