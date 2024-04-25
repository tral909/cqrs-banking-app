To test CDC

Register new user:

`curl -v http://localhost:8080/api/v1/auth/register -H'content-type:application/json' -d'{"name": "Joe", "username": "nagibator007@mail.ru", "password":"12345678"}'`

SELECT from postgres:

dbviewer run in docker
`docker run --name cloudbeaver --rm -ti -p 8088:8978 -v /var/cloudbeaver/workspace:/opt/cloudbeaver/workspace dbeaver/cloudbeaver:latest`

connect in dbviewer to postgres banking db:
localhost:5437/banking

select events table, find ClientCreateEvent

Check event in kafka:

go to kafka from docker CLI

execute: `kafka-console-consumer --bootstrap-server localhost:9092 --topic events --from-beginning`

It is events.json in our project - ClientCreateEvent in postgres banking event table


