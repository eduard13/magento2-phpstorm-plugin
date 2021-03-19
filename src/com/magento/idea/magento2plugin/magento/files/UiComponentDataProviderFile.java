/*
 * Copyright © Magento, Inc. All rights reserved.
 * See COPYING.txt for license details.
 */

package com.magento.idea.magento2plugin.magento.files;

import com.intellij.lang.Language;
import com.jetbrains.php.lang.PhpLanguage;
import com.magento.idea.magento2plugin.actions.generation.generator.util.NamespaceBuilder;
import org.jetbrains.annotations.NotNull;

public class UiComponentDataProviderFile implements ModuleFileInterface {

    public static final String TEMPLATE = "Magento UI Component Custom Data Provider Class";
    public static final String DIRECTORY = "Ui/DataProvider";
    public static final String FILE_EXTENSION = "php";
    public static final String CUSTOM_TYPE = "custom";
    public static final String COLLECTION_TYPE = "collection";
    public static final String DEFAULT_DATA_PROVIDER =
            "Magento\\Framework\\View\\Element\\UiComponent\\DataProvider\\DataProvider";
    public static final String SEARCH_RESULT_FACTORY =
            "Magento\\Ui\\DataProvider\\SearchResultFactory";
    private final String className;
    private NamespaceBuilder namespaceBuilder;

    /**
     * Ui Component data provider file constructor.
     *
     * @param className String
     */
    public UiComponentDataProviderFile(final @NotNull String className) {
        this.className = className;
    }

    /**
     * Get namespace builder for file.
     *
     * @param moduleName String
     * @param directory String
     *
     * @return String
     */
    public @NotNull NamespaceBuilder getNamespaceBuilder(
            final @NotNull String moduleName,
            final String directory
    ) {
        if (namespaceBuilder == null) {
            namespaceBuilder = new NamespaceBuilder(
                    moduleName,
                    className,
                    directory == null ? DIRECTORY : directory
            );
        }

        return namespaceBuilder;
    }

    @Override
    public String getFileName() {
        return String.format("%s.%s", className, FILE_EXTENSION);
    }

    @Override
    public String getTemplate() {
        return TEMPLATE;
    }

    @Override
    public Language getLanguage() {
        return PhpLanguage.INSTANCE;
    }
}
