curl -i -X POST -d "client_id=my-client-with-secret&client_secret=secret&grant_type=client_credentials" http://localhost:8080/oauth2/oauth/token

curl "http://my-client-with-secret:secret@localhost:8080/oauth2/oauth/token" -d grant_type=client_credentials -d client_id=my-client-with-secret

curl -i -H "Authorization: Bearer e1395350-b6cb-46d6-89e6-768920f75040" http://localhost:8080/oauth2/index.jsp

curl -i "http://marissa:koala@localhost:8080/oauth2/index.jsp"

curl -i -X POST -d "client_id=my-client-with-registered-redirect&grant_type=client_credentials" http://localhost:8080/oauth2/oauth/token