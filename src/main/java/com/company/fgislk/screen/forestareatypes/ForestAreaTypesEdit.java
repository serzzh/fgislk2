package com.company.fgislk.screen.forestareatypes;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.ForestAreaTypes;

@UiController("ForestAreaTypes.edit")
@UiDescriptor("forest-area-types-edit.xml")
@EditedEntityContainer("forestAreaTypesDc")
public class ForestAreaTypesEdit extends StandardEditor<ForestAreaTypes> {
}