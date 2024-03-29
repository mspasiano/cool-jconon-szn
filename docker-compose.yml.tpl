cool-jconon-szn:
  image: docker.si.cnr.it/##{CONTAINER_ID}##
  mem_limit: 1g
  read_only: true
  environment:
  - LANG=it_IT.UTF-8
  - LANGUAGE=it_IT:it
  - LC_ALL=it_IT.UTF-8
  - REPOSITORY_BASE_URL=http://alfresco-community-szn.test.si.cnr.it/alfresco/
  - SERVICE_TAGS=webapp
  - SERVICE_NAME=##{SERVICE_NAME}##
  labels:
  - SERVICE_NAME=##{SERVICE_NAME}##
  volumes:
  - ./webapp_logs:/logs
  - /tmp
  - /work/
  command: java -Dspring.profiles.active=szn -Xmx256m -Xss512k -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8787 -Duser.language=it -Djava.security.egd=file:/dev/./urandom -jar /opt/selezioni-szn.war
