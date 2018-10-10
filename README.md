# sharding-jdbc-demo

* docker build -t sharding_db .

* docker run --name sharding-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=my-secret-pw -d sharding_db:latest
* docker exec -i -t  sharding-mysql /bin/bash
* mysql -V
