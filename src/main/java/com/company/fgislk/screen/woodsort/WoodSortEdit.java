package com.company.fgislk.screen.woodsort;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.WoodSort;

@UiController("WoodSort.edit")
@UiDescriptor("wood-sort-edit.xml")
@EditedEntityContainer("woodSortDc")
public class WoodSortEdit extends StandardEditor<WoodSort> {
}