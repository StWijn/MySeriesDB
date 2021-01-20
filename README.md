# MySeriesDB

In the midst of our current technological advancements, and the thousands of options with regards to leisure activities we are able to choose from everyday, one of the bigger problems of life that one could face is losing track of series. Series that should be on your to-watch list, or series that you already watched a number of years ago and you totally forgot about (in the latter case, this can potentially lead to a lot of wasted time when figuring out at the end of episode 1 that you have already seen this show a number of years ago...)

*As such, MySeriesDB was made.*

## Technologies and prerequisites
*Used:* Eclipse IDE, Spring MVC, Hibernate, MySQL and Tomcat

Included in this project are the necessary Spring and Hibernate JAR files. One needs to download and install [Tomcat](http://tomcat.apache.org/) aswell as have [MySQL](https://dev.mysql.com/downloads/mysql/) up and running. Relevant MySQL scripts are provided below.


![Image of MySeriesDB](https://i.imgur.com/lwKFNuQ.png)

### Setting up

Open MySQL Workbench in a local instance. Make sure you already have a user with all privileges.  If not, run the create-user.sql script in /src/com/stwijn/myseriesdb. Next, run the script create-myseries-db.sql.

Import project into Eclipse, right click the project and click "run on server". Select "Tomcat v9.0 Server" and leave the defaults, click on "finish".
You can now go to http://localhost:8080/myseries-db/ in your internet browser or your IDE, and keep track of your favorite series!

