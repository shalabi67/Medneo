#docker build -t shalabi67/servicea .
#docker run -p 9090:9090 -d --name servicea shalabi67/servicea

# our base image
FROM lwieske/java-8:jre-8u121

COPY servicea-0.0.1-SNAPSHOT.jar /var/servicea/servicea.jar

EXPOSE 9091

CMD ["/var/servicea/servicea.jar"]