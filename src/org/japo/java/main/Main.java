/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpon@gmail.com.
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

import java.util.Scanner;

/**
 *
 * @author José A. Pacheco Ondoño - joanpon@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar Scanner
        Scanner scn = new Scanner(System.in);

        // Variable
        final boolean permisoOK;

        try {
            // Leer estado
            System.out.print("Permiso de circulación ...: ");
            permisoOK = scn.nextBoolean();

            // Borrar buffer
            scn.nextLine();

            // Mensaje
            System.out.printf("Permiso de circulación ...: %b\n", permisoOK);
        } catch (Exception e) {
            // Mensaje
            System.out.println("Entrada incorrecta");

            // Borrar buffer
            scn.nextLine();        }
    }
}