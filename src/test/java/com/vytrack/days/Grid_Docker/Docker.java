package com.vytrack.days.Grid_Docker;

public class Docker {
    /*

    Docker (containers): put java, chrome browser, selenium grid for our project. All necessary things is packed into 1 box (container)
    Docker: is easier way to create, deploy, run app by using containers. container allows developer to package up
            the app with parts need such as: librariies, dependencies.
    Docker: containers are isolated but share OS kernel (where appropriate librarires)
    containers vs VMS(virtual machines): containers are way faster, OS, less memory space, less ram usage
    containers are linux or windows based
    aws: is secure cloud service platform, offer database
    EC2: is a web service
    Linux:Open source operation system. Advantage: simple, open source, easy to use, stable, secured.
    Unix: It is a copy paste of Linux, same
    SSH (secure shell): it allows you to connect to a remote computer running as SSH server. once u connected
                        your file is going to be encrypted, so no hacking. Get SSH connection to make it secure.
              Note: we gonna use SSH to get data from github. it has 2 keys, 1 private(client) and 1 public
    VPN: is secure network.
    t2.micro (Instance type in EC2): it means free version, micro means slow, large means fast.
    STOP: stop ur server if you do not want to be charged

    ISTNALLATION
    Service=> AWS=>ec2=> launce instance= >"type cybertek"=>community AMIs=> ceybertek docker grid=>t2micro
                =>review and launch=> launch=> create and new key pair and "myserver" put as key=>download key pair=>
                launch instances=> GO BACK TO => service=>EC2

    Open terminal:  choose selenium grid then connect copy server, change root to ec2-user then rigth click on (ssh -i "myserver.pem" root@ec2-18-234-204-71.compute-1.amazonaws.com)
                    download file and gitbash,  1st command: chmod 400 myserver.pem then copy paste what u copied from connect
                    then yes,

docker --version  -->ls --->> cd grid--->>ls--->>cat docker-compose.yml
or
[ec2-user@ip-172-31-87-32 ~]$ docker --version

[ec2-user@ip-172-31-87-32 ~]$ ls    //ls means server, when type ls give u list of files
grid
[ec2-user@ip-172-31-87-32 ~]$ cd grid/
[ec2-user@ip-172-31-87-32 grid]$ ls
docker-compose.yml


    */

}
