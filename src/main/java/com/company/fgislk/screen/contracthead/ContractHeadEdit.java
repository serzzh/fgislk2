package com.company.fgislk.screen.contracthead;

import io.jmix.ui.screen.*;
import com.company.fgislk.entity.ContractHead;

@UiController("ContractHead.edit")
@UiDescriptor("contract-head-edit.xml")
@EditedEntityContainer("contractHeadDc")
public class ContractHeadEdit extends StandardEditor<ContractHead> {
}