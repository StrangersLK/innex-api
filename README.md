# innex-api
Innex Kandy shopping app APIs


##Running Mondo and Connect
* docker run -d -p 27017:27107 --name=mongo-innex mongo
* docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' mongo-innex
* Copy IP and past in properties 