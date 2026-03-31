# Evaluacion-Modular4---Desarrollo-y-Prueba-de-un-Sistema-de-Gesti-n-de-Servicios
Repositorio de Final del Modulo 4 del Curso Desarrollador de Aplicaciones Full Stack Java Trainee v2.0 0033-1 de Kibernum.

# Sistema de Gestión de Telecomunicaciones (Java)

Este proyecto es una aplicación de consola desarrollada en **Java 17** que permite gestionar el registro de clientes y la contratación de servicios de telecomunicaciones (Internet, Telefonía y Televisión). El sistema aplica principios avanzados de Programación Orientada a Objetos (POO) y pruebas unitarias automáticas.

## 🚀 Funcionalidades

- **Registro de Clientes:** Almacenamiento de RUT y Nombre del usuario.
- **Gestión de Servicios:** Selección dinámica de servicios con cálculo de costos específicos.
- **Resumen Detallado:** Generación de boleta con desglose de servicios y total a pagar.
- **Sistema de Notificaciones:** Simulación de envío de alertas al finalizar el proceso.
  
## 📁 Estructura del Proyecto

- src
├── main
│   └── java
│       └── org
│           └── example
│               ├── Main.java                 
│               ├── model                     
│               │   ├── Cliente.java          
│               │   ├── Servicio.java         
│               │   ├── Internet.java         
│               │   ├── Telefonia.java        
│               │   └── Television.java       
│               └── Servicio                  
│                   ├── AplicacionServicio.java 
│                   └── Notificador.java      
└── test
    └── java
        └── org
            └── example
                └── Servicio
                    └── AplicacionServicioTest.java 

                    
## 👩‍💻 Tecnologías Utilizadas

 - **Java 17 (OpenJDK):** Lenguaje de programación principal (POO).
 - **JUnit 5:** Framework para la creación y ejecución de pruebas unitarias.
 - **Mockito:** Biblioteca para la creación de objetos simulados (Mocks).
 - **Git & GitHub:** Control de versiones y repositorio remoto.
 - **Intellij IDE:** Entorno de desarrollo optimizado. 
 
## 🛠️ Conceptos de Programación Aplicados
El proyecto fue diseñado siguiendo estándares de calidad de software:

* **Herencia y Polimorfismo:**
  Uso de una clase abstracta `Servicio` como base para tipos específicos de servicios.
* **Composición:**
   La clase `Cliente` gestiona una lista dinámica (`ArrayList`) de objetos `Servicio`.
* **Inyección de Dependencias:**
   El sistema de notificaciones se desacopla de la lógica de negocio para facilitar el mantenimiento.
* **Encapsulamiento:**
   Uso riguroso de modificadores de acceso (`private`) y métodos Getter/Setter.
* **Robustez:**

## 🧪 Pruebas Unitarias y Calidad

Se implementó una suite de pruebas robusta utilizando:
- **JUnit 5:** Para validar la lógica de cálculos y creación de objetos.
- **Mockito:** Para simular el comportamiento del `Notificador` y verificar la interacción entre componentes (Mocks).
  

---
Desarrollado en parte por [BTiare10] - 2026
