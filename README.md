## Server

```
mvn compile exec:java -Dexec.mainClass="com.visa.app.server.ServerApp" -Dexec.args="12345 /Users/tengchoonhong/Desktop/visa/day_6/sdf-workshop6/cookie_file.txt"
```

## Client

```
mvn compile exec:java -Dexec.mainClass="com.visa.app.client.ClientApp" -Dexec.args="0.0.0.0:12345"
```