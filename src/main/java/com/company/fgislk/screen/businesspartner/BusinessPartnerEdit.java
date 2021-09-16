package com.company.fgislk.screen.businesspartner;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.BusinessPartner;

@UiController("BusinessPartner.edit")
@UiDescriptor("business-partner-edit.xml")
@EditedEntityContainer("businessPartnerDc")
public class BusinessPartnerEdit extends StandardEditor<BusinessPartner> {
}