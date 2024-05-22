package com.example.demo.core.domain

import com.example.demo.shared.enums.Carrera
import kotlin.random.Random

/*
* Las data class en Kotlin son clases diseñadas para almacenar datos de manera concisa,
* generando automáticamente métodos útiles como equals(), hashCode(), toString(), y copy().
* */
data class Estudiante(

    var matricula: String,
    var nombre: String,
    var apellidos: String,
    var edad: Int,
    var carrera: Carrera,
    var grupo: String

) {

    constructor() : this(
        matricula = "",
        nombre = "",
        apellidos = "",
        edad = 0,
        carrera = Carrera.`Ingeniería de Software`,
        grupo = ""
    )

    /*  Reglas del negocio */

    fun generarMatricula () {
        matricula = "S22004${Random.nextInt(100, 1000)}"
    }

    fun asignarGrupo(semestre : Int): String {
        if (semestre > 0 && semestre < 9 ){

            if (semestre == 1){
                return "101"
            } else if (semestre == 2){
                return "201"
            } else if (semestre == 3){
                return "301"
            } else if (semestre == 4){
                return "401"
            } else if (semestre == 5){
                return "501"
            } else if (semestre == 6){
                return "601"
            } else if (semestre == 7){
                return "701"
            } else if (semestre == 8){
                return "801"
            }
        } else {
            return "Semestre no existente"
        }
        return "Semestre no válido"
    }

    fun asignarGrupoDos(semestre : Int): String {

        when(semestre){
            1 -> return "101"
            2 -> return "201"
            3 -> return "301"
            4 -> return "401"
            5 -> return "501"
            6 -> return "601"
            7 -> return "701"
            8 -> return "801"
            else -> return "Semestre no existente"
        }

    }

    /*
    * El principio "Don't Repeat Yourself" (DRY) se refiere a evitar la duplicación de código
    * o lógica en un sistema para mejorar la mantenibilidad y reducir errores.
    * En lugar de repetir código, se debe abstraer y reutilizar componentes o funciones para
    * centralizar el conocimiento y facilitar futuros cambios.
    * */
    fun asignarGrupoDry(semestre: Int) {

        require(semestre in 1..8){
            "Semestre no existente"
        }

        val grupos = listOf("ISW101", "ISW201", "ISW301", "ISW401", "ISW501", "ISW601", "ISW701", "ISW801")
        grupo = grupos[semestre-1]
    }

}