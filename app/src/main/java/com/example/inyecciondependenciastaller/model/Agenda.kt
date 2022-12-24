package com.example.inyecciondependenciastaller.model

/****
 * Project: InyeccionDependenciasTaller
 * From: com.example.inyecciondependenciastaller.model
 * Created by: Victor Sanjines Lopez on 23/12/2022 at 19:41
 * More info: www.relativity.com.bo
 * All rights reserved 2022
 ****/

//Inyecta estas dependencias a nivel de constructor de la clase
//la clase Agenda depende de otros para existir
data class Agenda(
    val type: String,
    val contacts: List<Contacto>
)
























