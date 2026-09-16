# Práctica de programación básica con Scala

## Autor

Nombre y apellidos: Noelia Segura Herrero

## Entorno

- **Sistema operativo:** Windows 11
- **Scala:** 2.12.21
- **Java:** JDK 17 (Eclipse Temurin)

---

## Parte 1 — Entornos de trabajo

En esta primera parte de la práctica se han configurado tres entornos de desarrollo independientes capaces de compilar y ejecutar código con **Scala 2.12.21**:

### Entorno 1: JupyterLab + Almond Kernel
- **Descripción:** Entorno interactivo basado en celdas de Jupyter utilizando el kernel de Scala (Almond).
- **Herramientas utilizadas:** Python, JupyterLab, Coursier, Almond Kernel, Scala 2.12.21.
- [Ver documentación detallada](parte1/README.md)

### Entorno 2: Visual Studio Code + Metals + sbt
- **Descripción:** Editor de código ligero complementado con el servidor de lenguaje Metals y sbt como herramienta de compilación y gestión de dependencias.
- **Herramientas utilizadas:** Visual Studio Code, extensión Scala (Metals), JDK 17, sbt 2.0.9, Scala 2.12.21.
- [Ver documentación detallada](parte1/README.md)

### Entorno 3: IntelliJ IDEA Community + sbt
- **Descripción:** Entorno de desarrollo integrado (IDE) profesional con soporte oficial para Scala mediante plugin y sbt.
- **Herramientas utilizadas:** IntelliJ IDEA Community Edition (versión 2025.2), Plugin de Scala, JDK 17, sbt 2.0.9, Scala 2.12.21.
- [Ver documentación detallada](parte1/README.md)

---

## Estructura del Repositorio

El repositorio se encuentra organizado de la siguiente manera para facilitar su navegación y revisión:

```text
practica-scala/
│
├── README.md
│
├── parte1/
│   ├── README.md
│   │
│   ├── notebook/
│   │   └── entorno-scala.ipynb
│   │
│   ├── vscode/
│   │   └── scala-vscode/
│   │       ├── build.sbt
│   │       └── src/
│   │
│   └── intellij/
│       └── scala-intellij/
│           ├── build.sbt
│           └── src/
│
└── images/
    ├── jupyter-inicio.png
    ├── jupyter-almond.png
    ├── jupyter-scala-version.png
    ├── vscode-metals.png
    ├── vscode-sbt-run.png
    ├── intellij-plugin-scala.png
    ├── intellij-jdk17.png
    └── intellij-run.png
```