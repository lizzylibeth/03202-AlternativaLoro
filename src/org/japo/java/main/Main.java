/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //CONSTANTES
        final String NOMBRE_AMO = "Sócrates";
        final String MSG_SI = "¡Ave César!";
        final String MSG_NO = "¡Sócrates socorro!";

        //VARIABLES
        String nombrePersona;

        //Cabecera
        System.out.println("Alternativa Loro");
        System.out.println("================");

        //Persona que se acerca
        System.out.print("Persona que se acerca ..: ");
        nombrePersona = SCN.nextLine().toLowerCase();

        //separador
        System.out.println("---");

        //Dueño del loro
        System.out.println("Dueño del loro .........: " + NOMBRE_AMO);

        //separador
        System.out.println("---");

        //MENSAJE DEL LORO
        if (nombrePersona.equals(NOMBRE_AMO.toLowerCase())) {

            //Si el nombre de la persona que se acerca ES el dueño
            System.out.println("Mensaje Loro ...........: " + MSG_SI);

        } else {

            //Si el nombre de la persona que se acerca NO ES el dueño
            System.out.println("Mensaje Loro ...........: " + MSG_NO);

        }

    }//main

}//class
