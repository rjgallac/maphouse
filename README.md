# Property Map

docker run --name maphouse --network=host -e MARIADB_DATABASE=maphouse -e MYSQL_ROOT_PASSWORD=root -d mariadb:10.3

curl  -X POST http://localhost:8080/property -H "Content-Type: application/json" -d '{"address":"tes address"}'

curl  http://localhost:8080/property -H "Content-Type: application/json" 


