# Sample Project integrate Spring RDMS CDC Kafka Elasticsearch

Step:
1. Enable binlog MySql via edit my.cnf

```
server-id         = 223344
log_bin           = mysql-bin
binlog_format     = row
binlog_row_image  = full
expire_logs_days  = 10

#optional
gtid_mode                 = on
enforce_gtid_consistency  = on

```
2. Use the [Confluent Hub client](https://docs.confluent.io/current/connect/managing/confluent-hub/client.html) to install this connector with MySql and Elasticsearch

``` 
confluent-hub install debezium/debezium-connector-mysql:0.9.4 
```
```
confluent-hub install confluentinc/kafka-connect-elasticsearch:latest
```
4. Start confluent
```
confluent start
```
3. Open Postman, make POST request with following body to create Connector
  - Mysql Connector
  ```
  {
    "name": "demo-mysql-connector",
    "config": {
      "connector.class": "io.debezium.connector.mysql.MySqlConnector",
        "database.hostname": "localhost",
        "database.port": "3306",
        "database.user": "root",
        "database.password": "root",
        "database.server.id": "223344",
        "database.server.name": "demo",
        "database.history.kafka.bootstrap.servers": "localhost:9092",
        "database.history.kafka.topic": "dbhistory.demo" ,
        "include.schema.changes": "true"
    }
  }
  ```
  - Elastic Connector
  ```
  {
    "name": "es-connector",
    "config": {
        "connector.class": "io.confluent.connect.elasticsearch.ElasticsearchSinkConnector",
        "tasks.max": "1",
        "topics": "demo.test_cdc.employee",
        "connection.url": "http://localhost:9200",
        "key.ignore": "true",
        "schema.ignore": "true",
        "type.name": "type.name=kafka-connect"
    }
  }
  ```
