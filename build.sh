#!/usr/bin/env bash

mvn clean package -DskipTests
docker build --build-arg JAR_FILE=target/pim-api-0.0.1-SNAPSHOT.jar -t abderrazak/pim-service:0.0.1-snapshot .
