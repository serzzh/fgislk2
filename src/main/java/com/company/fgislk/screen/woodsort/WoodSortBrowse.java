package com.company.fgislk.screen.woodsort;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.WoodSort;

@UiController("WoodSort.browse")
@UiDescriptor("wood-sort-browse.xml")
@LookupComponent("woodSortsTable")
public class WoodSortBrowse extends StandardLookup<WoodSort> {
}