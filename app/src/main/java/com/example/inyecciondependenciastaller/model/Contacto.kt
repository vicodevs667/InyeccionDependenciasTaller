package com.example.inyecciondependenciastaller.model

/****
 * Project: InyeccionDependenciasTaller
 * From: com.example.inyecciondependenciastaller.model
 * Created by: Victor Sanjines Lopez on 23/12/2022 at 19:39
 * More info: www.relativity.com.bo
 * All rights reserved 2022
 ****/
data class Contacto(
    val name: String,
    val phone: String
) {
    override fun toString(): String {
        return "Nombre: $name, Telefono: $phone\n"
    }
}
