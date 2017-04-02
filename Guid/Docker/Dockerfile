# docker build -t shalabi67/guid .
#docker run -p 9092:9092 -d --name guid shalabi67/guid
# our base image
FROM lwieske/java-8:jre-8u121

# install Python modules needed by the Python app
COPY guid-0.0.1-SNAPSHOT.jar /var/guid/guid.jar
#RUN ln -s /var/guid/guid.jar /etc/init.d/guid
#RUN /etc/init.d/guid start

EXPOSE 9092

CMD ["/var/guid/guid.jar"]
