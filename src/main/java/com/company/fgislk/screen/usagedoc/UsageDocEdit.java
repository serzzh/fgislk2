package com.company.fgislk.screen.usagedoc;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.UsageDoc;

@UiController("UsageDoc.edit")
@UiDescriptor("usage-doc-edit.xml")
@EditedEntityContainer("usageDocDc")
public class UsageDocEdit extends StandardEditor<UsageDoc> {
}