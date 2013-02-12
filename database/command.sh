curl -i -X POST -d "client_id=my-client-with-secret&client_secret=secret&grant_type=client_credentials" http://localhost:8080/oauth2/oauth/token

curl "http://my-client-with-secret:secret@localhost:8080/oauth2/oauth/token" -d grant_type=client_credentials -d client_id=my-client-with-secret

curl -i -H "Authorization: Bearer e1395350-b6cb-46d6-89e6-768920f75040" http://localhost:8080/oauth2/index.jsp

curl -i "http://marissa:koala@localhost:8080/oauth2/index.jsp"

curl -i -X POST -d "client_id=my-client-with-registered-redirect&grant_type=client_credentials" http://localhost:8080/oauth2/oauth/token

curl -i -X POST -d "client_id=my-trusted-client&grant_type=password&username=marissa&password=koala" http://localhost:8080/oauth2/oauth/token




##Web Server based app request##
http://localhost:8080/oauth2/oauth/authorize?response_type=code&client_id=easylocate&scope=read&redirect_uri=http://localhost:8080/web

http://localhost:8080/oauth2/oauth/token?grant_type=authorization_code&code=B9edZO&redirect_uri=http://localhost:8080/web&client_id=easylocate&client_secret=secret

##Browser Based request#
http://localhost:8080/oauth2/oauth/authorize?response_type=token&client_id=easylocate&redirect_uri=http://localhost:8080/web&scope=read

##Password Based Authentication
curl -i -X POST -d "client_id=easylocate&grant_type=password&username=admin&password=admin&client_secret=secret" http://localhost:8080/oauth2/oauth/token

##Client Credential Based##
curl -i -X POST -d "client_id=easylocate&grant_type=client_credentials&client_secret=secret" http://localhost:8080/oauth2/oauth/token