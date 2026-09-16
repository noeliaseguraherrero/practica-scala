## 1.2. Entorno 2 — Visual Studio Code + Metals + Scala 2.12.21 + JDK 17 + sbt

En este segundo entorno se monta el flujo de trabajo con Visual Studio Code como editor y Metals como servidor de lenguaje (LSP) para Scala. A diferencia del Entorno 1, aquí se trabaja con proyectos gestionados por sbt en lugar de notebooks.

1. Ejecutar winget

![winget-JDK17](../imagesParte1/winget-JDK17.png)

2. Comprobamos la version

![comprobar-version-java](../imagesParte1/comprobar-version-java.png)

### Instalar Visual Studio Code

1. Ya tenía la instalación hecha con anterioridad

![vscode-instalado](../imagesParte1/vscode-instalado.png)

2. Versión instalada:

![version-vscode](../imagesParte1/version-vscode.png)

### Instalar Metals

1. Buscamos la extensión en Visual Studio Code

![extension-metals](../imagesParte1/extension-metals.png)

2. Versión instalada

![version-metals](../imagesParte1/version-metals.png)

### Instalar y comprobar sbt

1. Buscar el ID correcto de sbt

![buscarID-sbt](../imagesParte1/buscarID-sbt.png)

2. Ejecutar winget con sbt.sbt

![winget-sbt](../imagesParte1/winget%20sbt.png)

3. Verificar versión

![version-sbt](../imagesParte1/sbt-versiom.png)

### Crear un proyecto Scala con sbt

1. Creamos la estructura de carpetas

![estructura-proyecto-scala](../imagesParte1/estructura-proyecto-scala.png)

### Configurar Scala 2.12.21

1. Crear y configurar build.sbt

![crear-buildSbt](../imagesParte1/crear-buildSbt.png)

2. Comprobamos que se ha creado correctamente

![comprobacion-BuildSbt](../imagesParte1/comprobacion-BuildSbt.png)

### Crear el programa

Una vez configurado el proyecto, se crea el archivo `Main.scala` dentro de `src/main/scala` con un programa de ejemplo sencillo que sirva para comprobar que todo el entorno funciona correctamente.

1. Crear el archivo Main.scala con el código de ejemplo

![crear-MainScala](../imagesParte1/crear-MainScala.png)

2. Verificación:

![verificarMainScala](../imagesParte1/verificarMainScala.png)

### Importar el proyecto con Metals

Para que Metals pueda ofrecer autocompletado y detección de errores, es necesario abrir la carpeta del proyecto en Visual Studio Code y dejar que Metals lo importe e indexe automáticamente.

1. Abrimos la carpeta creada anteriormente

2. Una vez abierto se importa el proyecto automáticamente y empieza a cargar en la terminal

![importacion-metals](../imagesParte1/importacion-metals.png)

### Compilar el proyecto

Antes de ejecutar el programa, se compila el proyecto para comprobar que no existen errores de sintaxis ni de dependencias.

1. Ejecutar el comando de compilación

![compilacion-proyecto](../imagesParte1/compilacion-proyecto.png)

### Ejecutar el proyecto

Por último, se ejecuta el proyecto desde sbt para comprobar que el programa Scala funciona correctamente de principio a fin.

1. Ejecutamos:

![ejecucion-proyecto](../imagesParte1/ejecucion-proyecto.png)
