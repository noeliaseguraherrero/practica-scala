## 1.1. Entorno 1 — JupyterLab + Almond Kernel + Scala 2.12.21

Este primer entorno se apoya en JupyterLab junto con el kernel Almond para poder ejecutar Scala.

### Instalar JupyterLab

JupyterLab necesita Python instalado en el sistema, ya que se distribuye como un paquete de `pip`. Antes de instalarlo, conviene comprobar que Python está disponible y actualizar `pip` a su última versión para evitar problemas durante la instalación.

1. Comprobar que tenemos instalado python

![comprobacion-python](../imagesParte1/comprobacion-python.png)

2. Actualizar pip

![actualizar-pip](../imagesParte1/actualizar-zip.png)

3. Instalar JupyterLab y comprobamos la version

![instalar-jupyterlab](../imagesParte1/instalar-jupyterlab.png)

4. Iniciar JupyterLab

![iniciar-jupyterlab](../imagesParte1/iniciar-jupyterlab.png)
![iniciar-jupyterlab2](../imagesParte1/iniciar-jupyterlab2.png)


### Instalar Almond Kernel

JupyterLab por sí solo no sabe ejecutar Scala, por lo que es necesario instalar Almond, el kernel que permite a Jupyter interpretar y ejecutar código Scala. Almond se descarga a través de Coursier.

1. En la powerShell: Ir a tu carpeta de usuario y Descargar Coursier

![descargar-coursier](../imagesParte1/descargar-coursier.png)

2. Instala el kernel en Jupyter

![instalacion-kernel](../imagesParte1/instalacion-kernel.png)

3. Iniciar en JupyterLab

![iniciar-jupyterlan-scala](../imagesParte1/iniciar-jupyterlan-scala.png)

### Verificar la versión de Scala

Una vez arrancado JupyterLab con el kernel de Scala disponible, se crea un nuevo notebook y se ejecuta un pequeño fragmento de código para confirmar que la versión de Scala cargada es la 2.12.21, tal y como se requiere para este entorno.

1. Crear un nuevo Notebook de Scala y ejecutar el código de verificación

![notebook-codigo-verificacion](../imagesParte1/notebook-codigo-verificacion.png)

### Ejecutar código Scala

Por último, se comprueba que el entorno funciona correctamente ejecutando distintos fragmentos de código Scala en celdas independientes.

1. Creamos una celda y ejecutamos lo siguiente:

![1-celda-scala](../imagesParte1/1-celda-scala.png)

2. Ahora realizamos la operación numérica

![2-celda-scala](../imagesParte1/2-celda-scala.png)

3. En una tercera celda creamos una colección sencilla

![3-celda-scala](../imagesParte1/3-celda-scala.png)