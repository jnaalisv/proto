
```
$ ./gradlew bootRun
```

```
$ curl -X GET http://localhost:8080/hello
```

```
$ docker build --tag=example-app:latest --rm=true .
```

```
docker run --name=example-app --publish=8080:8080 example-app:latest
```