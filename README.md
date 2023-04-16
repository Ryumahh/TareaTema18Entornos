# TareaTema18Entornos
Paso 1: Abrir GitHub, crear el repositorio y subir el proyecto de java 

Paso 2: Abrir VSCode, Instalar GitLens y GitGraph y abrir una nueva terminal

Paso 3: Instalar Git en Windows desde: https://git-scm.com/downloads

Paso 4: Ir a GitHub, ir a mi repositorio, le doy a code y copio el HTTPS, luego ejecuto voy a la terminal y me cambio al escritorio con: cd C:\Users\Jose\Desktop y 
luego ejecuto: git clone https://github.com/Ryumahh/TareaTema18Entornos.git para que se clone en mi escritorio

Paso 5: Entro dentro de la carpeta clonada con: cd TareaTema18Entornos

Paso 6: Creo la rama Hotfix con: git branch Hotfix y me muevo a ella con: git checkout Hotfix

Paso 7: Creo las siguientes ramas con: git branch Release - git branch Develop - git branch Feature

Paso 8: Me muevo al directorio donde guardo el .java con: 
cd C:\Users\Jose\Desktop\TareaTema18Entornos\PruebaPractica4-Tarea18\pruebapractica\src 
y añado el archivo App.java al área de preparación con el comando: git add App.java 

Paso 9: Me muevo a la rama Feature con el comando: git checkout Feature

Paso 10: Modifico el archivo App.java añadiendo otra funcionalidad, por ejemplo, 
la conversión a pesos mexicanos. Luego añado el archivo al área de preparación con el comando: git add App.java

Paso 11: Confirmo los cambios realizados en el archivo App.java con el comando: git commit -m "Añadida función de conversión a pesos mexicanos"

Paso 12: Me muevo a la rama Develop con el comando: git checkout Develop

Paso 13: Fusiono la rama Hotfix con la rama Develop con el comando: git merge Hotfix

Paso 14: Me muevo a la rama Develop con el comando: git checkout Develop.

Paso 15: Me muevo a la rama Hotfix con el comando: git checkout Hotfix.

Paso 16: Elimino la funcion de convertir a yenes en Hotfix para provocar un error, y uso git add App.java

Paso 17: Confirmo el cambio de la eliminación de Yenes con git commit -m "Eliminado de conversión a Yenes"

Paso 18:  Me muevo a la rama Develop con el comando: git checkout Develop

Paso 19: Fusiono la rama Hotfix con la rama Develop con el comando: git merge Hotfix, provocando error

Paso 20: Soluciono el error de conflicto de versiones y lo mando todo a GitHub con: git push --all
