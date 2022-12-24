package com.example.inyecciondependenciastaller.di

import com.example.inyecciondependenciastaller.model.Agenda
import com.example.inyecciondependenciastaller.model.Contacto
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/****
 * Project: InyeccionDependenciasTaller
 * From: com.example.inyecciondependenciastaller.di
 * Created by: Victor Sanjines Lopez on 23/12/2022 at 19:45
 * More info: www.relativity.com.bo
 * All rights reserved 2022
 ****/
@Module
@InstallIn(SingletonComponent::class)
class AgendaModule {
    //aqui creas los diferentes proveedores que te van a brindar
    //ya hechitos las dependencias que necesita tu clase Agenda
    //para existir
    @Provides
    fun provideListContacts(): List<Contacto> {
        return listOf(
            Contacto(
                "Victor",
                "7564321"
            ),
            Contacto(
                "Paola",
                "1234567"
            ),
            Contacto(
                "Marcelo",
                "7654321"
            ),
            Contacto(
                "Leandro",
                "7777777"
            )
        )
    }

    @Provides
    fun provideAgenda(contacts: List<Contacto>): Agenda = Agenda("amigos", contacts)
}




















