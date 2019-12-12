#Start Selenium Hub
docker run -d -p 4446:4444 --name selenium-hub -P selenium/hub
docker run -d -P --link selenium-hub:hub selenium/node-chrome-debug
docker run -d -P --link selenium-hub:hub selenium/node-chrome-debug
docker run -d -P --link selenium-hub:hub selenium/node-chrome-debug 
docker run -d -P --link selenium-hub:hub selenium/node-firefox-debug

#Stop 
#docker stop $(docker ps -a -q)
#docker rm $(docker ps -a -q)
