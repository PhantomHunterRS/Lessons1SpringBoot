package ru.springboot.model.mapper;

import org.springframework.stereotype.Service;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * PHANTOMHUNTER
 **/
@Service
public class CustomMapperFactory implements FactoryBean<MapperFactory> {
    @Override
    public MapperFactory getObject() {
        return new DefaultMapperFactory.Builder()
                .constructorResolverStrategy(null)
                .build();
    }
    @Override
    public Class<?> getObjectType() {
        return MapperFactory.class;
    }
    @Override
    public boolean isSingleton() {
        return true;
    }
}
