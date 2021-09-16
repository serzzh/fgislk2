package com.company.fgislk.screen.forestarea;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.ForestArea;

@UiController("ForestArea.browse")
@UiDescriptor("forest-area-browse.xml")
@LookupComponent("forestAreasTable")
public class ForestAreaBrowse extends StandardLookup<ForestArea> {
}