package com.company.fgislk.screen.usagedoc;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.UsageDoc;

@UiController("UsageDoc.browse")
@UiDescriptor("usage-doc-browse.xml")
@LookupComponent("usageDocsTable")
public class UsageDocBrowse extends StandardLookup<UsageDoc> {
}