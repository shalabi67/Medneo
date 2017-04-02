#docker build -t shalabi67/serviceb .
#docker run -p 9091:9091 --name -d serviceb shalabi67/serviceb

# our base image
FROM lwieske/java-8:jre-8u121

COPY serviceb-0.0.1-SNAPSHOT.jar /var/serviceb/serviceb.jar

EXPOSE 9091

CMD ["/var/serviceb/serviceb.jar"]