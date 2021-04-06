package com.magento.idea.magento2plugin.actions.generation.generator.util.eav;

import com.magento.idea.magento2plugin.actions.generation.data.EavEntityDataInterface;
import com.sun.istack.NotNull;

import java.util.List;

public interface AttributeMapperInterface {
    public List<String> mapAttributesByEntityData(@NotNull EavEntityDataInterface entityData);
}
