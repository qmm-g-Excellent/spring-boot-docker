FROM frolvlad/alpine-oraclejdk8:slim

RUN mkdir -p /usr/src/app
ADD ./build/libs/demo.jar  /usr/src/app

WORKDIR  /usr/src/app
EXPOSE 8002

#CMD命令是在运行docker容器的时候，才会运行该CMD指定的命令
CMD java -jar demo.jar


