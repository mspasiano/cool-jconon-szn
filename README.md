# Selezioni online Stazione Zoologica Anton Dohrn
<p align="center">
  <a href="https://github.com/consiglionazionaledellericerche/cool-jconon-szn/blob/master/LICENSE">
    <img src="https://img.shields.io/badge/License-AGPL%20v3-blue.svg" alt="Cool Jconon is released under the GNU AGPL v3 license." />
  </a>
  <a href="https://mvnrepository.com/artifact/it.cnr.si/cool-jconon-szn">
    <img alt="Maven Central" src="https://img.shields.io/maven-central/v/it.cnr.si/cool-jconon-szn.svg?style=flat" alt="Current version on maven central.">
  </a>
</p>

## Run

#### Prerequisites Docker and docker-compose
```
git clone https://github.com/consiglionazionaledellericerche/cool-jconon-szn.git
cd docker-compose
docker-compose up -d;docker-compose logs -f
```
### Normally after 120 seconds the application responds

* [Jconon SZN](http://localhost/)
* [Alfresco](http://localhost/alfresco)
* [Solr](http://localhost/solr4)

### Build local
```
mvn clean spring-boot:run -Dspring.profiles.active=szn -Drepository.base.url=http://localhost:9080/alfresco/
```

<http://localhost:8080/>
