#!/usr/bin/env bash

#编译项目
gradle clean build

#打包项目成镜像
docker build -t demo .

#启动项目成容器，-f是file的意思
#docker-compose -f docker-compose.yml up
docker-compose  up


