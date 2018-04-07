FROM 100.125.0.198:20202/hwcse/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/csedemo-0.0.1-SNAPSHOT.jar .
ADD target/lib ./lib
ADD start.sh .

EXPOSE 8087 8087

ENTRYPOINT ["sh", "/home/apps/start.sh"]
