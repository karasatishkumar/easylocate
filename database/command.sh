curl -i -X POST -d "client_id=my-client-with-secret&client_secret=secret&grant_type=client_credentials" http://localhost:8080/oauth2/oauth/token

curl "http://my-client-with-secret:secret@localhost:8080/oauth2/oauth/token" -d grant_type=client_credentials -d client_id=my-client-with-secret

curl -i -H "Authorization: Bearer e1395350-b6cb-46d6-89e6-768920f75040" http://localhost:8080/oauth2/index.jsp

curl -i -H "Authorization: Bearer 2ef4e853-92ec-4f11-9638-ad97b6835b9f" http://localhost:8080/roleservice/role

curl -i "http://marissa:koala@localhost:8080/oauth2/index.jsp"

curl -i -X POST -d "client_id=my-client-with-registered-redirect&grant_type=client_credentials" http://localhost:8080/oauth2/oauth/token

curl -i -X POST -d "client_id=my-trusted-client&grant_type=password&username=marissa&password=koala" http://localhost:8080/oauth2/oauth/token




##Web Server based app request##
http://localhost:8080/oauth2/oauth/authorize?response_type=code&client_id=easylocate&scope=read&redirect_uri=http://localhost:8080/web

http://localhost:8080/oauth2/oauth/token?grant_type=authorization_code&code=H7Dfm3&redirect_uri=http://localhost:8080/roleservice/role&client_id=easylocate&client_secret=secret

##Browser Based request#
http://localhost:8080/oauth2/oauth/authorize?response_type=token&client_id=easylocate&redirect_uri=http://localhost:8080/web&scope=read
http://localhost:8080/roleservice/oauth/authorize?response_type=token&client_id=easylocate&scope=read

##Password Based Authentication
curl -i -X POST -d "client_id=easylocate&grant_type=password&username=admin&password=admin&client_secret=secret" http://localhost:8080/oauth2/oauth/token

##Client Credential Based##
curl -i -X POST -d "client_id=easylocate&grant_type=client_credentials&client_secret=secret" http://localhost:8080/oauth2/oauth/token

curl -i -H "Authorization: Bearer 7e14c979-7039-49d0-9c5d-854efe7f5b38" http://localhost:8080/userservice/api/user/1

curl -i -X POST -d "client_id=easylocate&grant_type=client_credentials&client_secret=secret" http://localhost:8080/roleservice/oauth/token

http://localhost:8080/roleservice/api/oauth/authorize?response_type=token&client_id=easylocate&redirect_uri=http://localhost:8080/web&scope=read

http://localhost:8080/roleservice/oauth/authorize?response_type=code&client_id=easylocate&scope=read&redirect_uri=http://localhost:8080/web

http://localhost:8080/oauth2/oauth/authorize?response_type=token&client_id=easylocate&redirect_uri=http://localhost:8080/web&scope=read


http://localhost:8080/sparklr/oauth/authorize?response_type=token&client_id=tonr&scope=read&redirect_uri=http://localhost:8080/web


http://localhost:8080/sparklr/oauth/authorize?response_type=token&client_id=tonr&scope=read

curl -i -H "Authorization: Bearer 881efaf8-13ab-4b67-9364-e28283c21226" http://localhost:8080/sparklr/photos

881efaf8-13ab-4b67-9364-e28283c21226