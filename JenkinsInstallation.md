# Jenkins Installation

```shell
# install java
yum install java-11-openjdk wgte -y
# configure jenkins repo
wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat-stable/jenkins.repo
rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key
# install jenkins
yum install jenkins
# start jenkins service
systemctl start jenkins
systemctl enable jenkins
```