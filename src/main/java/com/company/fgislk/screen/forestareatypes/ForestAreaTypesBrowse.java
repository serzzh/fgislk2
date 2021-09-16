package com.company.fgislk.screen.forestareatypes;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.ForestAreaTypes;

@UiController("ForestAreaTypes.browse")
@UiDescriptor("forest-area-types-browse.xml")
@LookupComponent("forestAreaTypesesTable")
public class ForestAreaTypesBrowse extends StandardLookup<ForestAreaTypes> {
}