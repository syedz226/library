def gd(repo)
{
  git 'https://github.com/IntelliqDevops/${repo}.git'
}

def cb()
{
  sh 'mvn package'
}

def cd(jobname,ip,context)
{
  sh 'scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war'
}

def ct(jobname)
{
   sh 'java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar'
}
