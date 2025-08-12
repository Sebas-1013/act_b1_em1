package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
        Estudiante estudiante1 = new Estudiante("Ana", 20, 8.5);
        Estudiante estudiante2 = new Estudiante("Luis", 22, 7.2);
        // 2. Mostrar la información de ambos estudiantes
        System.out.println("--- Información de Estudiantes ---");
        estudiante1.mostrarInformacion();
        System.out.println();
        estudiante2.mostrarInformacion();
        // 3. Modificar algún atributo usando un setter
        estudiante1.setPromedio(9.0);
        estudiante2.setEdad(23);
        // 4. Mostrar la información actualizada
        System.out.println("\n--- Información Actualizada de Estudiantes ---");
        estudiante1.mostrarInformacion();
        System.out.println();
        estudiante2.mostrarInformacion();

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
    Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 60000.0); // Precio en COP
        // 2. Crear un libro usando el constructor con solo titulo y autor
    Libro libro2 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 80000.0); // Precio en COP
        // 3. Mostrar información de ambos libros
        System.out.println("\n--- Información de Libros ---");
        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
        // 4. Aplicar descuento usando ambas versiones del método
        libro1.aplicarDescuento(10); // 10% de descuento
        libro2.aplicarDescuento(20, 10000); // 20% de descuento, máximo 10000
        // 5. Mostrar información actualizada de los libros
        System.out.println("\n--- Información Actualizada de Libros ---");
        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
    }
}