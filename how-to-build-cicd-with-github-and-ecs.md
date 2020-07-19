# How to build cicd pipeline with github action and aws ECS

## step1: Create a new user with full ECR access, and store its credentials in github secrets

## step2: Create a new repository in aws ECR for docker image

## step3: Create a Dockerfile to dockerlize your app in the root path of your code repository

## step4: Create a cluster, a task definition and a service in aws ECS

## step5: Create a Github action in repository , choose: deploy to aws, and follow its instruction to complete configration

###  at the beginning of  aws.yml file, define an event to triger the pipleine ,for example:

```
on:
  push:
    branches:
      - master
      
```

### if your code need to compile , define the environment and action in steps, for example

```
    - name: Build with Maven
      run: mvn -B package --file pom-java8.xml
```
