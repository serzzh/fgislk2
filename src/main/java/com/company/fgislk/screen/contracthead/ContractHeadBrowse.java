package com.company.fgislk.screen.contracthead;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.ContractHead;

@UiController("ContractHead.browse")
@UiDescriptor("contract-head-browse.xml")
@LookupComponent("contractHeadsTable")
public class ContractHeadBrowse extends StandardLookup<ContractHead> {
}