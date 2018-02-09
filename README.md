
####  Run the app locally
Run the app with gradle:
```
$ ./gradlew bootRun
```
then application can be tested with curl: (in a separate terminal)
```
$ curl -X GET http://localhost:8080/hello
```

#### Run the app in a docker container
Build the app with gradle:
```
$ ./gradlew build
```
Then build the docker image:
```
$ docker build --tag=example-app:latest --rm=true .
```
And finally run the docker image
```
$ docker run --name=example-app --publish=8080:8080 example-app:latest
```

#### Publish to AWS ECR
get docker login
```
$ aws ecr get-login --no-include-email --region us-east-1
```
```
$ [docker login command returned by "aws ecr get-login.."]
```

Then build the application and image:
```
$ ./gradlew build
$ docker build -t example-app --rm=true
```
Tag and push
```
$ docker tag example-app:latest $SERVER/$REPOSITORY:latest
$ docker push $SERVER/$REPOSITORY:latest
```