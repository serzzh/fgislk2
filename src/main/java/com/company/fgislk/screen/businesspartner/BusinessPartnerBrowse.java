package com.company.fgislk.screen.businesspartner;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.BusinessPartner;

@UiController("BusinessPartner.browse")
@UiDescriptor("business-partner-browse.xml")
@LookupComponent("businessPartnersTable")
public class BusinessPartnerBrowse extends StandardLookup<BusinessPartner> {
}