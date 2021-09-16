package com.company.fgislk.screen.oiv;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.OIV;

@UiController("OIV.browse")
@UiDescriptor("oiv-browse.xml")
@LookupComponent("oIVsTable")
public class OIVBrowse extends StandardLookup<OIV> {
}