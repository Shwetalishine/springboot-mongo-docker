
# springboot-mongodb-docker
Deploying Spring Boot and MongoDB as Containers Using Docker and Docker Compose

Steps & Commands

- Step 1: pull mongo image from docker hub 
  command: **` docker pull mongo:latest `**
  

- Step 2: run mongo image
  command: **` docker run -d -p 27017:27017 --name mongodb mongo:latest `**

- Step 3: dockerize spring boot application 
  command: **` docker build -t springboot-mongodb:1.0 . `**

- Step 4: run spring boot docker image and link that container to mongo container 
   command: **` docker run -p 8080:8080 --name springboot-mongodb --link mongodb:mongo -d springboot-mongodb:1.0 `**
   
- Step 5: check docker running containers  
  command: **` docker ps `**  - It should display two container ids

- Step 6: check logs of spring boot image 
  command: **` docker logs springboot-mongodb `**
  
- Step 6: if all good access your api  :tada:
```bash
curl --location --request POST 'http://localhost:8080/books' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":1,
    "bookName":"Springboot",
    "authorName":"Shwetali"
}'
```
- [x] login to mongo terminal to verify records **` docker exec -it mongodb bash `**
- type mongo and enter
- show dbs
- use book
- show collections
- db.book.find().pretty()

**Use Docker Compose**

- [x] Kill running container:
```
docker rm -f <containerId>
```

#### docker-compose.yml

application.yml

version : "3"
services:
  mongodb:
    image: mongo:latest
    container_name: "mongodemo"
    ports:
      - 27027:27017
  springboot-mongodb:
    image: springboot-mongodb:1.0
    container_name: springboot-mongodb
    ports:
      - 8080:8080
    links:
      - mongodb


- [x] navigate to resources folder:
```
springboot-mongo-docker and run docker-compose up
```
