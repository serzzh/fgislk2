package com.company.fgislk.screen.contractitem;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.ContractItem;

@UiController("ContractItem.browse")
@UiDescriptor("contract-item-browse.xml")
@LookupComponent("contractItemsTable")
public class ContractItemBrowse extends StandardLookup<ContractItem> {
}