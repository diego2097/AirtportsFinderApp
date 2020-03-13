# Escuela Colombiana de Ingeniería Julio Garavito - Arquitecturas de Software ARSW - Parcial Segundo Tercio



## Para ejecutar el proyecto se debe utilzar el siguiente comando 


```
mvn exec:java -Dexec.mainClass="edu.eci.arsw.AirportsFinderApp.AirportsFinderAppApplication"
```


## Como extender la aplicacion 

si se deseara extender el programa, por ejemplo agregar nuevas funcionalidades de la api externa, solo se necesitaria agregar un nuevo metodo en la capa de servicios, pasandole los parametros necesarios para que pueda construir 
la url. 



## Diseño 
	
para el diseño de la aplicacion se siguieron los diagramas propuestos en el enunciado, una capa de frontend, que se comunica con una capa de backend la cual esta compuesta por cinco modulos, controladores, servicios, cache 
y la conexion http que se comunica con el api externo y finalmente una capa de modelo. 

## Heroku 

[heroku](https://airportsfinderapp.herokuapp.com/)



## git


https://github.com/diego2097/AirtportsFinderApp
