```ver todas las imagenes ```
docker images
```elminar un repositorio```
docker rmi nginx
```decargar el servidor nginx```
docker pull nginx:latest
```muestra el de la imagen```
docker image inspect nginx

```Ejecutar ejecutando y creando un container```
    docker run -d -p 8040:80 --name web nginx

```Detener container```
docker stop web    


```Eliminar container```
docker rm web    

```Detalla los container docker```
docker ps




