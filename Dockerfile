FROM java:8u77-jre-alpine                                           
  		  
ENV PORT 8080

ENV DIR /old-cars-api     

EXPOSE 8080

WORKDIR $DIR

COPY target/ /old-cars-api/

CMD java -cp "dependency/*":classes app.tools.examples.Main