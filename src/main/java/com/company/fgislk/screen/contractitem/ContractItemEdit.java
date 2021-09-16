package com.company.fgislk.screen.contractitem;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.ContractItem;

@UiController("ContractItem.edit")
@UiDescriptor("contract-item-edit.xml")
@EditedEntityContainer("contractItemDc")
public class ContractItemEdit extends StandardEditor<ContractItem> {
}