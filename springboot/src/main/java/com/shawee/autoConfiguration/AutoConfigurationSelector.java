package com.shawee.autoConfiguration;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author Shawee
 * @Date 2023/11/6
 */
public class AutoConfigurationSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // ...Springboot默认的+第三方的jar包 自动配置类的名字

        // jars -->> /meta-inf/spring.factories
        return new String[0];

    }
}
