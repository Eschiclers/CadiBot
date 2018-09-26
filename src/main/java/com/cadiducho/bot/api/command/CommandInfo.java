package com.cadiducho.bot.api.command;

import com.cadiducho.bot.api.module.Module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotación para construir los parámetros de un {@link BotCommand}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandInfo {

    /**
     * {@link com.cadiducho.bot.api.module.Module} al que pertenece el comando
     * @return Módulo al que pertenece el comando
     */
    Class<? extends Module> module() default Module.class;

    /**
     * Lista de alias por las que ese comando se puede ejecutar
     * @return lista de alias
     */
    String[] aliases();
}